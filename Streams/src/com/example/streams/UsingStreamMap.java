package com.example.streams;

import java.util.List;
import java.util.function.Function;

import static java.util.stream.Collectors.*;

public class UsingStreamMap {

	public static void main(String[] args) {
		
		List<Student> studList = StudentUtils.getStudents();
		Function<Student, String> mapCondition = e-> e.getStudentName();
		List<String> nameList = studList.stream().filter(student -> student.getMarkScored()>70)
				.map(mapCondition).collect(toList());
//		List<String> nameList = studList.stream().filter(student -> student.getMarkScored()>70)
//				.map(e->e.getStudentName()).collect(toList())
;
		System.out.println(nameList);
		
		System.out.println("names of the students who got more than 70");
		
	}
}
