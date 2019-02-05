package it.polimi.dagsymb;

import org.apache.spark.api.java.JavaSparkContext;

public class Driver {


    public static void main(String[] args){

        LouvainConfig config = new LouvainConfig("src/data/input/sample.txt",
                "src/data/output/", 20, 2000, 1, ",");

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

        JavaSparkContext sc = new JavaSparkContext("local[2]", "it.polimi.dagsymb.Louvain");

        // deleteOutputDir(config)

        Louvain louvain = new Louvain();
        louvain.run(sc, config);
    }
}
