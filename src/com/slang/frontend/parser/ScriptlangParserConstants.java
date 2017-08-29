/* Generated By:JJTree&JavaCC: Do not edit this line. ScriptlangParserConstants.java */
/** ScriptLangParser Class - BEGIN **/
package com.slang.frontend.parser;


/**
 * Token literal values and constants.
 * Generated by org.javacc.parser.OtherFilesGen#start()
 */
public interface ScriptlangParserConstants {

  /** End of File. */
  int EOF = 0;
  /** RegularExpression Id. */
  int SINGLE_LINE_COMMENT = 8;
  /** RegularExpression Id. */
  int FORMAL_COMMENT = 9;
  /** RegularExpression Id. */
  int MULTI_LINE_COMMENT = 10;
  /** RegularExpression Id. */
  int LBRACE = 12;
  /** RegularExpression Id. */
  int RBRACE = 13;
  /** RegularExpression Id. */
  int U8 = 14;
  /** RegularExpression Id. */
  int U16 = 15;
  /** RegularExpression Id. */
  int U32 = 16;
  /** RegularExpression Id. */
  int U64 = 17;
  /** RegularExpression Id. */
  int I8 = 18;
  /** RegularExpression Id. */
  int I16 = 19;
  /** RegularExpression Id. */
  int I32 = 20;
  /** RegularExpression Id. */
  int I64 = 21;
  /** RegularExpression Id. */
  int F32 = 22;
  /** RegularExpression Id. */
  int F64 = 23;
  /** RegularExpression Id. */
  int BOOL = 24;
  /** RegularExpression Id. */
  int CHAR = 25;
  /** RegularExpression Id. */
  int STRING = 26;
  /** RegularExpression Id. */
  int USIZE = 27;
  /** RegularExpression Id. */
  int ISIZE = 28;
  /** RegularExpression Id. */
  int ARRAY = 29;
  /** RegularExpression Id. */
  int AUTO = 30;
  /** RegularExpression Id. */
  int TYPE = 31;
  /** RegularExpression Id. */
  int MOD = 32;
  /** RegularExpression Id. */
  int LITERAL_SUFFIX = 33;
  /** RegularExpression Id. */
  int LITERAL_INT_BIN = 34;
  /** RegularExpression Id. */
  int LITERAL_INT_OCT = 35;
  /** RegularExpression Id. */
  int LITERAL_INT_DEC = 36;
  /** RegularExpression Id. */
  int LITERAL_INT_HEX = 37;
  /** RegularExpression Id. */
  int LITERAL_FLOAT32 = 38;
  /** RegularExpression Id. */
  int LITERAL_FLOAT64 = 39;
  /** RegularExpression Id. */
  int LITERAL_BOOL = 40;
  /** RegularExpression Id. */
  int FN = 41;
  /** RegularExpression Id. */
  int CLASS = 42;
  /** RegularExpression Id. */
  int STRUCT = 43;
  /** RegularExpression Id. */
  int ENUM = 44;
  /** RegularExpression Id. */
  int PUB = 45;
  /** RegularExpression Id. */
  int PRIV = 46;
  /** RegularExpression Id. */
  int PROT = 47;
  /** RegularExpression Id. */
  int IF = 48;
  /** RegularExpression Id. */
  int ELSE = 49;
  /** RegularExpression Id. */
  int SWITCH = 50;
  /** RegularExpression Id. */
  int FOR = 51;
  /** RegularExpression Id. */
  int WHILE = 52;
  /** RegularExpression Id. */
  int BREAK = 53;
  /** RegularExpression Id. */
  int CONTINUE = 54;
  /** RegularExpression Id. */
  int RETURN = 55;
  /** RegularExpression Id. */
  int BIND = 56;
  /** RegularExpression Id. */
  int NEW = 57;
  /** RegularExpression Id. */
  int UNSAFE = 58;
  /** RegularExpression Id. */
  int IDENTIFIER = 59;
  /** RegularExpression Id. */
  int CHARACTER_LITERAL = 60;
  /** RegularExpression Id. */
  int STRING_LITERAL = 61;
  /** RegularExpression Id. */
  int LETTER = 62;
  /** RegularExpression Id. */
  int DIGIT_BIN = 63;
  /** RegularExpression Id. */
  int DIGIT_OCT = 64;
  /** RegularExpression Id. */
  int DIGIT_DEC = 65;
  /** RegularExpression Id. */
  int DIGIT_HEX = 66;

