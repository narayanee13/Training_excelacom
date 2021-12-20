package com.example.streams;

import java.util.Comparator;
import java.util.*;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.*;
import java.util.stream.Collectors;

public class UsingTerminalOperators {

	public static void main(String[] args) {

		List<Student> studList = StudentUtils.getStudents();
		
        Comparator<Student> markComparator = Comparator.comparing(Student::getMarkScored);
        Optional<Student> maxMark= studList.stream().max(markComparator);
        
        if(maxMark.isPresent()) {
        	System.out.println("Highest mark : " + maxMark.get().getMarkScored()); // one way of obtaining only marks
        }  	
        //Optional<Student> minMark= studList.stream().min(markComparator);
        Optional<Double> minMark= studList.stream().map(e->e.getMarkScored()).min(Double::compareTo); // other way

              
        if(maxMark.isPresent()) {
        System.out.println("Lowest mark : " + minMark.get());
        }
       
        System.out.println("Total number of students who scored more than 90");
        long totalGrt70 = studList.stream().map(e->e.getMarkScored()).filter(e->e>70).count() ;
        System.out.println(totalGrt70);
        
        Map<String, Double> markList = studList.stream()
        		.collect(Collectors.toMap(Student::getStudentName, Student:: getMarkScored));
        
        Set<Entry<String, Double>>set = markList.entrySet();
        
        for(Entry<String, Double> eachEntry : set) {
        	System.out.println(eachEntry.getKey() + ":" +eachEntry.getValue());
        }
        

}
}
