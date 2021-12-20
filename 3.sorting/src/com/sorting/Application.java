package com.sorting;

import java.util.*;

public class Application {

	public static void main(String[] args) {
     TreeSet<String> treeset = new TreeSet<String>();
     treeset.add("apple");
     treeset.add("orange");
     treeset.add("apple");
     treeset.add("pineapple");
     treeset.add("orange");
     treeset.add("banana");
     
     for(String eachFruit: treeset) {
    	 System.out.println(eachFruit);
     }
     
	}

}
