package it.polimi.dagsymb;

//import java.io.Serializable;

import java.io.Serializable;
import java.util.List;

public class LouvainConfig implements Serializable {
	private String inputFile;
    private String outputDir;
	private List<Long> sizes;
    private int parallelism;
    private int minimumCompressionProgress;
    private int progressCounter;
    String delimiter;
    private boolean genData;
    private String appName;

    public LouvainConfig(String inputFile, String outputDir,
    		int parallelism, int minimumCompressionProgress, int progressCounter, String delimiter, 
    		boolean genData, String appName, List<Long> sizes){
        this.inputFile = inputFile;
        this.outputDir = outputDir;
        this.sizes = sizes;
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

	public List<Long> getSizes() {
		return sizes;
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
