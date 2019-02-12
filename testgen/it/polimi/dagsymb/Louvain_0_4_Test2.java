/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 11 17:04:15 GMT 2019
 */

package it.polimi.dagsymb;

import org.junit.Test;
import static org.junit.Assert.*;
import it.polimi.dagsymb.Louvain;
import it.polimi.dagsymb.LouvainConfig;
import org.junit.runner.RunWith;
import shaded.org.evosuite.runtime.EvoRunner;
import shaded.org.evosuite.runtime.EvoRunnerParameters;
import sushi.logging.Level;
import sushi.logging.Logger;

public class Louvain_0_4_Test2  {

  @Test
  public void test0()  throws Throwable  {
	  Louvain louvain0 = new Louvain();
	  louvain0.addToFileLocal(1000000, 1000000, 1000000);
	  LouvainConfig louvainConfig0 = new LouvainConfig("j*&d", "j*&d", 0, 0, 1000000, "j*&d");
	  louvain0.run0(louvainConfig0);
	  Logger.setLevel(Level.DEBUG);
	  EvoSuiteWrapper_0_4 w = new EvoSuiteWrapper_0_4();
	  w.test0(louvain0, louvainConfig0);

  }
}