package it.polimi.dagsymb;

public class LouvainConfig {

    String inputFile;
    String outputDir;
    Integer parallelism;
    Integer minimumCompressionProgress;
    Integer progressCounter;
    String delimiter;


    public LouvainConfig(String inputFile, String outputDir, Integer parallelism, Integer minimumCompressionProgress, Integer progressCounter, String delimiter){
        this.inputFile = inputFile;
        this.outputDir = outputDir;
        this.parallelism = parallelism;
        this.minimumCompressionProgress = minimumCompressionProgress;
        this.progressCounter = progressCounter;
        this.delimiter = delimiter;
    }
}
