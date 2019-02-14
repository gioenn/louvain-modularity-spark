package it.polimi.dagsymb;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.spark.api.java.JavaSparkContext;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.URI;
import java.util.List;

public class GraphDataGenerator {
public static void createGraphData(JavaSparkContext sc, String filename, List<Long> sizes, String delimiter){
		
		//Get configuration of Hadoop system
	    Configuration conf = sc.hadoopConfiguration();
	    System.out.println("Connecting to -- "+conf.get("fs.defaultFS"));

	    // add(10000, 0, 1);
		// add(10000, 0, 2)

		try {
			URI uri = URI.create(conf.get("fs.defaultFS") + "/" + filename);
		    FileSystem fs = FileSystem.get(uri, conf);
		    OutputStream output = fs.create(new Path(filename));
		    System.out.println("Output: "+output.toString());
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output));
			long size = sizes.get(0);
			for (int j = 1; j < sizes.size(); j+=2){

				long id1 = sizes.get(j);
				long id2 = sizes.get(j+1);
				for (long i = 0; i < size; ++i) {
					long n1 = i+id1*size;
					long n2 = i+id2*size;
					String line = (n1 + delimiter + n2);
					writer.write(line + "\n");
				};
			}

	        writer.flush();
	        writer.close();
	        fs.close();
	    } catch (IOException e) { 
	    	System.out.println(e.getMessage());
	    	};
	}
}
