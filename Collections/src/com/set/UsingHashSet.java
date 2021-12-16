package com.set;

import java.util.*;

import com.collections.model.Student;
public class UsingHashSet {
	
	public static void print(Collection<Student> object) {
		for(Student eachStud:object) {
			System.out.println(eachStud);
		}
	}

	public static void main(String[] args) {
		  Student anand = new Student(101,"anand", 78);
	      Student dravid = new Student(102,"dravid", 87);
	      Student zahir = new Student(103,"zahir", 23);
	      Student zahirSenior = new Student(103,"zahir", 23);

	      
	      HashSet<Student> hashSet = new HashSet<Student>();
	      
	      hashSet.add(anand);
	      hashSet.add(dravid);
	      hashSet.add(zahir);
	      boolean isAdded = hashSet.add(zahirSenior);
	      System.out.println("is added : ="+isAdded);
          print(hashSet);

	}

}
