package com.slang.backend.jitcompiler;

import com.slang.backend.compiler.CompilationUnit;
import com.slang.backend.compiler.Compiler;
import com.slang.frontend.parser.hirdag.HDAG;

public class JITCompiler {
	
	public static CompilationUnit compile(HDAG ir_hdag) {
		CompilationUnit cu = Compiler.compile(ir_hdag);
		/* TODO */
		return cu;
	}
}
