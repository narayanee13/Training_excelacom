package com.string;

public class StringUtility {

	 public static String getSubString(String arg, int begin, int end) {
		return arg.substring(begin,end);
		 
	 }
	 public static boolean checkContains(String arg, String srchChar) {		 
		 return arg.contains(srchChar);
}
	 public static int checkPositionOfChar(String arg, String srchChar) {
		 return arg.indexOf(srchChar);
	 }
	 public static String joinTwoStrings(String str1, String str2) {
		 return str1.concat(str2);
}
	public static String replaceString(String originalString, String replaceString) {
		return originalString.replaceAll(originalString, replaceString);
		
	}
	public static void split(String arg) {
      String[] s = arg.split("y");
      for(String i:s) {
    	  System.out.println(i);
      }
	}
	public static String trim(String arg) {
		return arg.trim();
	}
}

