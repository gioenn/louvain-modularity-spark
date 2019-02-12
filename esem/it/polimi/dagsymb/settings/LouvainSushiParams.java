package it.polimi.dagsymb.settings;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;

import org.apache.spark.api.java.JavaSparkContext;

import it.polimi.dagsymb.LouvainConfig;
import sushi.configure.Coverage;
import sushi.configure.JBSEParameters;
import sushi.configure.MinimizerParameters;
import sushi.configure.Options;
import sushi.configure.ParametersModifier;
import sushi.configure.ParseException;
import sushi.logging.Level;

public class LouvainSushiParams extends ParametersModifier {
	@Override
	public void modify(Options p) {
		//Local configurations
		p.setEvosuitePath(CommonSettings.EVOSUITE_PATH);
		p.setSushiLibPath(CommonSettings.SUSHI_LIB_PATH);
		p.setZ3Path(CommonSettings.Z3_PATH);

		//Target 
		p.setClassesPath(CommonSettings.ESEM_MOCK_PATH, CommonSettings.BIN_PATH, CommonSettings.JBSE_PATH);
//		p.setTargetMethod("it/polimi/dagsymb/Louvain", "(Lorg/apache/spark/api/java/JavaSparkContext;Lit/polimi/dagsymb/LouvainConfig;)V", "run");
		p.setTargetMethod("it/polimi/dagsymb/Louvain", "(Lit/polimi/dagsymb/LouvainConfig;)V", "run");

		//Analysis params 
		p.setEvosuiteBudget(7200);
		p.setJBSEBudget(3600);
		p.setCoverage(Coverage.PATHS);
		p.setLogLevel(Level.DEBUG);
		
		/* Switch on/off the lines below according to which phase you want to run */
		///* Symbolic execution phase: */ p.setPhases(1, 2, 3, 4/*, 5*/); /*1=JBSE-traces, 2-merge, 3=JBSE-sushiPC, 4-Javac, 5-EvoSuite*/
		/* Symbolic execution phase: */ p.setPhases(4, 5); /*1=JBSE-traces, 2-merge, 3=JBSE-sushiPC, 4-Javac, 5-EvoSuite*/
		
		//Tmp out directories
		p.setOutDirectory(CommonSettings.TESTCASE_PATH);
		p.setTmpDirectoryBase(CommonSettings.TMP_BASE_PATH);
		p.setTmpDirectoryName("LOUVAIN");
		
		//Parallelism
		p.setRedundanceEvosuite(1);
		p.setParallelismEvosuite(10);
		
		//p.setUseMOSA(true);
	}

	@Override
	public void modify(JBSEParameters p) 
	throws FileNotFoundException, ParseException, IOException {		
		loadHEXFile(Paths.get("/Users", "denaro", "git", "louvain-modularity-spark", "esem", "it/polimi/dagsymb/settings/louvain.jbse").toString(), p);
	}	
	
	@Override
	public void modify(MinimizerParameters p) {
		//e.g., p.setBranchesToCover("ganttproject/DependencyGraph.*");
	}


	@Override
	public void modify(List<String> p) {
		//p.add("-Dpath_condition_check_first_target_call_only=true");
		//p.add("-Dpath_condition_check_at_method_exit=true");
		p.add("-Dobject_reuse_probability=0.8");
		p.add("-Delite=5");
		p.add("-Dinline=true");
	}
}
