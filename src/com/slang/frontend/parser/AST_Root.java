/* Generated By:JJTree: Do not edit this line. AST_Root.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=true,NODE_PREFIX=AST,NODE_EXTENDS=NodeSetter,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package com.slang.frontend.parser;

public
class AST_Root extends SimpleNode {
  public AST_Root(int id) {
    super(id);
  }

  public AST_Root(ScriptlangParser p, int id) {
    super(p, id);
  }

  public Node legalize(Node parent, int astDepth) {
	  if(parent != null || astDepth > 0)
		  return null;
	  else
		  return this;
  }

}
/* JavaCC - OriginalChecksum=0f2a6b62fa60786d1a0ec2d8a82924a8 (do not edit this line) */
