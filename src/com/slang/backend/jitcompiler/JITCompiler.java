package com.slang.backend.jitcompiler;

import com.slang.backend.compiler.CompilationUnit;
import com.slang.backend.compiler.Compiler;
import com.slang.frontend.parser.AST_Root;

public class JITCompiler {
	
	public static CompilationUnit compile(AST_Root astRoot) {
		CompilationUnit cu = Compiler.compile(astRoot);
		/* TODO */
		return cu;
	}
}
