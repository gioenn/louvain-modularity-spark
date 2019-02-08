package it.polimi.dagsymb;

import org.apache.spark.api.java.JavaPairRDD;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.api.java.Optional;
import org.apache.spark.broadcast.Broadcast;
import org.apache.spark.graphx.Edge;
import org.apache.spark.graphx.EdgeContext;
import org.apache.spark.graphx.EdgeRDD;
import org.apache.spark.graphx.EdgeTriplet;
import org.apache.spark.graphx.Graph;
import org.apache.spark.graphx.PartitionStrategy;
import org.apache.spark.graphx.TripletFields;
import org.apache.spark.graphx.VertexRDD;

import org.apache.spark.api.java.function.FlatMapFunction;
import org.apache.spark.api.java.function.Function;
import scala.Function1;
import scala.Function3;
import scala.Option;

import org.apache.spark.api.java.function.Function2;
import org.apache.spark.api.java.function.PairFunction;

import scala.Tuple2;
import scala.Tuple3;
import scala.reflect.ClassTag;
import scala.runtime.BoxedUnit;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;


public class Louvain {


	public EdgeRDD<Long> getEdgeRDD(JavaSparkContext sc, LouvainConfig conf) {
		JavaRDD<Edge<Long>> res = sc.<String>textFile(conf.inputFile, conf.parallelism).map(new Function<String, Edge<Long>>() {
			@Override
			public Edge<Long> call(String row) {
				//String[] tokens = Arrays.stream(row.split(conf.delimiter)).map((s) -> s.trim()).toArray(String[]::new);
				String[] tokens = row.split(conf.delimiter);
				for (int i = 0; i < tokens.length; i++) {
					tokens[i] = tokens[i].trim();
				}
				long attr = 1L; 
				if (tokens.length == 3) {
					attr = Long.parseLong(tokens[2]);
				}
				return new Edge<Long>(Long.parseLong(tokens[0]), Long.parseLong(tokens[1]), attr);
			}
		});

		return EdgeRDD.fromEdges(res.rdd(), ClassTag.apply(Long.class), ClassTag.apply(Long.class));
	}

	/**
	 * Generates a new graph of type it.polimi.dagsymb.mock.Graph[VertexState,Long] based on an
     input graph of type.
	 * it.polimi.dagsymb.mock.Graph[VD,Long].  The resulting graph can be used for louvain computation.
	 *
	 */
	public <T> org.apache.spark.graphx.Graph<LouvainData, Long> createLouvainGraph(org.apache.spark.graphx.Graph<T, Long> graph) {

		VertexRDD<Long> nodeWeights = graph.aggregateMessages(new Function1<EdgeContext<T, Long, Long>, BoxedUnit>() {
			@Override
			public BoxedUnit apply(EdgeContext<T, Long, Long> e) {
				e.sendToSrc(e.attr());
				e.sendToDst(e.attr());
				return BoxedUnit.UNIT;
			}

		}, new scala.Function2<Long, Long, Long>() {
			@Override
			public Long apply(Long e1, Long e2) {
				return e1 + e2;
			}

		}, (TripletFields)null, ClassTag.apply(Long.class));//TODO

		return graph.<Long, LouvainData>outerJoinVertices(nodeWeights.toJavaRDD().rdd(), new Function3<Object, T, Option<Long>, LouvainData> () {
			@Override
			public LouvainData apply(Object vid, T data, Option<Long> weightOption) {
				long weight = weightOption.getOrElse(new scala.Function0<Long>() {
					public Long apply() {
						return 0L;
					}
				});
				return new LouvainData((Long) vid, weight, 0L, weight, false);
			}
		}, ClassTag.apply(Long.class), ClassTag.apply(LouvainData.class), /*eq*/null);//TODO

	}

