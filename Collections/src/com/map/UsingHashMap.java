package com.map;
import java.util.*;

import com.collections.model.Student;
public class UsingHashMap {

	public static void main(String[] args) {
		  Student anand = new Student(101,"anand", 78);
	      Student dravid = new Student(102,"dravid", 87);
	      Student zahir = new Student(103,"zahir", 23);
	      Student zahirSenior = new Student(103,"zahir", 23);

	      
	      HashMap<Integer, Student> map = new HashMap<Integer, Student>();
	      
	      //AutoBoxing feature of java allow primitive 13 to be converted into object Integer
	      System.out.println(map.put(13, anand));
	      System.out.println(map.put(14, dravid));
	      System.out.println(map.put(15, zahir));
	      System.out.println(map.put(15, zahirSenior));
	      
	      //it will return the new entry not the old one. It replaces the old one with new entry
	      
	      System.out.println("from map"+map.get(15));
	      
	      Set<Map.Entry<Integer, Student>> setView = map.entrySet();
	      Iterator<Map.Entry<Integer, Student>> itr = setView.iterator();
	      for( Map.Entry<Integer, Student> eachElement:setView) {
	    	  System.out.println("key: "+ eachElement.getKey());
	    	  System.out.println("value: "+ eachElement.getValue());

	      }
	}

}
