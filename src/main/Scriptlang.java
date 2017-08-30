package main;

import com.slang.backend.compiler.CompilationUnit;
import com.slang.backend.compiler.Compiler;
import com.slang.backend.jitcompiler.JITCompiler;
import com.slang.frontend.parser.AST_Root;
import com.slang.frontend.parser.ScriptlangParser;
import com.slang.frontend.parser.SimpleNode;
import com.slang.utils.cmdline.CMDLine;
import com.slang.utils.dbg.*;

public class Scriptlang {

	public static void main(String[] args) throws Exception {
		/* Setup supported Command Line flags */
		CMDLine.addFlags(
			"dbg", "Enable debugging messages",
			"jit", "Compile BlockUnit IR HDAG and Execute it on the VM"
		);
		
		/* Execute help method with the following settings */
		CMDLine.setHelpCondition(
			CMDLine.HelpCondition.WHEN_NOARGS,        /* Call help() when user does not provide arguments */
			CMDLine.HelpResponse.HELP_AND_QUIT,       /* When help() is called, also quit the program     */
			CMDLine.HelpResponse.HELP_WARNONLY_NOHELP /* On an invalid flag, only warn the user           */
		);

		/* Set usage message */
		CMDLine.setUsage("java -jar sl.jar <testfile>\\nExample: java -jar sl.jar ex1.sl");

		/* Parse Command Line arguments */
		CMDLine.parse(args);

		/* Enable or disable debugging messages */		
		Dbg.setDebugging(CMDLine.hasOption("dbg"));

		/* Instantiate parser */
		ScriptlangParser parser = new ScriptlangParser(new java.io.FileInputStream(args[0]));
		
		/* Parse and Dump AST */
		Dbg.log("1: Parsing '"+ args[0] +"'...");
		parser._Root();
		if(Dbg.isDebugging())
			Dbg.log("Dumping Root AST..." + ((SimpleNode)parser.rootNode()).dumpStr("* ") + "\n");

		Dbg.log("2: Legalizing High Level AST | Form: AST -> Legal AST");
		AST_Root astRoot = (AST_Root)parser.rootNode().legalizeAllChildren(null, 0);

		if(args[1] == "-jit") {
			Dbg.log("3: JIT Compiling into bytecode | Form: Legal AST -> Bytecode");	
			CompilationUnit cu = JITCompiler.compile(astRoot);
		} else {
			Dbg.log("3: Compiling into bytecode | Form: Legal AST -> Bytecode");	
			CompilationUnit cu = Compiler.compile(astRoot);
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
