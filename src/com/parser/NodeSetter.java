package com.parser;

import com.parser.nodes.GenericNode;
import com.parser.nodes.Node_PrimitiveType;
import com.parser.nodes.Node_PrimitiveType.PrimitiveType;
import com.parser.nodes.Node_DeclVariable;
import com.parser.nodes.Node_Identifier;

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
	
	public GenericNode setVariable(Node_PrimitiveType nodePrimitiveType, Node_Identifier nodeIdentifier) {
		setThisNode(new Node_DeclVariable());
		((Node_DeclVariable)thisNode).set(nodePrimitiveType, nodeIdentifier);
		return thisNode;
	}
	
	public GenericNode setPrimitiveType(String name, PrimitiveType type) {
		setThisNode(new Node_PrimitiveType(), name);
		((Node_PrimitiveType)thisNode).set(type);
		return thisNode;
	}
	
	public GenericNode setIdentifier(String name) {
		return setThisNode(new Node_Identifier(), name);
	}
}
