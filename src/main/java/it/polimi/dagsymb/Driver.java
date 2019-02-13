package it.polimi.dagsymb;

public class Driver {


    public void run_main(String[] args){

        LouvainConfig config = new LouvainConfig("src/dataset/local.txt",
                "src/out/", 20, 2000, 1, ",");

        // def deleteOutputDir(config: it.polimi.dagsymb.LouvainConfig): Unit = {
        //   val hadoopConf = new org.apache.hadoop.conf.Configuration()

        //   val hdfs = org.apache.hadoop.fs.FileSystem.get(new java.net.URI("hdfs://localhost:8020"), hadoopConf)

        //   try {
        //     hdfs.delete(new org.apache.hadoop.fs.Path(config.outputDir), true)
        //   }
        //   catch {
        //     case _ : Throwable => { }
        //   }
        // }

        // val conf = new SparkConf().setAppName("ApproxTriangles").setMaster("local[2]")
        // conf.set("spark.default.parallelism", (8).toString)
        // conf.set("spark.serializer", "org.apache.spark.serializer.KryoSerializer")
        // conf.set("spark.logConf", "true")
        // //sparkConf.getAll.foreach(println(_))
        // val sc = new SparkContext(conf)
        // Logger.getRootLogger.setLevel(Level.WARN)

        //JavaSparkContext sc = new JavaSparkContext("local", "it.polimi.dagsymb.Louvain");

        // deleteOutputDir(config)

		//Louvain.run(sc, config);
    }
    
	
    public static void main(String[] args){
    	Driver driver = new Driver();
    	Louvain louvain = new Louvain();
   
    	String data = 	"1,2 -    			1,3 -     			1,4 -     			1,5 -     			1,6 -     			2,3 -   "
    			+ "  			2,4 -     			2,5 -     			2,1 -     			3,4 -     			3,5 -     		"
    			+ "	3,20 -     			3,1 -     			3,2 -     			4,5 -     			4,1 -     		"
    			+ "	4,2 -     			4,3 -     			5,1 -     			5,2 -     			5,3 -     		"
    			+ "	5,4 -     			6,1 -     			6,8 -     			8,6 -     			8,10 -     		"
    			+ "	10,8 -     			10,12 -     			12,10 -     			15,17 -     			15,19 -  "
    			+ "   			17,15 -     			19,15 -     			19,20 -     			20,3 -     		"
    			+ "	20,19";
    	String[] edgeStrings = data.split("-");
    	for (int i = 0; i < edgeStrings.length; i++) {
    		String[] pair = edgeStrings[i].split(",");
    		pair[0] = pair[0].trim();
    		pair[1] = pair[1].trim();
    		int v0 = Integer.parseInt(pair[0]);
    		int v1 = Integer.parseInt(pair[1]);
    		louvain.addToFileLocal(1, v0, v1);
    	}
    	    	
    	LouvainConfig config = new LouvainConfig("####",
                "###", 20, 2000, 1, "###");

    	//louvain.addToFileLocal(1400000, 1, 2);
    	//louvain.addToFileLocal(500000, 5, 3);
    	
    	//louvain.addToFileLocal(900000, 4, 3);
//    	louvain.run(config);
    	    	
    }
	
}
