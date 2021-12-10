package com.interfaces;

import com.example.interfaces.*;
import com.interfaces.model.Professor;
import com.interfaces.model.Student;
public class Application {
	
	public static void printResult(Conditional condition) {
		System.out.println(condition.test());
	}
   
	public static void printValues(Function[] objects) {
		for(Function eachFunction:objects) {
		System.out.println(eachFunction.apply(50));
    }
  }
	public static void main(String[] args) {
       Function usdToInr = new CurrencyConvertor();
       Function celToFar = new TempConvertor();
       Function[] functions = {usdToInr,celToFar};
       printValues(functions);
       
       Student ram = new Student(100, 80);
       printResult(ram);
       Professor kanna = new Professor(202, "mca");
       printResult(kanna);
       
	}

}
