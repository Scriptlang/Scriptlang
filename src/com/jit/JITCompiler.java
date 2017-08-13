package com.jit;

import com.dbg.Dbg;
import com.parser.AST_Root;

public class JITCompiler {
	
	public static void JITCompile(AST_Root root) {
		Dbg.log("  2.1: Lowering from AST to Intermediate DAG representation  | Form: AST -> DAG");
		Dbg.log("  2.2: Legalizing DAGs | Form: Not legalized Intermediate DAG -> Legalized Intermediate DAG");
		Dbg.log("  2.3: Selecting commands | Form: Intermediate DAG -> Native DAG");
		Dbg.log("  2.4: Scheduling commands | Form: Native DAG -> Command List");
		Dbg.log("  2.5: Inserting prologue and epilogue commands into scheduling lists | Form: Command List -> Command List with pro-/epilogue");
		Dbg.log("  2.6: Printing target source code (optional) | Form: Command List with pro-/epilogue -> .bat / .sh source code");
		Dbg.log("  2.7: Executing program with command scheduling | Method: Interpret normal language and execute native commands (based on their schedule (or not))");
	}
}
