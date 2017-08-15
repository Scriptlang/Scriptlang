package com.parser.nodes;

public class Node_PrimitiveType extends GenericNode {
	
	/**---------------------------------------------**/
	/** Scriptlang's primitive data types supported **/
	/**---------------------------------------------**/
	public enum PrimitiveType {
		NULL,
		U8,    U16,   U32,   U64,
		I8,    I16,   I32,   I64,
		F32,   F64,   BOOL,  CHAR,
		USIZE, ISIZE, ARRAY, AUTO,
	}
	
	/* TODO Add types: tuple and class objects */
	
	PrimitiveType type;
	
	public Node_PrimitiveType() {
		/* Create new generic type */
		super(Node_PrimitiveType.class);
	}
	
	public void set(PrimitiveType type) {
		this.type = type;
	}
}