	/**
	 * Creates the messages passed between each vertex to convey
     neighborhood community data.
	 */
	public BoxedUnit sendCommunityData(EdgeContext<LouvainData, Long, Map<Tuple2<Long, Long>, Long>> e) {
		Map<Tuple2<Long, Long>, Long> m1 = Collections.singletonMap(new Tuple2<>(e.srcAttr().community,
				e.srcAttr().communitySigmaTot), e.attr());
		Map<Tuple2<Long, Long>, Long> m2 = Collections.singletonMap(new Tuple2<>(e.dstAttr().community,
				e.dstAttr().communitySigmaTot), e.attr());
		e.sendToSrc(m2);
		e.sendToDst(m1);
		return BoxedUnit.UNIT;
	}

	/**
	 * Merge neighborhood community data into a single message for each vertex
	 */
	public Map<Tuple2<Long, Long>, Long> mergeCommunityMessages(Map<Tuple2<Long, Long>, Long> m1, Map<Tuple2<Long, Long>, Long> m2)  {

		Map<Tuple2<Long, Long>, Long> newMap = new HashMap<>();

		for (Map.Entry<Tuple2<Long, Long>, Long> data : m1.entrySet()){
			Tuple2<Long, Long> k = data.getKey();
			if (newMap.containsKey(k)){
				newMap.put(k, data.getValue() + newMap.get(k));
			}
			else {
				newMap.put(k, data.getValue()/*newMap.get(k)*/);
			}
		}

		for (Map.Entry<Tuple2<Long, Long>, Long> data : m2.entrySet()){
			Tuple2<Long, Long> k = data.getKey();
			if (newMap.containsKey(k)){
				newMap.put(k, data.getValue() + newMap.get(k));
			}
			else {
				newMap.put(k, data.getValue()/*newMap.get(k)*/);
			}
		}

		return newMap;
	}


	/**
	 * Returns the change in modularity that would result from a vertex
     moving to a specified community.
	 */
	public BigDecimal q(
			Long currCommunityId,
			Long testCommunityId,
			Long testSigmaTot,
			Long edgeWeightInCommunity,
			Long nodeWeight,
			Long internalWeight,
			Long totalEdgeWeight) {

		boolean isCurrentCommunity = currCommunityId.equals(testCommunityId);
		BigDecimal M = new BigDecimal(totalEdgeWeight);
		Long k_i_in_L = isCurrentCommunity ? edgeWeightInCommunity + internalWeight : edgeWeightInCommunity;
		BigDecimal k_i_in = new BigDecimal(k_i_in_L);
		BigDecimal k_i = new BigDecimal(nodeWeight + internalWeight);
		BigDecimal sigma_tot = isCurrentCommunity ? new BigDecimal(testSigmaTot).subtract(k_i) : new BigDecimal(testSigmaTot);

		BigDecimal deltaQ = new BigDecimal(0.0);

		if (!(isCurrentCommunity && sigma_tot.equals(BigDecimal.valueOf(0.0)))) {
			deltaQ = k_i_in.subtract(k_i.multiply(sigma_tot).divide(M, 6));
		}

		return deltaQ;
	}


