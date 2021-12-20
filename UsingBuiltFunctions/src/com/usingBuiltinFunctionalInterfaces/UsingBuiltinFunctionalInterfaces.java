package com.usingBuiltinFunctionalInterfaces;

import java.util.*;
import java.util.function.*;
public class UsingBuiltinFunctionalInterfaces {

	public static void main(String[] args) {
    
		 List<String> nameList = Arrays.asList("murugan", "santhosh", "keerthana", "selva");
		 
//		 for(String eachName: nameList) {
//			 System.out.println(eachName);
//		 }
//		 nameList.forEach((val)->System.out.println(val));
		 
		 nameList.forEach(System.out::println);
		 
		 Predicate<String> checkName = (name) -> name.contains("m");
		 nameList.forEach((name)-> {
			 if(checkName.test(name)) {
				 System.out.println(name);
			 }
		 }); 
		 
		 System.out.println("using predicate default methods");
		 
		 Predicate<String> checkNameNegate = (name) -> name.contains("m");
		 nameList.forEach((name)-> {
			 if(checkNameNegate.negate().test(name)) {
				 System.out.println(name);
			 }
		 });
		 
		 Function<String, String> concat = (name)-> "hi " + name;
		 String response = concat.apply("keerthana");
		 System.out.println(response);
		 Function<Double, Double> convertor = (val) -> 45.00 *val;		 
		 System.out.println(convertor.apply(100.00));
		 
		 Convertor<Double, Double> conWithDefaultMethod = (val) -> val*50.00;
		 System.out.println(conWithDefaultMethod.update(200.00));
  }

}
