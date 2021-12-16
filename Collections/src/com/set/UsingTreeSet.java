package com.set;

import java.util.*;
import com.collections.model.Student;

public class UsingTreeSet {
	public static void print(Collection<Student> object) {
		for(Student eachStud:object) {
			System.out.println(eachStud);
		}
	}

	public static void main(String[] args){
		  Student anand = new Student(101,"anand", 78);
	      Student dravid = new Student(102,"dravid", 87);
	      Student zahir = new Student(103,"zahir", 23);
	      
	      TreeSet<Student> treeSet = new TreeSet<Student>();
	      treeSet.add(anand);
	      treeSet.add(dravid);
	      treeSet.add(zahir);

          print(treeSet);
	}

}
