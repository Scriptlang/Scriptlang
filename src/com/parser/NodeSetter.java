package com.parser;

import com.parser.nodes.*;
import com.parser.nodes.Node_Expression.ExpressionType;
import com.parser.nodes.Node_Literal.LiteralType;
import com.parser.nodes.Node_TypeModifier.TypeModifier;
import com.parser.nodes.Node_TypePrimitive.TypePrimitive;

public class NodeSetter {
	
	GenericNode thisNode;
	final String NULLSTR = "(null)";
	
	GenericNode setThisNode(GenericNode node, String name) {
		thisNode = node;
		thisNode.name = name;
		thisNode.setIsLeaf(name != NULLSTR);
		return thisNode;
	}
	
	GenericNode setThisNode(GenericNode node) {
		return setThisNode(node, NULLSTR);
	}
		
	public GenericNode setTypePrimitive(String name, TypePrimitive type) {
		setThisNode(new Node_TypePrimitive(), name);
		((Node_TypePrimitive)thisNode).set(type);
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
	
	public GenericNode setExpr(String exprImage, ExpressionType type, boolean returnable) {
		setThisNode(new Node_Expression(), exprImage);
		((Node_Expression)thisNode).set(type, returnable);
		return thisNode;
	}
	
	public GenericNode setExpr(String exprImage, ExpressionType type) {
		return setExpr(exprImage, type, false);
	}
	
	public GenericNode setTypeModifier(String name, TypeModifier type) {
		setThisNode(new Node_TypeModifier(), name);
		((Node_TypeModifier)thisNode).set(type);
		return thisNode;
	}
}
