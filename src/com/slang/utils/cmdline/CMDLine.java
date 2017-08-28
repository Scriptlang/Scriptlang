package com.slang.utils.cmdline;

import java.util.ArrayList;
import java.util.List;

public class CMDLine {
	
	public static class Option { /* Example option: -c -o --flag1 --flag2 */
		String flag;
		String description;
		String value;
		boolean isSingle;  /* Is flag described by - or --? */
		
		/* Is this argument purely a value?
		 * (which means it's not a flag in the format: -f, -c, --flag1, --flag2) */
		boolean isDefault;
		boolean supported; /* Is this a supported known flag */
		
		public Option(char flag, String description) {
			this.flag = flag + "";
			this.description = description;
			isSingle = true;
			isDefault = false;
			supported = false;
		}
		
		public Option(String flag, String description) {
			this.flag = flag;
			this.description = description;
			isSingle = false;
			isDefault = false;
			supported = false;
		}
		
		public void setValue(String value) {
			this.value = value;
		}

		public String toString() {
			if(!isDefault) {
				/* Output Option as a flag */
				if(description != null) {
					/* Output Option flag as a supported Option */
					return (isSingle ? "-" : "--") + flag + "\t\t" + description;
				} else {
					/* Output Option flag as a parsed Option */
					return (isSingle ? "-" : "--") + flag + (value != null ? "=" + value : "");
				}
			} else {
				/* Output Option as a value */
				return value;
			}
		}
	}
	
	public enum HelpCondition {
		NULL,       /* Not having arguments does not cause help() to be summoned. An invalid argument however, will     */
		WHEN_NOARGS /* Summon help() method when the command line has no arguments (or if there is an invalid argument) */
	}
	
	public enum HelpResponse {
		NULL,                /* Only show the help message without quitting the program                                       */
		HELP_AND_QUIT,       /* Execute help method and close program afterwards                                              */
		HELP_WARNONLY,       /* Same as before but instead of quitting on a not supported flag it will just ignore it         */
		HELP_WARNONLY_NOHELP /* Same as before but help is not called                                                         */
	}
	
	private static List<Option> optionsSupported = null;
	private static List<Option> optionsParsed = null;
	private static boolean initialized = false;
	private static HelpCondition helpCondition = HelpCondition.NULL;
	private static HelpResponse helpResponse = HelpResponse.NULL;
	private static HelpResponse helpResponseOnInval = HelpResponse.NULL;
	private static String usage = "";
	
	private static void initializeCMDLine() {
		optionsSupported = new ArrayList<Option>();
		optionsParsed = new ArrayList<Option>();
		initialized = true;
	}
	
	private static char isOption(String opt) {
		/** Return values:
		 * 0: 'Flagless' value
		 * 1: Single character flag (consequent value is possible)
		 * 2: String flag (consequent value is possible)
		 * 3: It's a single character flag but invalid
		 * 4: It's a string flag but invalid **/

		if(opt.matches("^-?\\d+$"))
			return 0; /* It's a number */
		
		if(opt.indexOf("--") == 0) {
			/* It's a string flag */
			if(opt.length() == 2)
				return 4; /* This string flag is not long enough. It's only made of '--' */
			return 2;
		} else if(opt.indexOf("-") == 0) {
			/* It's a single character flag */
			if(opt.length() > 2)
				return 3; /* This single character flag is more than 1 character long (too long) */
			return 1;
		} else {
			/* It's a pure value */
			return 0;
		}
	}
	
	private static void pushSingle(char flag, String value) {
		/* Check if flag is supported first */
		boolean supported = isFlagValid(flag + "", value, false);

		Option opt = new Option(flag, null);
		opt.value = value;
		opt.supported = supported;
		optionsParsed.add(opt);
	}

	private static void push(String flag, String value) {
		/* Check if flag is supported first */
		boolean supported = isFlagValid(flag, value, false);

		Option opt = new Option(flag, null);
		opt.value = value;
		opt.supported = supported;
		optionsParsed.add(opt);
	}
	
	private static boolean isFlagValid(String flag, String value, boolean isSingle) {
		for(Option supportedOption : optionsSupported) {
			if(supportedOption.isSingle == isSingle && 
				!supportedOption.isDefault && 
				supportedOption.flag.equals(flag))
			{
				/* Flag is valid */
				return true;
			}
		}
		
		/* It seems this flag is not supported */
		handleUnsupportedFlag(flag + "", value);
		return false;
	}
	
	private static void handleUnsupportedFlag(String flag, String value) {
		String msg = "";
		
		switch(helpResponseOnInval) {
		case HELP_WARNONLY: case HELP_WARNONLY_NOHELP: msg += "WARNING"; break;
		default: msg += "ERROR"; break;
		}
		
		msg += " @ CMDLine: Flag '" + flag + "'" + (value != null ? "with value " + value : "") + " is not supported. ";
		
		switch(helpResponseOnInval) {
		case HELP_WARNONLY: case HELP_WARNONLY_NOHELP: msg += "Ignoring"; break;
		default: msg += "Quitting"; break;
		}
		
		msg += "...\n";
		
		/* Show error/warning message */
		System.err.println(msg);
		
		/* Summon help */
		if(helpResponseOnInval != HelpResponse.HELP_WARNONLY_NOHELP)
			help();
	}
	
