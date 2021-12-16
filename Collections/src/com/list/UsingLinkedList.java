package com.list;

import java.util.*;
import com.collections.model.Student;

public class UsingLinkedList {

	public static void main(String[] args) {
		 Student anand = new Student(101,"anand", 78);
	      Student dravid = new Student(102,"dravid", 87);
	      Student zahir = new Student(103,"zahir", 23);
	      
	      LinkedList<Student> studList = new LinkedList<Student>();
	      
	      studList.add(dravid);
	      studList.add(anand);
	      studList.add(zahir);
	      
	     // Iterator<Student> itr = studList.iterator();
	      ListIterator<Student> itr = studList.listIterator();
	      
	      System.out.println("forward iteration");
	      
	     while(itr.hasNext()){
	    	 System.out.println(itr.next().getStudentName());
	     }
	      System.out.println("backward iteration");
	      
	      while(itr.hasPrevious()){
		    	 System.out.println(itr.previous().getStudentName());
		     }
	}

}
