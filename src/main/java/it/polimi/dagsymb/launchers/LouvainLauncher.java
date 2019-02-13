/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 11 21:42:52 GMT 2019
 */

package it.polimi.dagsymb.launchers;

import it.polimi.dagsymb.Louvain;
import it.polimi.dagsymb.LouvainConfig;
import org.junit.runner.RunWith;
import shaded.org.evosuite.runtime.EvoRunner;
import shaded.org.evosuite.runtime.EvoRunnerParameters;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class LouvainLauncher/* extends Louvain_0_0_Test_scaffolding*/ {
 
  public static void main(String[] args) {
	  String IGuardEvalClassname = args[0]; // IGuardEvaluator implementation Class FQ Classname
	  String inputFile = args[1];
	  String outputFile = args[2];
	  Long size1 = Long.parseLong(args[3]);
	  long size2 = Long.parseLong(args[4]);
	  long size3 = Long.parseLong(args[5]);
      int parallelism = Integer.parseInt(args[6]);
      int minimumCompressionProgress = Integer.parseInt(args[7]);
	  int progressCounter = Integer.parseInt(args[8]);
	  String delimiter = args[9];
	  String dataGen = args[10];
	  String appName = args[11];
	  
      boolean genData = false;
      String sparkAppName = "";
      if (dataGen != null && dataGen.startsWith("-g")) genData = true;
      if (appName != null && !appName.startsWith("-")) sparkAppName = appName;


      /*LouvainConfig louvainConfig0 = new LouvainConfig(
              "src/data/input/sample.txt",
              "src/data/output/",
              20,
              2000,
              1,
              ",");
              */
      LouvainConfig louvainConfig0 = new LouvainConfig(inputFile, outputFile, size1, size2, size3, parallelism,
        	  minimumCompressionProgress, progressCounter, delimiter, genData, sparkAppName);

      Louvain louvain0 = new Louvain();

      louvain0.run0(louvainConfig0);
  }
  
}
