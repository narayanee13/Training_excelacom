package com.services;

import java.util.Comparator;

import com.collections.model.Student;

public class StudentNameComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
        
		return o1.getStudentName().compareTo(o2.getStudentName());
	}

}
