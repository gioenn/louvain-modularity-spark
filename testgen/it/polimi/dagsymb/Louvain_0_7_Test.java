/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 11 16:58:26 GMT 2019
 */

package it.polimi.dagsymb;

import org.junit.Test;
import static org.junit.Assert.*;
import it.polimi.dagsymb.Louvain;
import it.polimi.dagsymb.LouvainConfig;
import org.junit.runner.RunWith;
import shaded.org.evosuite.runtime.EvoRunner;
import shaded.org.evosuite.runtime.EvoRunnerParameters;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Louvain_0_7_Test extends Louvain_0_7_Test_scaffolding {

  //Test case number: 0
  /*
   * 1 covered goal:
   * Goal 1. it.polimi.dagsymb.Louvain.run(Lit/polimi/dagsymb/LouvainConfig;)V: path condition EvoSuiteWrapper_0_7 (id = 0)
   */

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Louvain louvain0 = new Louvain();
      louvain0.addToFileLocal(1000000, 0, 1);
      LouvainConfig louvainConfig0 = new LouvainConfig("org.apache.spark.graphx.TripletFields", "", 0, (-5), (-5), "");
      louvain0.run0(louvainConfig0);
  }
}
