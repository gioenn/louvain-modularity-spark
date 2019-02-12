/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 11 17:06:08 GMT 2019
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
public class Louvain_0_1_Test extends Louvain_0_1_Test_scaffolding {

  //Test case number: 0
  /*
   * 1 covered goal:
   * Goal 1. it.polimi.dagsymb.Louvain.run(Lit/polimi/dagsymb/LouvainConfig;)V: path condition EvoSuiteWrapper_0_1 (id = 0)
   */

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Louvain louvain0 = new Louvain();
      louvain0.addToFileLocal(1000000, (-1), 1);
      louvain0.addToFileLocal(1000000, 1, 4);
      LouvainConfig louvainConfig0 = new LouvainConfig("", "", 1000000, (-1), 1, "");
      louvain0.addToFileLocal(1000000, 1, 1000000);
      louvain0.addToFileLocal(1000000, 1000000, 4);
      louvain0.run0(louvainConfig0);
  }
}
