package it.polimi.dagsymb;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.URI;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.spark.api.java.JavaSparkContext;

public class GraphDataGenerator {
public static void createGraphData(JavaSparkContext sc, String filename, long size1, long size2, long size3, String delimiter){
		
		//Get configuration of Hadoop system
	    Configuration conf = sc.hadoopConfiguration();
	    System.out.println("Connecting to -- "+conf.get("fs.defaultFS"));
	    
		try {
			URI uri = URI.create(conf.get("fs.defaultFS") + "/" + filename);
		    FileSystem fs = FileSystem.get(uri, conf);
		    OutputStream output = fs.create(new Path(filename));
		    System.out.println("Output: "+output.toString());
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output));
			long bias = 0;
			if (size1 != size2)
				bias = size1;
			for (long i = 1; i <= size1; ++i) {
		      String line = i + delimiter + (i + bias);
	      	  writer.write(line + "\n");
	        };
	        writer.flush();
	        writer.close();
	        fs.close();
	    } catch (IOException e) { 
	    	System.out.println(e.getMessage());
	    	};
	}
}
