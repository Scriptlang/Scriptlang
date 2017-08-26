package com.slang.frontend.parser.nodes;

public class Node_Identifier extends GenericNode {
	
	/* This node contains no operands. Its only value is its name
	 * and it is stored in the super class */
	
	public Node_Identifier() {
		/* Create new generic type */
		super(Node_Identifier.class);
	}
}
