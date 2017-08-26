package com.slang.frontend.parser;

import com.slang.frontend.parser.nodes.*;
import com.slang.frontend.parser.nodes.Node_Expression.ExpressionType;
import com.slang.frontend.parser.nodes.Node_Literal.LiteralType;
import com.slang.frontend.parser.nodes.Node_Type.*;
import com.slang.utils.*;

public class NodeSetter {
	
	protected GenericNode thisNode = null;
	
	public GenericNode getThisNode() {
		return thisNode;
	}
	
	private GenericNode setThisNode(GenericNode node, String name) {
		thisNode = node;
		thisNode.name = name;
		thisNode.setIsLeaf(name != Utils.NULLSTR);
		return thisNode;
	}

	public GenericNode setType(String name, TypePrimitive type, TypeModifier modifier, TypeAccessModifier access) {
		if(thisNode == null)			
			setThisNode(new Node_Type(), name);
		else
			thisNode.name = name + "|" + thisNode.name;

		/****** If 'thisNode' NOT null: ******
		 *  Node was already allocated.
		 *  We might want to set some type properties instead at this point
		 *  (modifiers and access modifiers) **/

		((Node_Type)thisNode).set(type, modifier, access);
		return thisNode;
	}
	
	public GenericNode setType(TypePrimitive type, TypeModifier modifier, TypeAccessModifier access) {
		return setType(null, type, modifier, access);
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
}
