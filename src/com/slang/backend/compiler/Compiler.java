package com.slang.backend.compiler;

import com.slang.backend.lirdag.LDAGLower;
import com.slang.backend.target.translator.Translator;
import com.slang.frontend.parser.AST_Root;
import com.slang.utils.dbg.Dbg;

public class Compiler {
	
	public static CompilationUnit compile(AST_Root astRoot) {
		CompilationUnit cu = new CompilationUnit();
		/* TODO
		 * Input: IR HDAG.
		 * Output: Bytecode */
		
		cu.astRoot = astRoot;
		
		Dbg.log("    3.1: Lowering from High Level to Low Level Intermediate DAG representation  | Form: Legal AST -> Legal IR LDAG");
		cu.ir_ldag = LDAGLower.lower(astRoot);
		
		Dbg.log("    3.2: Lowering from IR Low level DAG to Native Low Level Dag | Form: Legal IR LDAG -> Legal Native LDAG");
		cu.native_ldag = Translator.translate(cu.ir_ldag);
		
		Dbg.log("    3.3: Scheduling commands | Form: Legal Native LDAG -> Command List");
		/* TODO */
		
		Dbg.log("    3.4: Inserting prologue and epilogue commands into scheduling lists | Form: Command List -> Command List with pro-/epilogue");
		/* TODO */

		return cu;
	}
}
