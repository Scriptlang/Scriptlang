package com.parser.nodes;

public class Node_Expression extends GenericNode {
	
	public enum ExpressionType {
		NULL,
		CONDOR,  /* ||           */
		CONDAND, /* &&           */
		INCOR,   /* |            */
		EXOR,    /* ^            */
		AND,     /* &            */
		EQUAL,   /* == , !=      */
		REL,     /* <, >, <=, >= */
		SHT,     /* <<, >>       */
		ADD,     /* + , -        */
		MUL,     /* * , / , %    */
		CAST,    /* (<type>)     */
		UNARY,   /* ~ , !        */
		BLOB     /* Multiple expressions */
	}
	
	ExpressionType type = ExpressionType.NULL;
	boolean returnable = false;
	
	public Node_Expression() {
		/* Create new generic type */
		super(Node_Expression.class);
	}
	
	public void set(ExpressionType type, boolean returnable) {
		this.type = type;
		this.returnable = returnable;
	}
}