	/**
	 * Join vertices with community data form their neighborhood and
     select the best community for each vertex to maximize change in
     modularity.
	 * Returns a new set of vertices with the updated vertex state.
	 */
	public VertexRDD<LouvainData> louvainVertJoin(
			org.apache.spark.graphx.Graph<LouvainData, Long> louvainGraph,
			VertexRDD<Map<Tuple2<Long, Long>, Long>> msgRDD,
			Broadcast<Long> totalEdgeWeight,
			Boolean even)  {

		// innerJoin[U, VD2](other: RDD[(VertexId, U)])(f: (VertexId, VD, U) => VD2): VertexRDD[VD2]
		return louvainGraph.vertices().innerJoin(msgRDD.toJavaRDD().rdd(), new scala.Function3<Object, LouvainData, Map<Tuple2<Long, Long>, Long>, LouvainData>() {
			@Override
			public LouvainData apply(Object vid, LouvainData louvainData, Map<Tuple2<Long, Long>, Long> communityMessages) {
				Long bestCommunity = louvainData.community;
				Long startingCommunityId = bestCommunity;
				BigDecimal maxDeltaQ = new BigDecimal(0.0);
				Long bestSigmaTot = 0L;


				for (Map.Entry<Tuple2<Long, Long>, Long> data : communityMessages.entrySet()) {

					Tuple2<Long, Long> key = data.getKey();
					Long communityId = key._1;
					Long sigmaTotal = key._2;
					Long communityEdgeWeight = data.getValue();

					BigDecimal deltaQ = q(
							startingCommunityId,
							communityId,
							sigmaTotal,
							communityEdgeWeight,
							louvainData.nodeWeight,
							louvainData.internalWeight,
							totalEdgeWeight.getValue());

					if (deltaQ.compareTo(maxDeltaQ) == 1  || (deltaQ.compareTo(new BigDecimal(0)) == 1  && (deltaQ.compareTo(maxDeltaQ) == 0  &&
							communityId > bestCommunity))) {
						maxDeltaQ = deltaQ;
						bestCommunity = communityId;
						bestSigmaTot = sigmaTotal;
					}

				}


				// only allow changes from low to high communties on even cyces and
				// high to low on odd cycles
				if (louvainData.community != bestCommunity && ((even &&
						louvainData.community > bestCommunity) || (!even &&
								louvainData.community < bestCommunity))) {
					//println("  "+vid+" SWITCHED from "+vdata.community+" to "+bestCommunity)
					louvainData.community = bestCommunity;
					louvainData.communitySigmaTot = bestSigmaTot;
					louvainData.changed = true;
				}
				else {
					louvainData.changed = false;
				}

				if (louvainData == null)
					System.out.println("vdata is null: " + vid);

				return louvainData;
			}
		}, ClassTag.apply(Map.class), ClassTag.apply(LouvainData.class));
	}

