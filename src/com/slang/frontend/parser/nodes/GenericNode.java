package com.slang.frontend.parser.nodes;

import java.util.HashMap;

public class GenericNode {
	private static HashMap<String, Integer> nodeTypeList = null;
	private boolean init = false;
	private boolean isLeaf = false;
	
	private void createNodeType(String nodeObjectClassname) {
		nodeTypeList.put(nodeObjectClassname, nodeTypeList.size());
	}
	
	/* Every node has... */
	public String name;     /* A name (optional if *NOT* leaf node) */
	public String nodeName; /* And a name of the type of node       */
	
	public GenericNode(Class<?> nodeObject) {
		/* Get node class name */
		String nodeObjectClassname = nodeObject.getName().trim().toUpperCase();
		nodeObjectClassname = nodeObjectClassname.substring(nodeObjectClassname.indexOf(".NODE_") + 6, nodeObjectClassname.length());		
		
		/* Initialize list of node types */
		if(nodeTypeList == null)
			nodeTypeList = new HashMap<String, Integer>();
		
		/* Add new node type to the list if it doesn't exist yet */
		if(!nodeTypeList.containsKey(nodeObjectClassname))
			createNodeType(nodeObjectClassname);
		
		/* Set the rest of the node's data */
		nodeName = nodeObjectClassname;
		name = "(null)";
	}
	
	public void setIsLeaf(boolean isLeaf) {
		if(!init) {
			this.isLeaf = isLeaf;
			init = true;
		}
	}
	
	public boolean isNodeLeaf() {
		return isLeaf;
	}
}
