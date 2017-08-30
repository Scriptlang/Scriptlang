package com.slang.backend.compiler;

import com.slang.backend.lirdag.LDAG;
import com.slang.frontend.parser.AST_Root;

public class CompilationUnit {
	public AST_Root astRoot;;
	public LDAG ir_ldag;
	/* Bytecode */
	public LDAG native_ldag;
	/* Target Assembly */
	/* Target Command List */
}
