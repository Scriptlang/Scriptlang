package com.slang.backend.isdag;

public class DAGOperational {
	
	/** These nodes represent
	 *  the operational constructs of the language that
	 *  act upon the structural nodes.
	 *  For instance, addition, subtraction, a call
	 *  to a function, etc. **/
	
	enum Kind {
		MATH,  /* Arithmetic/Logic */
		GOTO,  /* Branch           */
		MOV,   /* Register Access  */
		ALLOC, /* Allocate         */
		RUNCMD /* Run Command      */
	}
}
