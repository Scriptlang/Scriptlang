package com.slang.backend.isdag;

public class DAGStructural {
	
	/** These nodes represent
	 *  the structural constructs/data types of the language
	 *  that mutually serve the operational nodes.
	 *  For instance a register, a number, a vector, etc. **/

	enum Kind {
		REG,   /* Mutable r/lvalue                             */
		CONST, /* Integer / Floating Point / Character rvalue  */
		ENUM,  /* Constant Symbolic rvalue                     */
		OBJECT /* Unresolved external generic r/lvalue         */
	}
}
