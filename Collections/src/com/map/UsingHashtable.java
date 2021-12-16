package com.map;

import java.util.*;
import com.collections.model.Student;

public class UsingHashtable {

	public static void main(String[] args) {
		  Student anand = new Student(101,"anand", 78);
	      Student dravid = new Student(102,"dravid", 87);
	      Student zahir = new Student(103,"zahir", 23);
	      
	     Hashtable<Integer, Student> map = new Hashtable<Integer, Student>();
	     map.put(1, null);
	     
	     if(map.get(1)==null) {
	    	 System.out.println(map.put(1, anand));
	     }
	}
}
