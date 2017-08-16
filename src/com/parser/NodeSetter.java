package com.parser;

import com.parser.nodes.*;
import com.parser.nodes.Node_Expression.ExpressionType;
import com.parser.nodes.Node_Literal.LiteralType;
import com.parser.nodes.Node_PrimitiveType.PrimitiveType;

public class NodeSetter {
	
	GenericNode thisNode;
	
	GenericNode setThisNode(GenericNode node, String name) {
		thisNode = node;
		thisNode.name = name;
		thisNode.setIsLeaf(name != "(null)");
		return thisNode;
	}
	
	GenericNode setThisNode(GenericNode node) {
		return setThisNode(node, "(null)");
	}
		
	public GenericNode setPrimitiveType(String name, PrimitiveType type) {
		setThisNode(new Node_PrimitiveType(), name);
		((Node_PrimitiveType)thisNode).set(type);
		return thisNode;
	}
	
	public GenericNode setIdentifier(String name) {
		return setThisNode(new Node_Identifier(), name);
	}
	
	public GenericNode setLiteral(String literalImage, LiteralType type) {
		setThisNode(new Node_Literal(), literalImage);
		((Node_Literal)thisNode).set(type);
		return thisNode;
	}
	
	public GenericNode setExpr(String exprImage, ExpressionType type) {
		setThisNode(new Node_Expression(), exprImage);
		((Node_Expression)thisNode).set(type);
		return thisNode;
	}
}
