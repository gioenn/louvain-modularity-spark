package it.polimi.dagsymb.mock;

import org.apache.spark.api.java.function.Function2;
import org.apache.spark.api.java.function.Function3;
import org.apache.spark.graphx.*;
import org.apache.spark.rdd.RDD;
import scala.Function1;
import scala.Option;
import scala.runtime.BoxedUnit;

public class Graph<VD, ED> {

    public VertexRDD<VD> vertices;
    public RDD<EdgeTriplet<VD, ED>> triplets;
    public EdgeRDD<VD> edges;

    public Graph(VertexRDD<VD> vertices, EdgeRDD<ED> edges) {
        //TODO implement
    }

    public <U> VertexRDD<U>
    aggregateMessages(Function1<EdgeContext<VD, ED, U>, BoxedUnit> sendMsg, Function2<U, U, U> mergeMsg){
        //TODO implement
        return null;
    }

    public <U, V2> Graph<V2, ED> outerJoinVertices(VertexRDD<U> other, Function3<Long, VD, Option<U>, V2> mapFunc){
        //TODO implement
        return null;
    }

    public Graph<VD, ED> cache(){
        return this;
    }

    public void unpersistVertices(boolean blocking){
        return;
    }

    public Graph<VD, ED> partitionBy(PartitionStrategy strategy){
        return this;
    }

    public Graph<VD, ED> groupEdges(Function2<ED,ED,ED> merge){
        // TODO: IMPLEMENT
        return null;
    }

    public static <VD, ED>  Graph<VD, ED> fromEdges(RDD<Edge<ED>> edges, VD defaultVale){
        // TODO: IMPLEMENT
        return null;
    }
}
