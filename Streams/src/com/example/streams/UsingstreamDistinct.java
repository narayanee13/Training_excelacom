package com.example.streams;

import java.util.List;

public class UsingstreamDistinct {

	public static void main(String[] args) {
       
		List<Student> studList = StudentUtils.getStudents();
		studList.stream().distinct().forEach(System.out::println);
	}

}
