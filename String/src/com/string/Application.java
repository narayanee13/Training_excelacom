package com.string;

public class Application {

	public static void main(String[] args) {

		String bestCity = "chennai";
		String prefCity = "chennai";
		
		System.out.println("Using =="+" "+( bestCity ==prefCity));
		System.out.println("using .equals" + " " +bestCity.equals(prefCity));
		
		String greatCity = prefCity;
		System.out.println(("comparing greatCity and prefCity ==")+(greatCity == prefCity));
		System.out.println(("comparing greatCity and prefCity .equals")+ greatCity.equals(prefCity));
		
		System.out.println("using new string");
		
		String bestCityObject = new String("chennai");
		String prefCityObject = new String("chennai");
		
		System.out.println("Using =="+" "+( bestCityObject ==prefCityObject));
		System.out.println("using .equals" + " "+bestCityObject.equals(prefCityObject));	
		
		String arg = " narayanee ";
		System.out.println(StringUtility.getSubString(arg,2,5));
		String srchChar = "y";
		System.out.println(StringUtility.checkContains(arg, srchChar));
		
		System.out.println(StringUtility.checkPositionOfChar(arg, srchChar));
		
		String str1 = "venkata";
		String str2 = "narasimhan";
		System.out.println(StringUtility.joinTwoStrings(str1, str2));
	    
		String originalString = "keerthu";
		String replaceString = "keerthana";
		System.out.println(StringUtility.replaceString(originalString, replaceString));
		StringUtility.split(arg);
		System.out.println(StringUtility.trim(arg));

	
	}

}