  /** Lexical state. */
  int DEFAULT = 0;
  /** Lexical state. */
  int IN_SINGLE_LINE_COMMENT = 1;
  /** Lexical state. */
  int IN_FORMAL_COMMENT = 2;
  /** Lexical state. */
  int IN_MULTI_LINE_COMMENT = 3;

  /** Literal token values. */
  String[] tokenImage = {
    "<EOF>",
    "\" \"",
    "\"\\t\"",
    "\"\\n\"",
    "\"\\r\"",
    "\"//\"",
    "<token of kind 6>",
    "\"/*\"",
    "<SINGLE_LINE_COMMENT>",
    "\"*/\"",
    "\"*/\"",
    "<token of kind 11>",
    "\"{\"",
    "\"}\"",
    "\"u8\"",
    "\"u16\"",
    "\"u32\"",
    "\"u64\"",
    "\"i8\"",
    "\"i16\"",
    "\"i32\"",
    "\"i64\"",
    "\"f32\"",
    "\"f64\"",
    "\"bool\"",
    "\"char\"",
    "\"string\"",
    "\"usize\"",
    "\"isize\"",
    "\"array\"",
    "\"auto\"",
    "\"type\"",
    "\"module\"",
    "<LITERAL_SUFFIX>",
    "<LITERAL_INT_BIN>",
    "<LITERAL_INT_OCT>",
    "<LITERAL_INT_DEC>",
    "<LITERAL_INT_HEX>",
    "<LITERAL_FLOAT32>",
    "<LITERAL_FLOAT64>",
    "<LITERAL_BOOL>",
    "\"fn\"",
    "\"class\"",
    "\"struct\"",
    "\"enum\"",
    "\"public\"",
    "\"private\"",
    "\"protected\"",
    "\"if\"",
    "\"else\"",
    "\"switch\"",
    "\"for\"",
    "\"while\"",
    "\"break\"",
    "\"continue\"",
    "\"return\"",
    "\"@\"",
    "\"new\"",
    "\"unsafe\"",
    "<IDENTIFIER>",
    "<CHARACTER_LITERAL>",
    "<STRING_LITERAL>",
    "<LETTER>",
    "<DIGIT_BIN>",
    "<DIGIT_OCT>",
    "<DIGIT_DEC>",
    "<DIGIT_HEX>",
    "\":\"",
    "\";\"",
    "\"(\"",
    "\")\"",
    "\",\"",
    "\"[\"",
    "\"]\"",
    "\"=\"",
    "\"*=\"",
    "\"/=\"",
    "\"+=\"",
    "\"-=\"",
    "\">>=\"",
    "\"<<=\"",
    "\"&=\"",
    "\"|=\"",
    "\"^=\"",
    "\"%=\"",
    "\"?\"",
    "\"||\"",
    "\"&&\"",
    "\"|\"",
    "\"^\"",
    "\"&\"",
    "\"==\"",
    "\"!=\"",
    "\"<\"",
    "\">\"",
    "\"<=\"",
    "\">=\"",
    "\"<<\"",
    "\">>\"",
    "\"+\"",
    "\"-\"",
    "\"*\"",
    "\"/\"",
    "\"%\"",
    "\"++\"",
    "\"--\"",
    "\"~\"",
    "\"!\"",
    "\".\"",
    "\"->\"",
  };

}