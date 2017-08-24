package com.parser.nodes;

public class Node_Literal extends GenericNode {
	
	/**------------------------------------------**/
	/** Scriptlang's literal constants supported **/
	/**------------------------------------------**/
	public enum LiteralType {
		NULL,
		INT_BIN, INT_OCT, INT_DEC, INT_HEX, /* Integers   */
		FLOAT32, FLOAT64,                   /* Floats     */
		BOOL,                               /* Booleans   */
		CHAR,                               /* Characters */
		STRING                              /* Strings    */
	}
	
	LiteralType type = LiteralType.NULL;
	
	public Node_Literal() {
		/* Create new generic type */
		super(Node_Literal.class);
	}
	
	public void set(LiteralType type) {
		this.type = type;
	}
}
