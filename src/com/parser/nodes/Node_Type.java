package com.parser.nodes;

import java.util.ArrayList;
import java.util.List;

public class Node_Type extends GenericNode {
	
	/**-----------------------**/
	/** Scriptlang data types **/
	/**-----------------------**/
	public enum TypePrimitive {
		NULL,
		U8,     U16,   U32,   U64, /* Unsigned integers                                                                        */
		I8,     I16,   I32,   I64, /* Signed integers                                                                          */
		F32,    F64,               /* Floating point numbers                                                                   */
		BOOL,                      /* Boolean (1 bit wide)                                                                     */
		CHAR,                      /* Character (4 bytes wide (Unicode))                                                       */
		STRING,                    /* A chain of characters (4 bytes each)                                                     */
		USIZE,  ISIZE,             /* Un/signed integers (bit width depends on host CPU architecture)                          */
		ARRAY,                     /* An array of variables of any kind of data type                                           */
		AUTO,                      /* Data type used for type inference                                                        */
		TYPE,                      /* A data type that holds... data types                                                     */
		MODULE,                    /* A data type that holds an entire BlockUnit (reference only)                              */
		VOIDFN,                    /* A void data type used only for functions (not legal for lambdas and objects)             */
		CLASS_STRUCT               /* An OOP Class/Struct. (It does not have a special keyword, that's why it's declared last) */
	}

	/**--------------------------------**/
	/** Scriptlang data type modifiers **/
	/**--------------------------------**/
	public enum TypeModifier {
		NULL,        /* No modifier                                                   */
		ARRAYUNIQUE, /* Arrays of the same data type                                  */
		ARRAYSLICE,  /* A reference to a portion of an array                          */
		TYPEDEFED,   /* Custom data type                                              */
		RESIZED,     /* An integer with custom size (suffixes)                        */
		TUPLE,       /* This data type contains a fixed sized set of other data types */
		POINTER,     /* A pointer modifier                                            */
		REF          /* A reference modifier (aka a constant pointer)                 */
	}
	
	/**---------------------------------------**/
	/** Scriptlang data type access modifiers **/
	/**---------------------------------------**/
	public enum TypeAccessModifier {
		NULL, /* No modifier */
		PUBLIC,
		PRIVATE,
		PROTECTED
	}

	TypePrimitive type = TypePrimitive.NULL;
	List<TypeModifier> modifier = null;
	TypeAccessModifier access = TypeAccessModifier.NULL;
	
	public Node_Type() {
		/* Create new generic type */
		super(Node_Type.class);
	}
	
	private void updateName(String appendName) {
		name = (name == null ? "" : name + "|") + appendName;
	}
	
	public void set(TypePrimitive type, TypeModifier modifier, TypeAccessModifier access) {
		/********************************/
		/** Set this data type's type: **/
		/********************************/
		if(this.type != null) {
			if(type != null) {
				this.type = type;
				updateName("TYPE:" + type);
			}
		} else {
			/* Can't have a single scalar variable of multiple types */
			throw new UnsupportedOperationException();
		}
		
		/************************************/
		/** Set this data type's modifier: **/
		/************************************/
		if(modifier != null) {
			if(this.modifier == null) {
				this.modifier = new ArrayList<TypeModifier>();
				updateName("MODIFIER:" + modifier);
			} else {
				this.name += "," + modifier;
			}
			this.modifier.add(modifier);
		}
		
		/***************************************/
		/** Set this data type's access type: **/
		/***************************************/
		if(this.access != null) {
			if(access != null) {
				this.access = access;
				updateName("ACCESS:" + access);
			} 
		} else {
			/* Can't have multiple access modifiers */
			throw new UnsupportedOperationException();
		}
	}
}