	private static String dump(List<Option> options, boolean defaultsOnly) {
		String strBuild = "";
		for(Option option : options) {
			if(defaultsOnly) {
				if(option.isDefault)
					strBuild += option.toString() + "\n";
				else
					continue;
			}				
			else {
				strBuild += option.toString() + "\n";
			}
		}
		return strBuild;
	}
	
	private static void help() {
		if(!initialized) initializeCMDLine();
		
		/* Show usage message */
		System.out.println(usage + "Options:");
		
		/* Show supported command line arguments */
		dumpSupported();

		switch(helpResponse) {
		case HELP_AND_QUIT:
			System.exit(1);
			break;
		default: /* Let the program continue in any other case */
		}			
	}
	
	/**************************/
	/**** PUBLIC INTERFACE ****/
	/**************************/
	public static boolean parse(String[] args) {
		if(!initialized) initializeCMDLine();
		
		/* Iterate through the command line arguments */
		for(int i = 0; i < args.length; i++) {
			String argCleaned = args[i].trim();
			char opt_type;
			if((opt_type = isOption(argCleaned)) > 0) {
				switch(opt_type) {
				case 1:
					/* Found single character flag */
					if(i < args.length - 2) {
						String arg2Cleaned = args[i+1].trim();
						if(isOption(arg2Cleaned) > 0)
							pushSingle(argCleaned.charAt(1), null);
						else
							pushSingle(argCleaned.charAt(1), arg2Cleaned);
					} else {
						pushSingle(argCleaned.charAt(1), null);
					}
					break;
				case 2: {
					/* Found string flag */
					String argSubstr = argCleaned.substring(2, argCleaned.length());
					if(i < args.length - 2) {
						String arg2Cleaned = args[i+1].trim();
						if(isOption(arg2Cleaned) > 0)
							push(argSubstr, null);
						else
							push(argSubstr, arg2Cleaned);
					} else {
						push(argSubstr, null);
					}
					break;
				}
				case 3: case 4: handleUnsupportedFlag(argCleaned, null); break;
				default: throw new UnsupportedOperationException();
				}
			} else {
				/* We found a value without a flag associated with it */
				Option defaultValue = new Option(argCleaned, null);
				defaultValue.value = defaultValue.flag;
				defaultValue.isDefault = true;
				optionsParsed.add(defaultValue);
			}
		}
		
		/* 
		 * The command line was parsed successfully.
		 * Let's check if the help() condition was met
		 * */
		switch(helpCondition) {
		case NULL: break;
		case WHEN_NOARGS:
			if(optionsParsed.size() == 0)
				help(); /* Yep, condition met */
			break;
		}
		
		return true;
	}
		
	public static boolean addFlags(Object... options_obj) {
		if(!initialized) initializeCMDLine();

		for(int i = 0; i <= options_obj.length - 2; i += 2) {
			
			if(options_obj[i] instanceof Character && options_obj[i + 1] instanceof String) {
				/* Add single character flag */
				optionsSupported.add(new Option((Character)options_obj[i], (String)options_obj[i + 1]));
			}
			else if(options_obj[i] instanceof String && options_obj[i + 1] instanceof String) {
				/* Add string flag */
				optionsSupported.add(new Option((String)options_obj[i], (String)options_obj[i + 1]));
			}
			else {
				/* Invalid object type */
				return false;
			}
		}
		
		return true;
	}

	public static void setHelpCondition(HelpCondition condition, HelpResponse response, HelpResponse responseOnInvalidFlag) {
		if(!initialized) initializeCMDLine();
		helpCondition = condition;
		helpResponse = response;
		helpResponseOnInval = responseOnInvalidFlag;
	}
	
	public static void setUsage(String usageMessage) {
		if(!initialized) initializeCMDLine();
		usage = "Usage: " + usageMessage + "\n";
	}

	public static<T> Option query(T opt, int nth) {		
		for(Option option : optionsParsed) {
			if(((opt instanceof Character && option.isSingle) ||
					(opt instanceof String && !option.isSingle))
				&& option.flag.equals(opt))
			{
				if(--nth > 0) continue;
				else return option;
			}
		}
		return null;
	}
	
	public static Option queryDefaults(int nth) {
		for(Option option : optionsParsed) {
			if(option.isDefault) {
				if(--nth > 0) continue;
				else return option;
			}
		}
		return null;
	}
	
	public static<T> Option query(T opt) {
		return query(opt, 0);
	}
	
	public static<T> boolean hasOption(T opt, int nth) {
		return query(opt, nth) != null;
	}

	public static<T> boolean hasOption(T opt) {
		return query(opt, 0) != null;
	}

	public static int getOptionCount() {
		return optionsParsed.size();
	}
	
	public static int getSupportedOptionCount() {
		return optionsSupported.size();
	}
	
	public static int getDefaultOptionCount() {
		int ctr = 0;
		for(Option option : optionsParsed)
			if(option.isDefault) ctr++;
		return ctr;
	}
	
	public static String dumpSupportedToStr() {
		return dump(optionsSupported, false);
	}
	
	public static void dumpSupported() {
		System.out.print(dumpSupportedToStr());
	}
	
	public static String dumpParsedToStr() {
		return dump(optionsParsed, false);
	}
	
	public static void dumpParsed() {
		System.out.print(dumpParsedToStr());
	}
	
	public static String dumpDefaultsToStr() {
		return dump(optionsParsed, true);
	}
	
	public static void dumpDefaults() {
		System.out.print(dumpDefaultsToStr());
	}
}
