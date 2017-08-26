package com.slang.utils.dbg;

public class Dbg {
	private static boolean enabled = false;
	private final static String promptPrefix = "Slang";
	
	public static void setDebugging(boolean enableDebugging) {
		enabled = enableDebugging;
	}
	
	public static boolean isDebugging() {
		return enabled;
	}
	
	public static boolean log(Object o) {
		if(!enabled)
			return false;
		System.out.println(promptPrefix + "> " + o.toString());
		return true;
	}
}