	public Tuple3<Double, org.apache.spark.graphx.Graph<LouvainData, Long>, Integer> louvain(
			JavaSparkContext sc,
			org.apache.spark.graphx.Graph<LouvainData, Long> graph){

		return louvain(sc, graph, 1, 1);

	}
	public Tuple3<Double, org.apache.spark.graphx.Graph<LouvainData, Long>, Integer> louvain(
			JavaSparkContext sc,
			org.apache.spark.graphx.Graph<LouvainData, Long> graph,
			Integer minProgress,
			Integer progressCounter) {

		org.apache.spark.graphx.Graph<LouvainData, Long> louvainGraph = graph.cache();

		Long graphWeight = louvainGraph.vertices().map(new Function1<Tuple2<Object, LouvainData>, Long>() {
			@Override
			public Long apply(Tuple2<Object, LouvainData> louvainVertex) {
				LouvainData louvainData = (LouvainData) louvainVertex._2();
				return louvainData.internalWeight + louvainData.nodeWeight;
			}
		}, ClassTag.apply(Long.class)).reduce(new scala.Function2<Long, Long, Long>() {
			@Override
			public Long apply(Long a, Long b) {
				return a + b;
			}
		});

		Broadcast<Long> totalGraphWeight = sc.broadcast(graphWeight);

		System.out.println("totalEdgeWeight: " + totalGraphWeight.value());

		// gather community information from each vertex's local neighborhood
		VertexRDD<Map<Tuple2<Long, Long>, Long>> communityRDD =
				louvainGraph.aggregateMessages(new Function1<EdgeContext<LouvainData, Long, Map<Tuple2<Long, Long>, Long>>, BoxedUnit>() {
					@Override
					public BoxedUnit apply(EdgeContext<LouvainData, Long, Map<Tuple2<Long, Long>, Long>> e) {
						return sendCommunityData(e);
					}
				}, new scala.Function2<Map<Tuple2<Long, Long>, Long>, Map<Tuple2<Long, Long>, Long>, Map<Tuple2<Long, Long>, Long>>() {
					@Override
					public Map<Tuple2<Long, Long>, Long> apply(Map<Tuple2<Long, Long>, Long> m1, Map<Tuple2<Long, Long>, Long> m2) {
						return mergeCommunityMessages(m1, m2);
					}
					
				}, (TripletFields) null, ClassTag.apply(Map.class));//TODO

		Long activeMessages = communityRDD.count(); //materializes the msgRDD
		//and caches it in memory
		Long updated = 0L - minProgress;
		boolean even = false;
		int count = 0;
		int maxIter = 100000;
		int stop = 0;
		Long updatedLastPhase = 0L;
		do {
			count += 1;
			even = !even;

			// label each vertex with its best community based on neighboring
			// community information
			VertexRDD<LouvainData> labeledVertices = louvainVertJoin(louvainGraph, communityRDD, totalGraphWeight, even);

			// calculate new sigma total value for each community (total weight
			// of each community)
			JavaPairRDD<Object, Long> communityUpdate = labeledVertices.map(new Function1<Tuple2<Object, LouvainData>, Tuple2<Object, Long>>() {
				@Override
				public Tuple2<Object, Long> apply(Tuple2<Object, LouvainData> v) {
					return new Tuple2<>(v._2().community, v._2().nodeWeight +
							v._2().internalWeight);
				}
			}, ClassTag.apply(Tuple2.class)).toJavaRDD()
					.mapToPair(new PairFunction<Tuple2<Object, Long>, Object, Long>() {
						@Override
						public Tuple2<Object, Long> call(Tuple2<Object, Long> v) {
							return v;
						}
					}).reduceByKey(new Function2<Long, Long, Long>() {
						@Override
						public Long call(Long acc, Long val) {
							return acc + val;
						}
					});


			JavaPairRDD<Object, Tuple2<Long, Long>> communityMapping = labeledVertices.map(new Function1<Tuple2<Object, LouvainData>, Tuple2<Object, Long>>() {
				@Override
				public Tuple2<Object, Long> apply(Tuple2<Object, LouvainData> v) {
					return new Tuple2<>(v._2().community, (Long)v._1());
				}
			}, ClassTag.apply(Tuple2.class))
					.toJavaRDD().mapToPair(new PairFunction<Tuple2<Object, Long>, Object, Long>() {
						@Override
						public Tuple2<Object, Long> call(Tuple2<Object, Long> v) {
							return v;
						}
					}).join(communityUpdate).mapToPair(new PairFunction<Tuple2<Object, Tuple2<Long, Long>>, Object, Tuple2<Long, Long>>() {
						@Override
						public Tuple2<Object, Tuple2<Long, Long>> call(Tuple2<Object, Tuple2<Long, Long>> v) {
							return new Tuple2<>(v._2()._1, new Tuple2<>((Long)v._1, v._2._2)); //TODO: is it correct to reshaffle the input tuple as return value?
						}
					});




			// join the community labeled vertices with the updated community info
			JavaPairRDD<Object, LouvainData> updatedVertices = labeledVertices.toJavaRDD().mapToPair(new PairFunction<Tuple2<Object, LouvainData>, Object, LouvainData>() {
				@Override
				public Tuple2<Object, LouvainData> call(Tuple2<Object, LouvainData> v) {
					return new Tuple2<Object, LouvainData>((Long) v._1, v._2);
				}
			}).join(communityMapping).mapToPair(new PairFunction<Tuple2<Object, Tuple2<LouvainData, Tuple2<Long, Long>>>, Object, LouvainData>() {
				@Override
				public Tuple2<Object, LouvainData> call(Tuple2<Object, Tuple2<LouvainData, Tuple2<Long, Long>>> v) {
					Tuple2<Long, Long> communityTuple = v._2._2;
					LouvainData data = v._2._1;
					data.community = communityTuple._1;
					data.communitySigmaTot = communityTuple._2;
					return new Tuple2<>(v._1, data);
				}
			});



			updatedVertices.count();
			labeledVertices.unpersist(false);
			communityUpdate.unpersist(false);
			communityMapping.unpersist(false);

			org.apache.spark.graphx.Graph<LouvainData, Long> prevG = louvainGraph;

			louvainGraph = louvainGraph.outerJoinVertices(VertexRDD/*$.MODULE$*/.apply(updatedVertices.rdd() , ClassTag.apply(LouvainData.class)), 
					new scala.Function3<Object, LouvainData, Option<LouvainData>, LouvainData>() {
				@Override
				public LouvainData apply(Object vid, LouvainData old, Option<LouvainData> newOpt) {
					return newOpt.getOrElse(new scala.Function0<LouvainData>() {
						public LouvainData apply() {
							return old;
						}
					});
				}
			}, ClassTag.apply(Long.class), ClassTag.apply(LouvainData.class), /*eq*/null);//TODO
			louvainGraph.cache();

			VertexRDD<Map<Tuple2<Long, Long>, Long>> oldMsgs = communityRDD;

			// gather community information from each vertex's local neighborhood
			communityRDD = louvainGraph.aggregateMessages(new Function1<EdgeContext<LouvainData, Long, Map<Tuple2<Long, Long>, Long>>, BoxedUnit>() {
						@Override
						public BoxedUnit apply(EdgeContext<LouvainData, Long, Map<Tuple2<Long, Long>, Long>> e) {
							return sendCommunityData(e);
						}
					}, new scala.Function2<Map<Tuple2<Long, Long>, Long>, Map<Tuple2<Long, Long>, Long>, Map<Tuple2<Long, Long>, Long>>() {
						@Override
						public Map<Tuple2<Long, Long>, Long> apply(Map<Tuple2<Long, Long>, Long> m1, Map<Tuple2<Long, Long>, Long> m2) {
							return mergeCommunityMessages(m1, m2);
						}
						
					}, (TripletFields) null, ClassTag.apply(Map.class)); //TODO
			activeMessages = communityRDD.count(); // materializes the graph by forcing computation

			oldMsgs.unpersist(false);
			updatedVertices.unpersist(false);
			prevG.unpersistVertices(false);

			// half of the communites can swtich on even cycles and the other half
			// on odd cycles (to prevent deadlocks) so we only want to look for
			// progess on odd cycles (after all vertcies have had a chance to
			// move)
			if (even)
				updated = 0L;
			updated = updated + louvainGraph.vertices().filter(new Function1<Tuple2<Object, LouvainData>, Object>() {
				@Override
				public Boolean apply(Tuple2<Object, LouvainData> v) {
					return v._2.changed;
				}
			}).count();

			if (!even) {
				System.out.println("  # vertices moved: " + java.text.NumberFormat.getInstance().format(updated));

				if (updated >= updatedLastPhase - minProgress)
					stop += 1;

				updatedLastPhase = updated;
			}

		} while (stop <= progressCounter && (even || (updated > 0 && count < maxIter)));

		System.out.println("\nCompleted in " + count + " cycles");

		// Use each vertex's neighboring community data to calculate the
		// global modularity of the graph
		VertexRDD<Double> newVertices =
				louvainGraph.vertices().innerJoin(communityRDD.toJavaRDD().rdd(), new scala.Function3<Object, LouvainData, Map<Tuple2<Long, Long>, Long>, Double>() {
					@Override
					public Double apply(Object vertexId, LouvainData louvainData, Map<Tuple2<Long, Long>, Long> communityMap) {
						// sum the nodes internal weight and all of its edges that are in
						// its community
						Long community = louvainData.community;
						Long accumulatedInternalWeight = louvainData.internalWeight;
						Double sigmaTot = louvainData.communitySigmaTot.doubleValue();

						for (Map.Entry<Tuple2<Long, Long>, Long> entry : communityMap.entrySet()){
							accumulatedInternalWeight = accumulateTotalWeight(accumulatedInternalWeight, entry, louvainData);
						}

						Long M = totalGraphWeight.getValue();
						Long k_i = louvainData.nodeWeight + louvainData.internalWeight;
						Double q = (accumulatedInternalWeight.doubleValue() / M) - ((sigmaTot * k_i) / Math.pow(M, 2));
						//println(s"vid: $vid community: $community $q = ($k_i_in / $M) - ( ($sigmaTot * $k_i) / math.pow($M, 2) )")
						if (q < 0)
							return 0d;
						else
							return q;
					}
				}, ClassTag.apply(Map.class), ClassTag.apply(Double.class));

		Double actualQ = newVertices.map(new Function1<Tuple2<Object, Double>, Double>() {
			@Override
			public Double apply(Tuple2<Object, Double> v) {
				return v._2();
			}
		}, ClassTag.apply(Double.class)).reduce(new scala.Function2<Double, Double, Double>() {
			@Override
			public Double apply(Double a, Double b) {
				return a + b;	
			}
		});

		// return the modularity value of the graph along with the
		// graph. vertices are labeled with their community
		return new Tuple3<>(actualQ, louvainGraph, count / 2);
	}

