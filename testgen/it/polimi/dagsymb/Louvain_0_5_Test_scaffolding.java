/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon Feb 11 15:20:31 GMT 2019
 */

package it.polimi.dagsymb;

import shaded.org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import shaded.org.evosuite.runtime.sandbox.Sandbox;
import shaded.org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class Louvain_0_5_Test_scaffolding {

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private shaded.org.evosuite.runtime.thread.ThreadStopper threadStopper =  new shaded.org.evosuite.runtime.thread.ThreadStopper (shaded.org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);

  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    shaded.org.evosuite.runtime.RuntimeSettings.className = "it.polimi.dagsymb.Louvain"; 
    shaded.org.evosuite.runtime.GuiSupport.initialize(); 
    shaded.org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    shaded.org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    shaded.org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    shaded.org.evosuite.runtime.RuntimeSettings.sandboxMode = shaded.org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    shaded.org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    shaded.org.evosuite.runtime.classhandling.JDKClassResetter.init(); 
    initializeClasses();
    shaded.org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    shaded.org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    shaded.org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    shaded.org.evosuite.runtime.GuiSupport.setHeadless(); 
    shaded.org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    shaded.org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    shaded.org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    shaded.org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    shaded.org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    shaded.org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    shaded.org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("java.vm.vendor", "Oracle Corporation"); 
    java.lang.System.setProperty("java.specification.version", "1.8"); 
            java.lang.System.setProperty("java.home", "/Library/Java/JavaVirtualMachines/jdk1.8.0_131.jdk/Contents/Home/jre"); 
        java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("user.home", "/Users/denaro"); 
                                        java.lang.System.setProperty("awt.toolkit", "sun.lwawt.macosx.LWCToolkit"); 
    java.lang.System.setProperty("file.encoding", "UTF-8"); 
    java.lang.System.setProperty("file.separator", "/"); 
        java.lang.System.setProperty("java.awt.graphicsenv", "sun.awt.CGraphicsEnvironment"); 
    java.lang.System.setProperty("java.awt.printerjob", "sun.lwawt.macosx.CPrinterJob"); 
    java.lang.System.setProperty("java.class.path", "/var/folders/1z/yk4rzp_x3_b0yvqk2dt9chzr0000gp/T/EvoSuite_pathingJar3058703385483503331.jar"); 
    java.lang.System.setProperty("java.class.version", "52.0"); 
        java.lang.System.setProperty("java.endorsed.dirs", "/Library/Java/JavaVirtualMachines/jdk1.8.0_131.jdk/Contents/Home/jre/lib/endorsed"); 
    java.lang.System.setProperty("java.ext.dirs", "/Users/denaro/Library/Java/Extensions:/Library/Java/JavaVirtualMachines/jdk1.8.0_131.jdk/Contents/Home/jre/lib/ext:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java"); 
    java.lang.System.setProperty("java.io.tmpdir", "/var/folders/1z/yk4rzp_x3_b0yvqk2dt9chzr0000gp/T/"); 
    java.lang.System.setProperty("java.library.path", "lib"); 
    java.lang.System.setProperty("java.runtime.name", "Java(TM) SE Runtime Environment"); 
    java.lang.System.setProperty("java.runtime.version", "1.8.0_131-b11"); 
    java.lang.System.setProperty("java.specification.name", "Java Platform API Specification"); 
    java.lang.System.setProperty("java.specification.vendor", "Oracle Corporation"); 
        java.lang.System.setProperty("java.vendor", "Oracle Corporation"); 
    java.lang.System.setProperty("java.vendor.url", "http://java.oracle.com/"); 
    java.lang.System.setProperty("java.version", "1.8.0_131"); 
    java.lang.System.setProperty("java.vm.info", "mixed mode"); 
    java.lang.System.setProperty("java.vm.name", "Java HotSpot(TM) 64-Bit Server VM"); 
    java.lang.System.setProperty("java.vm.specification.name", "Java Virtual Machine Specification"); 
    java.lang.System.setProperty("java.vm.specification.vendor", "Oracle Corporation"); 
    java.lang.System.setProperty("java.vm.specification.version", "1.8"); 
    java.lang.System.setProperty("java.vm.version", "25.131-b11"); 
    java.lang.System.setProperty("line.separator", "\n"); 
    java.lang.System.setProperty("os.arch", "x86_64"); 
    java.lang.System.setProperty("os.name", "Mac OS X"); 
    java.lang.System.setProperty("os.version", "10.11.6"); 
    java.lang.System.setProperty("path.separator", ":"); 
    java.lang.System.setProperty("user.country", "US"); 
    java.lang.System.setProperty("user.dir", "/Users/denaro/git/sushi20190206/master"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "denaro"); 
    java.lang.System.setProperty("user.timezone", "Europe/Rome"); 
  }

  private static void initializeClasses() {
    shaded.org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(Louvain_0_5_Test_scaffolding.class.getClassLoader() ,
      "org.apache.spark.api.java.function.Function2",
      "org.apache.spark.graphx.Edge",
      "it.polimi.dagsymb.LouvainConfig",
      "it.polimi.dagsymb.Louvain$37$1",
      "it.polimi.dagsymb.Louvain$10",
      "it.polimi.dagsymb.Louvain$12",
      "it.polimi.dagsymb.Louvain$11",
      "it.polimi.dagsymb.Louvain$18$1",
      "it.polimi.dagsymb.Louvain$4$1",
      "sushi.compile.path_condition_distance.InverseDistances",
      "org.apache.spark.graphx.Graph",
      "org.apache.spark.graphx.EdgeRDD",
      "org.apache.spark.api.java.function.FlatMapFunction",
      "org.apache.spark.broadcast.Broadcast",
      "esem.sandbox.SymbolicProducer",
      "it.polimi.dagsymb.Louvain$18",
      "it.polimi.dagsymb.Louvain$17",
      "it.polimi.dagsymb.Louvain$19",
      "it.polimi.dagsymb.Louvain$14",
      "it.polimi.dagsymb.Louvain$13",
      "it.polimi.dagsymb.Louvain$16",
      "it.polimi.dagsymb.Louvain$15",
      "sushi.compile.path_condition_distance.ClauseSimilarityHandler",
      "it.polimi.dagsymb.Louvain$21",
      "it.polimi.dagsymb.Louvain$20",
      "esem.sandbox.DataBlock",
      "it.polimi.dagsymb.Louvain$23",
      "it.polimi.dagsymb.Louvain$22",
      "EvoSuiteWrapper_0_5",
      "org.apache.spark.api.java.function.Function",
      "EvoSuiteWrapper_0_5$21",
      "EvoSuiteWrapper_0_5$20",
      "scala.reflect.ClassTag",
      "EvoSuiteWrapper_0_5$23",
      "EvoSuiteWrapper_0_5$22",
      "EvoSuiteWrapper_0_5$24",
      "it.polimi.dagsymb.Louvain$AbstractFunction2",
      "scala.Function0",
      "it.polimi.dagsymb.Louvain$29",
      "org.apache.spark.api.java.JavaSparkContext",
      "scala.Function1",
      "it.polimi.dagsymb.Louvain$AbstractFunction3",
      "it.polimi.dagsymb.Louvain$28",
      "scala.Function2",
      "it.polimi.dagsymb.Louvain$AbstractFunction1",
      "scala.Function3",
      "esem.sandbox.DataBlockList",
      "it.polimi.dagsymb.Louvain$25",
      "it.polimi.dagsymb.Louvain$24",
      "it.polimi.dagsymb.Louvain$27",
      "it.polimi.dagsymb.Louvain$26",
      "it.polimi.dagsymb.Louvain$7",
      "it.polimi.dagsymb.Louvain$32",
      "it.polimi.dagsymb.Louvain$6",
      "it.polimi.dagsymb.Louvain$31",
      "it.polimi.dagsymb.Louvain$9",
      "it.polimi.dagsymb.Louvain$34",
      "it.polimi.dagsymb.Louvain$8",
      "it.polimi.dagsymb.Louvain$33",
      "it.polimi.dagsymb.Louvain$30",
      "it.polimi.dagsymb.Louvain$1",
      "it.polimi.dagsymb.Louvain$3",
      "it.polimi.dagsymb.Louvain$2",
      "it.polimi.dagsymb.Louvain$5",
      "org.apache.spark.api.java.JavaRDD",
      "it.polimi.dagsymb.Louvain$4",
      "sushi.compile.path_condition_distance.SimilarityWithRefToFreshObject",
      "EvoSuiteWrapper_0_5$10",
      "EvoSuiteWrapper_0_5$12",
      "EvoSuiteWrapper_0_5$11",
      "esem.sandbox.Utils",
      "EvoSuiteWrapper_0_5$14",
      "EvoSuiteWrapper_0_5$13",
      "EvoSuiteWrapper_0_5$16",
      "EvoSuiteWrapper_0_5$15",
      "EvoSuiteWrapper_0_5$18",
      "EvoSuiteWrapper_0_5$17",
      "it.polimi.dagsymb.Louvain$36",
      "it.polimi.dagsymb.Louvain$35",
      "org.apache.spark.api.java.JavaPairRDD",
      "org.apache.spark.graphx.TripletFields",
      "EvoSuiteWrapper_0_5$19",
      "it.polimi.dagsymb.Louvain$37",
      "org.apache.spark.graphx.EdgeTriplet",
      "sushi.compile.path_condition_distance.SimilarityComputationException",
      "org.apache.spark.api.java.function.PairFunction",
      "org.apache.spark.graphx.VertexRDD",
      "EvoSuiteWrapper_0_5$1",
      "EvoSuiteWrapper_0_5$3",
      "EvoSuiteWrapper_0_5$2",
      "org.apache.spark.graphx.PartitionStrategy",
      "sushi.util.ReflectionUtils",
      "sushi.compile.path_condition_distance.ValueCalculator",
      "org.apache.spark.storage.StorageLevel",
      "it.polimi.dagsymb.LouvainData",
      "EvoSuiteWrapper_0_5$5",
      "EvoSuiteWrapper_0_5$4",
      "sushi.compile.path_condition_distance.FieldDependsOnInvalidFieldPathException",
      "EvoSuiteWrapper_0_5$7",
      "EvoSuiteWrapper_0_5$6",
      "EvoSuiteWrapper_0_5$9",
      "EvoSuiteWrapper_0_5$8",
      "sushi.compile.path_condition_distance.FieldNotInCandidateException",
      "jbse.meta.Analysis",
      "scala.Tuple2",
      "scala.Tuple3",
      "sushi.compile.path_condition_distance.SimilarityWithRefToNull",
      "jbse.apps.TextGenerator",
      "org.apache.spark.graphx.EdgeContext",
      "sushi.compile.path_condition_distance.DistanceBySimilarityWithPathCondition",
      "sushi.logging.Logger",
      "sushi.compile.path_condition_distance.SimilarityWithNumericExpression",
      "sushi.logging.Level",
      "scala.runtime.BoxedUnit",
      "scala.Option",
      "sushi.compile.path_condition_distance.SimilarityWithRef",
      "sushi.compile.path_condition_distance.CandidateBackbone$ObjectMapWrapper",
      "org.apache.spark.api.java.Optional",
      "sushi.compile.path_condition_distance.CandidateBackbone",
      "it.polimi.dagsymb.Louvain"
    );
  } 

  private static void resetClasses() {
    shaded.org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(Louvain_0_5_Test_scaffolding.class.getClassLoader()); 

    shaded.org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.spark.api.java.JavaSparkContext",
      "scala.runtime.BoxedUnit",
      "org.apache.spark.graphx.TripletFields",
      "jbse.meta.Analysis",
      "esem.sandbox.SymbolicProducer",
      "EvoSuiteWrapper_0_5",
      "sushi.logging.Level",
      "sushi.logging.Logger",
      "sushi.compile.path_condition_distance.SimilarityWithRef",
      "sushi.compile.path_condition_distance.SimilarityWithRefToFreshObject",
      "sushi.compile.path_condition_distance.SimilarityWithRefToNull",
      "sushi.compile.path_condition_distance.SimilarityWithNumericExpression",
      "sushi.compile.path_condition_distance.DistanceBySimilarityWithPathCondition",
      "sushi.compile.path_condition_distance.CandidateBackbone",
      "sushi.util.ReflectionUtils"
    );
  }
}
