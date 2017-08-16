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
		ADD,     /* + , -        */
		MUL,     /* * , / , %    */
		UNARY,   /* ~ , !        */
		PRIMARY  /* <literal> , <identifier> , <expression> */
	}
	
	ExpressionType type = ExpressionType.NULL;
	
	public Node_Expression() {
		/* Create new generic type */
		super(Node_Expression.class);
	}
	
	public void set(ExpressionType type) {
		this.type = type;
	}
}
