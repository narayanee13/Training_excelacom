package com.example.streams;

import java.util.ArrayList;
import java.util.*;
import com.example.streams.Student;
public class StudentUtils {

	public static List<Student> getStudents(){
		  ArrayList<Student> studList = new ArrayList();
	      
	      Student anand = new Student(101,"anand", 78);
	      Student dravid = new Student(102,"dravid", 87);
	      Student zahir = new Student(103,"zahir", 23);
	      Student chandru = new Student(104,"chandru", 79);
	      Student ramesh = new Student(105,"ramesh", 67);
	    //  Student rameshKumar = new Student(105,"ramesh", 67);

	      
	      studList.add(ramesh);
	      studList.add(anand);
	      studList.add(zahir);
	      studList.add(chandru);
	      studList.add(dravid);
	     // studList.add(rameshKumar);

	      
	      return studList;
	}
}
