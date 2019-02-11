package it.polimi.dagsymb.settings;

import java.nio.file.Path;
import java.nio.file.Paths;

public final class CommonSettings {
	public static final Path BIN_PATH       = Paths.get("/Users", "denaro", "git", "louvain-modularity-spark", "target", "classes");
	public static final Path JBSE_PATH      = Paths.get("/Users", "denaro", "git", "sushi20190206", "jbse", "bin", "main");
	public static final Path TMP_BASE_PATH  = Paths.get("/Users", "denaro", "git", "louvain-modularity-spark", "out");
	public static final Path EVOSUITE_PATH  = Paths.get("/Users", "denaro", "git", "sushi20190206", "evosuite", "evosuite-shaded-1.0.3.jar");
	//public static final Path EVOSUITE_PATH  = Paths.get("/Users", "denaro", "git", "sushi20190206", "evosuite", "evosuite-shaded-1.0.6-SNAPSHOT.jar");
	public static final Path SUSHI_LIB_PATH = Paths.get("/Users", "denaro", "git", "sushi20190206", "runtime", "bin", "main");
	public static final Path Z3_PATH        = Paths.get("/Users", "denaro", "Desktop", "RTools", "Z3", "z3-4.3.2.d548c51a984e-x64-osx-10.8.5", "bin", "z3");
	public static final Path TESTCASE_PATH  = Paths.get("/Users", "denaro", "git", "louvain-modularity-spark", "testgen");
	public static final Path ESEM_MOCK_PATH	= Paths.get("/Users", "denaro", "Documents", "workspaces", "workspaceXSpark", "EsemRuntime", "bin");
}
