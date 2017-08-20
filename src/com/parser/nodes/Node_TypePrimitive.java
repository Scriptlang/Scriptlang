package com.parser.nodes;

public class Node_TypePrimitive extends GenericNode {
	
	/**---------------------------------------------**/
	/** Scriptlang's primitive data types supported **/
	/**---------------------------------------------**/
	public enum TypePrimitive {
		NULL,
		U8,     U16,   U32,   U64,
		I8,     I16,   I32,   I64,
		F32,    F64,   BOOL,  CHAR,
		STRING, USIZE, ISIZE, ARRAY,
		AUTO,   TYPE
	}
	
	/* TODO Add types: tuple and class objects */
	
	TypePrimitive type = TypePrimitive.NULL;
	
	public Node_TypePrimitive() {
		/* Create new generic type */
		super(Node_TypePrimitive.class);
	}
	
	public void set(TypePrimitive type) {
		this.type = type;
	}
}
