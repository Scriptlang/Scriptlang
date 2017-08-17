package com.parser.nodes;

public class Node_TypeModifier extends GenericNode {
	
	/**---------------------------------------**/
	/** Scriptlang's type modifiers supported **/
	/**---------------------------------------**/
	public enum TypeModifier {
		NULL,
		PUB, /* Public  */
		PRIV /* Private */
	}
	
	TypeModifier type = TypeModifier.NULL;
	
	public Node_TypeModifier() {
		/* Create new generic type */
		super(Node_TypeModifier.class);
	}
	
	public void set(TypeModifier type) {
		this.type = type;
	}
}
