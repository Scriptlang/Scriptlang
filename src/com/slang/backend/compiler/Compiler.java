package com.slang.backend.compiler;

import com.slang.backend.target.translator.Translator;
import com.slang.frontend.parser.hirdag.HDAG;
import com.slang.frontend.parser.hirdag.HDAGLower;
import com.slang.utils.dbg.Dbg;

public class Compiler {
	
	public static CompilationUnit compile(HDAG ir_hdag) {
		CompilationUnit cu = new CompilationUnit();
		/* TODO
		 * Input: IR HDAG.
		 * Output: Bytecode */
		
		cu.ir_hdag = ir_hdag;
		
		Dbg.log("    3.1: Lowering from High Level to Low Level Intermediate DAG representation  | Form: Legal IR HDAG -> Legal IR LDAG");
		cu.ir_ldag = HDAGLower.lower(ir_hdag);
		
		Dbg.log("    3.2: Lowering from IR Low level DAG to Native Low Level Dag | Form: Legal IR LDAG -> Legal Native LDAG");
		cu.native_ldag = Translator.translate(cu.ir_ldag);
		
		Dbg.log("    3.3: Scheduling commands | Form: Legal Native LDAG -> Command List");
		/* TODO */
		
		Dbg.log("    3.4: Inserting prologue and epilogue commands into scheduling lists | Form: Command List -> Command List with pro-/epilogue");
		/* TODO */

		return cu;
	}
}
