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
	String suffix = null;
	int max_bitcount = 0;
	
	public Node_Literal() {
		/* Create new generic type */
		super(Node_Literal.class);
	}
	
	private void determineLiteralMaxBitcount() {
		String literalImage = name;
		
		/* TODO */
		
		switch(type) {
		case INT_BIN:
		case INT_OCT:
		case INT_DEC:
		case INT_HEX:
		case STRING:
		default: break;
		}
	}

	public void set(LiteralType type) {
		this.type = type;
		
		/* Set maximum allowable bit count / size for this literal */
		switch(type) {
		case FLOAT32: max_bitcount = 32; break;
		case FLOAT64: max_bitcount = 64; break;
		case BOOL:    max_bitcount = 1;  break;
		case CHAR:    max_bitcount = 4;  break;
		default: /* TODO */              break;
		}
	}
	
	public void setSuffix(String suffix) {
		this.suffix = suffix;
		determineLiteralMaxBitcount();
	}
}
