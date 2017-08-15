package com.parser.nodes;

public class Node_DeclVariable extends GenericNode {
	
	/* A variable declaration node is composed of: */
	Node_PrimitiveType nodePrimitiveType; /* A primitive data type node    */
	Node_Identifier    nodeIdentifier;    /* An identifier                 */
	Node_Assignment    nodeAssignment;    /* An *optional* assignment node */
	
	public Node_DeclVariable() {
		/* Create new generic type */
		super(Node_DeclVariable.class);
	}
	
	public void set(Node_PrimitiveType nodePrimitiveType, Node_Identifier nodeIdentifier, Node_Assignment nodeAssignment) {
		/* Set node operands */
		this.nodePrimitiveType = nodePrimitiveType;
		this.nodeIdentifier    = nodeIdentifier;	
		this.nodeAssignment    = nodeAssignment;
	}
	
	public void set(Node_PrimitiveType nodePrimitiveType, Node_Identifier nodeIdentifier) {
		set(nodePrimitiveType, nodeIdentifier, null);
	}
}