	private Long accumulateTotalWeight(Long totalWeight, Map.Entry<Tuple2<Long, Long>, Long> item, LouvainData louvainData)  {
		Long communityEdgeWeight = item.getValue();
		Tuple2<Long, Long>  data = item.getKey();
		Long communityId = data._1;
		Long sigmaTotal = data._2;
		if (louvainData.community == communityId)
			return totalWeight + communityEdgeWeight;
		else
			return totalWeight;
	}

	public org.apache.spark.graphx.Graph<LouvainData, Long> compressGraph(org.apache.spark.graphx.Graph<LouvainData, Long> graph) {
		return compressGraph(graph, true);
	}


	public org.apache.spark.graphx.Graph<LouvainData, Long> compressGraph(org.apache.spark.graphx.Graph<LouvainData, Long> graph, Boolean debug) {
		// aggregate the edge weights of self loops. edges with both src and dst in the same community.
		// WARNING  can not use graph.mapReduceTriplets because we are mapping to new vertexIds
		JavaPairRDD<Long, Long> internalEdgeWeights = graph.triplets().toJavaRDD().flatMap(new FlatMapFunction<EdgeTriplet<LouvainData, Long>, Tuple2<Long, Long>>() {
			@Override
			public Iterator<Tuple2<Long, Long>> call(EdgeTriplet<LouvainData, Long> et) {
				if (et.srcAttr().community == et.dstAttr().community) {
					return Collections.singletonList(new Tuple2<>(et.srcAttr().community, 2 * et.attr)).iterator(); // count the weight from both nodes
				} else return Collections.emptyIterator();
			}
		}).mapToPair(new PairFunction<Tuple2<Long, Long>, Long, Long>(){
			@Override
			public Tuple2<Long, Long> call(Tuple2<Long, Long> v) {
				return v;
			}
		}).reduceByKey(new Function2<Long, Long, Long>(){
			@Override
			public Long call(Long a, Long b) {
				return a + b;
			}
		});

		Iterator<Object> it = Collections.emptyIterator();

		// aggregate the internal weights of all nodes in each community
		JavaPairRDD<Long, Long> internalWeights = graph.vertices().map(new Function1<Tuple2<Object, LouvainData>, LouvainData>(){
			@Override
			public LouvainData apply(Tuple2<Object, LouvainData> v) {
				return v._2();
			}
		}, ClassTag.apply(Long.class)).toJavaRDD().mapToPair(new PairFunction<LouvainData, Long, Long>(){
			@Override
			public Tuple2<Long, Long> call(LouvainData v) {
				return new Tuple2<Long, Long>(v.community, v.internalWeight);
			}
		}).reduceByKey(new Function2<Long, Long, Long>(){
			@Override
			public Long call(Long a, Long b) {
				return a + b;
			}
		});

		// join internal weights and self edges to find new interal weight of each community
		JavaPairRDD<Long, LouvainData> newVertices = (JavaPairRDD<Long, LouvainData>) internalWeights.leftOuterJoin(internalEdgeWeights).mapToPair(new PairFunction<Tuple2<Long, Tuple2<Long, Optional<Long>>>, Long, LouvainData>() {
			@Override
			public Tuple2<Long, LouvainData> call(Tuple2<Long, Tuple2<Long, Optional<Long>>> v) { //(vid, (weight1, weight2Option)) =>
				Long vid = v._1;
				Long weight1 = v._2._1;
				Optional<Long> weight2Option = v._2._2;
				Long weight2 = weight2Option.orElse(0L);
				LouvainData state = new LouvainData();
				state.community = vid;
				state.changed = false;
				state.communitySigmaTot = 0L;
				state.internalWeight = weight1 + weight2;
				state.nodeWeight = 0L;
				return new Tuple2<>(vid, state);
			}
		}).cache();

		// translate each vertex edge to a community edge
		JavaRDD<Edge<Long>> edges = graph.triplets().toJavaRDD().flatMap(new FlatMapFunction<EdgeTriplet<LouvainData, Long>, Edge<Long>>() {
			@Override
			public Iterator<Edge<Long>> call(EdgeTriplet<LouvainData, Long> et) {
				Long src = Math.min(et.srcAttr().community, et.dstAttr().community);
				Long dst = Math.max(et.srcAttr().community, et.dstAttr().community);
				if (src != dst) return Collections.singletonList(new Edge<Long>(src, dst, et.attr)).iterator();
				else return Collections.emptyIterator();
			}

		}).cache();


		VertexRDD<LouvainData> _newVertices = VertexRDD/*$.MODULE$*/.apply(newVertices.map(new Function<Tuple2<Long, LouvainData>,Tuple2<Object, LouvainData>>() {
			@Override
			public Tuple2<Object, LouvainData> call(Tuple2<Long, LouvainData> v) {
				return new Tuple2<Object, LouvainData>(v._1, v._2);
			}
		}).rdd(), ClassTag.apply(LouvainData.class));
		EdgeRDD<Long> _newEdges = EdgeRDD.fromEdges(edges.rdd(), ClassTag.apply(Long.class), ClassTag.apply(Long.class));
		// generate a new graph where each community of the previous graph is
		// now represented as a single vertex
		org.apache.spark.graphx.Graph<LouvainData, Long> compressedGraph = Graph.apply(_newVertices, _newEdges, null, null, null, ClassTag.apply(LouvainData.class), ClassTag.apply(Long.class))
				.partitionBy(PartitionStrategy.fromString("EdgePartition2D")) /* PartitionStrategy.EdgePartition2D$.MODULE$*/
				.groupEdges(new scala.Function2<Long, Long, Long>() {
					@Override
					public Long apply(Long e1, Long e2) {
						return e1 + e2;
					}
				});
		
		// calculate the weighted degree of each node
		VertexRDD<Long> nodeWeights = compressedGraph.aggregateMessages(
				
				new Function1<EdgeContext<LouvainData,Long, Long>, BoxedUnit> () {
			@Override
			public BoxedUnit apply(EdgeContext<LouvainData, Long, Long> e) {
				e.sendToSrc(e.attr());
				e.sendToDst(e.attr());
				return BoxedUnit.UNIT;
			}
		}, new scala.Function2<Long, Long, Long>() {
			@Override
			public Long apply(Long e1, Long e2) {
				return e1 + e2;
			}
		}, (TripletFields)null, ClassTag.apply(Long.class)); //TODO

		// fill in the weighted degree of each node
		// val louvainGraph = compressedGraph.joinVertices(nodeWeights)((vid,data,weight)=> {
		org.apache.spark.graphx.Graph<LouvainData, Long> louvainGraph = compressedGraph.outerJoinVertices(nodeWeights.toJavaRDD().rdd(), new scala.Function3<Object, LouvainData, Option<Long>, LouvainData>() {
			@Override
			public LouvainData apply(Object vid, LouvainData data, Option<Long> weightOption) {
				Long weight = weightOption.getOrElse(new scala.Function0<Long>() {
					public Long apply() {
						return 0L;
					}
				});
				data.communitySigmaTot = weight + data.internalWeight;
				data.nodeWeight = weight;
				return data;
			}

		}, ClassTag.apply(Long.class), ClassTag.apply(LouvainData.class), /*eq*/null /*TODO*/).cache();

		louvainGraph.vertices().count();
		louvainGraph.triplets().count(); // materialize the graph

		newVertices.unpersist(false);
		edges.unpersist(false);
		return louvainGraph;
	}

