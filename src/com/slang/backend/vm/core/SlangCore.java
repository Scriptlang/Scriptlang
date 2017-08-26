package com.slang.backend.vm.core;

import com.slang.backend.vm.core.register.Flag;
import com.slang.backend.vm.core.register.RegisterScalar;
import com.slang.backend.vm.core.register.RegisterVector;

public class SlangCore {
	
	/**
	 * Each SlangCore instance executes
	 * a single block unit node and contains
	 * a set of the following:
	 **/
	
	RegisterScalar regs_scalar = null;
	RegisterVector regs_vector = null;
	Flag flags = null;
	Calculator alu = null;
	
	/** They may or may not be references
	 *  to a unique static copy **/
	
	public SlangCore() {
		
	}
}
