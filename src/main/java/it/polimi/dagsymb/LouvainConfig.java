package it.polimi.dagsymb;

//import java.io.Serializable;

public class LouvainConfig /*implements Serializable*/ {
	private String inputFile;
    private String outputDir;
    private int parallelism;
    private int minimumCompressionProgress;
    private int progressCounter;
    private String delimiter;


    public LouvainConfig(String inputFile, String outputDir, int parallelism, int minimumCompressionProgress, int progressCounter, String delimiter){
        this.inputFile = "src/dataset/local1.txt"; //GIO fixed inputFile;
        this.outputDir = outputDir;
        this.parallelism = parallelism;
        this.minimumCompressionProgress = minimumCompressionProgress;
        this.progressCounter = progressCounter;
        this.delimiter = ","; //GIO fixed delimiter;
    }


	public String getInputFile() {
		return inputFile;
	}

	public String getOutputDir() {
		return outputDir;
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
}
