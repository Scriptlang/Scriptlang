package com.slang.backend.target.translator;

import com.slang.backend.lirdag.LDAG;
import com.slang.utils.dbg.Dbg;

public class Translator {
	
	/** The Translator is responsible for converting
	 *  intermediate code into target native code **/
	
	public static LDAG translate(LDAG ir_ldag) {
		LDAG native_ldag = new LDAG();
		/* TODO: Request the specified target to translate
		 * this Intermediate Representation LDAG
		 * into Native LDAG */
		
		/* TODO */
		
		Dbg.log("        3.2.1: Selecting commands for the runcmd IR LDAG nodes "
				+ "| Form: IR LDAG (CMD Nodes only) -> Native LDAG CMD Nodes");
		/* TODO */
		
		return native_ldag;
	}
}
