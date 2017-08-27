package com.slang.backend.compiler;

import com.slang.backend.lirdag.LDAG;
import com.slang.frontend.parser.hirdag.HDAG;

public class CompilationUnit {
	public HDAG ir_hdag;
	public LDAG ir_ldag;
	/* Bytecode */
	public LDAG native_ldag;
	/* Target Assembly */
	/* Target Command List */
}