	public void saveLevel(
			JavaSparkContext sc,
			LouvainConfig config,
			Integer level,
			List<Tuple2<Integer, Double>> qValues,
			Graph<LouvainData, Long> graph) {

		String vertexSavePath = config.outputDir + "/level_" + level + "_vertices";
		String edgeSavePath = config.outputDir + "/level_" + level + "_edges";

		// save
		graph.vertices().saveAsTextFile(vertexSavePath);
		graph.edges().saveAsTextFile(edgeSavePath);

		// overwrite the q values at each level
		sc.parallelize(qValues, 1).saveAsTextFile(config.outputDir + "/qvalues_" + level);
	}

	public void run(JavaSparkContext sc, LouvainConfig config) {
		EdgeRDD<Long> edgeRDD = getEdgeRDD(sc, config);
		org.apache.spark.graphx.Graph<Long, Long> initialGraph = org.apache.spark.graphx.Graph.fromEdges(edgeRDD, null, null, null, ClassTag.apply(Long.class), ClassTag.apply(Long.class));
		org.apache.spark.graphx.Graph<LouvainData, Long> louvainGraph = createLouvainGraph(initialGraph);

		int compressionLevel = -1; // number of times the graph has been compressed
		double q_modularityValue = -1.0; // current modularity value
		boolean halt = false;

		List<Tuple2<Integer, Double>> qValues = new ArrayList<>();

		do {
			compressionLevel += 1;
			System.out.println("\nStarting it.polimi.dagsymb.Louvain level"+compressionLevel);

			Tuple3<Double, org.apache.spark.graphx.Graph<LouvainData, Long>, Integer> data = louvain(sc, louvainGraph, config.minimumCompressionProgress, config.progressCounter);
			// label each vertex with its best community choice at this level of compression
			Double currentQModularityValue = data._1();
			org.apache.spark.graphx.Graph<LouvainData, Long> currentGraph = data._2();
			Integer numberOfPasses = data._3();


			louvainGraph.unpersistVertices(false);
			louvainGraph = currentGraph;

			System.out.println("qValue: "+currentQModularityValue);

			qValues.add(new Tuple2<Integer, Double>(compressionLevel, currentQModularityValue));

			saveLevel(sc, config, compressionLevel, qValues, louvainGraph);

			// If modularity was increased by at least 0.001 compress the graph and repeat
			// halt immediately if the community labeling took less than 3 passes
			//println(s"if ($passes > 2 && $currentQ > $q + 0.001 )")
			if (numberOfPasses > 2 && currentQModularityValue > q_modularityValue + 0.001) {
				q_modularityValue = currentQModularityValue;
				louvainGraph = compressGraph(louvainGraph);
			}
			else {
				halt = true;
			}

		} while (!halt);

		//finalSave(sc, compressionLevel, q_modularityValue, louvainGraph)

	}

}
