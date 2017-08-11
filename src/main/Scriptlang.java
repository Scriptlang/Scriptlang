package main;

import com.parser.ScriptlangParser;

class Dbg {
	private static boolean enabled = false;
	private final static String promptPrefix = "Scriptlang";
	
	public static void setDebugging(boolean enableDebugging) {
		enabled = enableDebugging;
	}
	
	public static boolean log(Object o) {
		if(!enabled)
			return false;
		System.out.println(promptPrefix + "> " + o.toString());
		return true;
	}
}

public class Scriptlang {
	public static void help() {
		Dbg.setDebugging(true);
		Dbg.log("HELP\nUsage: java main.Scriptlang <testfile>\nExample: java main.Scriptlang ../test/ex1.sl\n\n(Note: Current working directory must be <PROJECTFOLDER>/bin)");
	}	

	@SuppressWarnings("static-access")
	public static void main(String[] args) throws Exception {
		/* Check command line arguments */
		if(args.length < 1) {
			help();
			System.exit(1);
		}
		
		/* Enable debugging messages */
		Dbg.setDebugging(true);
		Dbg.log("Parsing '"+ args[0] +"'...");
		
		/* Instantiate parser */
		ScriptlangParser parser = new ScriptlangParser(new java.io.FileInputStream(args[0]));
		
		/* Parse input file */
		parser.Input();
		
		/* All done */
		Dbg.log("Done parsing '"+ args[0] +"'.");
		
		System.exit(0);
	}
}
