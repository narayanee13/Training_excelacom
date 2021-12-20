package com.example.streams;

import java.util.*;

public class StreamSorting {

	public static void main(String[] args) {
      
		List<Student> studList = StudentUtils.getStudents();
		
		Comparator<Student> nameComparator = Comparator.comparing(Student::getStudentName);
		Comparator<Student> markComparator = Comparator.comparing(Student::getMarkScored);
        
		System.out.println("sort by name");
		studList
		.stream()
		.sorted(nameComparator)
		.forEach(System.out::println);
		
		System.out.println("sort by mark ");
		studList
		.stream()
		.sorted(markComparator)
		.forEach(System.out::println);
		
		System.out.println("sort by mark descending");
		studList
		.stream()
		.sorted(markComparator.reversed())
		.forEach(System.out::println);
	} 

}
