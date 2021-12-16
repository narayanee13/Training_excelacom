package com.collections;

import java.util.*;

import com.collections.model.Student;

public class Application {

	public static void main(String[] args) {
      ArrayList<Student> studList = new ArrayList();
      
      Student anand = new Student(101,"anand", 78);
      Student dravid = new Student(102,"dravid", 87);
      Student zahir = new Student(103,"zahir", 23);
      Student chandru = new Student(104,"chandru", 79);
      Student ramesh = new Student(105,"ramesh", 67);
      
      studList.add(ramesh);
      studList.add(anand);
      studList.add(zahir);
      studList.add(chandru);
      studList.add(dravid);
      
      // Cannot add other than Student object to the studList since its a 
      // typeSafe collection => its collection of only Student
      
      System.out.println(studList.get(1));
      
      for(Student eachStudent:studList) {
    	  System.out.println(eachStudent);
      
      // downCasting the Object[] to Student[]
      // toArray() method return type is object[]
      // but we require a Student so downCasting is done
  //     Student[] list= (Student[]) studList.toArray();
//      System.out.println(list);
			Object[] list = studList.toArray();
			for (Object obj : list) {
				Student stud = (Student) obj;
				System.out.println(stud.getStudentName() + stud.getRollNumber());
			}
			Student[] studentList = { new Student(201, "deepa", 78), new Student(202, "diksha", 98)

			};
      }
 }
}
