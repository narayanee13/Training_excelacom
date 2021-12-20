package com.example.streams;

import java.util.*;
import static java.util.stream.Collectors.*;
import java.util.function.*;

public class UsingStreamsFilter {

	public static void printStudentsByCondition(Collection<Student> studList, Predicate<Student> condition ) {
		 studList.stream().filter(student -> student.getMarkScored()>70)
		   .forEach(System.out::println);
	}
	public static List getStudentScoredLessthan70(Collection<Student> studList, Predicate<Student> condition) {
		List<Student> listMarksless70 = studList.stream()
			  .filter(student -> student.getMarkScored()<70).collect(toList());			  
	    return listMarksless70;
	}
	public static void main(String[] args) {

		  Student anand = new Student(101,"anand", 78);
	      Student dravid = new Student(102,"dravid", 87);
	      Student zahir = new Student(103,"zahir", 23);
	      Student chandru = new Student(104,"chandru", 79);
	      Student ramesh = new Student(105,"ramesh", 67);
		
	      ArrayList<Student> studList = new ArrayList();

	      studList.add(ramesh);
	      studList.add(anand);
	      studList.add(zahir);
	      studList.add(chandru);
	      studList.add(dravid);
		
//		  Predicate<Student> grtThan70 =student -> student.getMarkScored()>70;
//          System.out.println("Students who scored more than 70");	
//          printStudentsByCondition(studList, grtThan70);
//          
//		  List<Student> listMarksGrt70 = studList.stream()
//		  .filter(student -> student.getMarkScored()>70).collect(toList());
//		  System.out.println(listMarksGrt70);
		  
	      Predicate<Student> lessThan70 =student -> student.getMarkScored()>70;
          System.out.println("Students who scored less than 70");	
         // printStudentsByCondition(studList, lessThan70);        
	      List<Student> listMarksLessthan70 = getStudentScoredLessthan70(studList, lessThan70 );
	      System.out.println(listMarksLessthan70);
	}

}
