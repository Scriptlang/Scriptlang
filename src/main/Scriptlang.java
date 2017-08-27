package main;

import com.slang.backend.compiler.CompilationUnit;
import com.slang.backend.compiler.Compiler;
import com.slang.backend.jitcompiler.JITCompiler;
import com.slang.backend.lirdag.LDAG;
import com.slang.backend.target.translator.Translator;
import com.slang.frontend.parser.AST_Root;
import com.slang.frontend.parser.ScriptlangParser;
import com.slang.frontend.parser.SimpleNode;
import com.slang.frontend.parser.hirdag.HDAG;
import com.slang.frontend.parser.hirdag.HDAGLegalize;
import com.slang.frontend.parser.hirdag.HDAGLower;
import com.slang.utils.dbg.*;

public class Scriptlang {
	
	public static void help() {
		Dbg.setDebugging(true);
		Dbg.log("HELP\n\nUsage: java -jar sl.jar <testfile>\nExample: java -jar sl.jar ex1.sl\n");
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
		
		Dbg.log("1: Parsing '"+ args[0] +"'...");
		parser._Root();
		
		/* Dump the AST structure */
		if(Dbg.isDebugging())
			Dbg.log("Dumping Root AST..." + ((SimpleNode)parser.rootNode()).dumpStr("* ") + "\n");

		Dbg.log("2: Converting and Legalizing from High Level AST to High Level Intermediate DAG representation  | Form: AST -> Legal IR HDAG");
		HDAG ir_hdag = HDAGLegalize.convert(((AST_Root)parser.rootNode()));

		if(args[1] == "-jit") {
			Dbg.log("3: JIT Compiling into bytecode | Form: Legal IR HDAG -> Bytecode");	
			CompilationUnit cu = JITCompiler.compile(ir_hdag);
		} else {
			Dbg.log("3: Compiling into bytecode | Form: Legal IR HDAG -> Bytecode");	
			CompilationUnit cu = Compiler.compile(ir_hdag);
		}

		Dbg.log("4: Printing target source code (optional) | Form: Command List with pro-/epilogue -> .bat / .sh source code");
		/* TODO */
		
		Dbg.log("5: Executing program with command scheduling | Method: Interpret normal language and execute native commands (based on their schedule (or not))");
		/* TODO */
		
		/**----------**/
		/** All done **/
		/**----------**/
		Dbg.log("6: Done parsing and interpreting '"+ args[0] +"'.");
		System.exit(0);
	}
}
