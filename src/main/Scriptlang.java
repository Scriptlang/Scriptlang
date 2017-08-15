package main;

import com.parser.AST_Root;
import com.parser.ScriptlangParser;
import com.parser.SimpleNode;
import com.dbg.*;
import com.jit.JITCompiler;

public class Scriptlang {
	public static void help() {
		Dbg.setDebugging(true);
		Dbg.log("HELP\n\nUsage: java main.Scriptlang <testfile>\nExample: java main.Scriptlang ../test/ex1.sl\n\n(Note: current working directory must be <top>/bin)");
	}

	public static void main(String[] args) throws Exception {
		/* Check command line arguments */
		if(args.length < 1) {
			help();
			System.exit(1);
		}
		
		/* Enable debugging messages */
		Dbg.setDebugging(true);
		
		/* Instantiate parser */
		ScriptlangParser parser = new ScriptlangParser(new java.io.FileInputStream(args[0]));
		
		/* Parse input file */
		Dbg.log("1: Parsing '"+ args[0] +"'...");
		parser._Root();
		
		/* Dump the AST structure */
		if(Dbg.isDebugging())
			Dbg.log("Dumping Root AST..." + ((SimpleNode)parser.rootNode()).dumpStr("* ") + "\n");

		/* JIT Compile parsed file (compiles into the target and executes the result) */
		Dbg.log("2: JIT Compiling and running '"+ args[0] +"'...");
		JITCompiler.compile(((AST_Root)parser.rootNode()));
		
		/* All done */
		Dbg.log("3: Done parsing and interpreting '"+ args[0] +"'.");
		
		System.exit(0);
	}
}
