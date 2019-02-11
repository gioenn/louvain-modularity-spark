package it.polimi.dagsymb.settings;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;

import jbse.apps.run.Run;
import jbse.apps.run.RunParameters;
import jbse.apps.run.RunParameters.DecisionProcedureType;
import jbse.apps.run.RunParameters.StateFormatMode;
import jbse.apps.run.RunParameters.StepShowMode;
import jbse.apps.settings.ParseException;
import jbse.apps.settings.SettingsReader;
import jbse.jvm.EngineParameters.BreadthMode;
import jbse.jvm.EngineParameters.StateIdentificationMode;

public class LouvainJbseRunner {
	public static void main(String[] args) throws FileNotFoundException, ParseException, IOException {
		//prepares the parameters
		final RunParameters p = new RunParameters();
		
		//JBSE configuration
		p.addUserClasspath("./bin",
				"/Users/denaro/git/jbse-new/data/jre/rt.jar",
				"/Users/denaro/git/jbse-new/bin/");
		p.setDecisionProcedureType(DecisionProcedureType.Z3);
		p.setExternalDecisionProcedurePath("/Users/denaro/Desktop/RTools/Z3/z3-4.3.2.d548c51a984e-x64-osx-10.8.5/bin/z3");
		p.setOutputFileName("./out/JbsePromoCalls.txt");

		
		//Analysis configuration
		//p.setMethodSignature("com/xspark/varyingdag/examples/calls/PromoCalls", "(IJJI)V", "run_driver");
		p.setMethodSignature("com/xspark/varyingdag/examples/calls/PromoCallsFile", "(IJJI)V", "run_driver");


		SettingsReader rd = new SettingsReader("./src/com/xspark/varyingdag/examples/calls/promocalls.jbse");
		rd.fillRunParameters(p);
		//p.setHeapScope("ganttproject/Node", 3);
		//p.setDepthScope(5);
		//p.setIdentifierSubregion(".1.2.1.1.1.2.1.1.1.1.2.2.1");
		
				//what to show
		p.setStepShowMode(StepShowMode.LEAVES);
		p.setStateFormatMode(StateFormatMode.FULLTEXT);
		p.setShowWarnings(false);

		p.setShowSafe(true);
		p.setShowUnsafe(true);
		p.setShowOutOfScope(false);
		p.setShowContradictory(false);
		p.setShowDecisionProcedureInteraction(false);	
		
		//executes JBSE
		final Run r = new Run(p);
		r.run();
	}
}
