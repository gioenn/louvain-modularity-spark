package it.polimi.dagsymb;

//import java.io.Serializable;

import java.io.Serializable;

public class LouvainConfig implements Serializable {
	private String inputFile;
    private String outputDir;
    private long size1;
    private long size2;
    private long size3;    
    private int parallelism;
    private int minimumCompressionProgress;
    private int progressCounter;
    String delimiter;
    private boolean genData;
    private String appName;

    public LouvainConfig(String inputFile, String outputDir, long size1, long size2, long size3, 
    		int parallelism, int minimumCompressionProgress, int progressCounter, String delimiter, 
    		boolean genData, String appName){
        this.inputFile = inputFile;
        this.outputDir = outputDir;
        this.size1 = size1;
        this.size2 = size2;
        this.size3 = size3;
        this.parallelism = parallelism;
        this.minimumCompressionProgress = minimumCompressionProgress;
        this.progressCounter = progressCounter;
        this.delimiter = delimiter;
        this.genData = genData;
        this.appName = appName;
    }

    // Original constructor, left here to avoid compilation errors in other modules
    public LouvainConfig(String inputFile, String outputDir, int parallelism, int minimumCompressionProgress, int progressCounter, String delimiter){
        this.inputFile = "src/dataset/local.txt"; //GIO fixed inputFile;
        this.outputDir = outputDir;
        this.parallelism = parallelism;
        this.minimumCompressionProgress = minimumCompressionProgress;
        this.progressCounter = progressCounter;
        this.delimiter = ","; //GIO fixed delimiter;
		appName = "test";
    }
    
	public String getInputFile() {
		return inputFile;
	}

	public String getOutputDir() {
		return outputDir;
	}

	public long getSize1() {
		return size1;
	}

	public long getSize2() {
		return size2;
	}

	public long getSize3() {
		return size3;
	}

	public int getParallelism() {
		return parallelism;
	}

	public int getMinimumCompressionProgress() {
		return minimumCompressionProgress;
	}

	public int getProgressCounter() {
		return progressCounter;
	}

	public String getDelimiter() {
		return delimiter;
	}

	public boolean getGenData() {
		return genData;
	}

	public String getAppName() {
		return appName;
	}
}
