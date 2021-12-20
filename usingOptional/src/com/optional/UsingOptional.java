package com.optional;

import java.util.Optional;

public class UsingOptional {
	public static Optional<String> getMessage(int i){
		String result = null;
		if(i<5) {
			return Optional.of("hello");
		}
		else {
			return Optional.empty();
		}
	}

	public static void main(String[] args) {

		String str = "ramesh";
		System.out.println(str.length());
		String name=null;
		Optional<String> optionalName = Optional.ofNullable(name);
		String result= optionalName.orElse("check if the vaiable name is not null");
		System.out.println(result);
		
		String city= "chennai";
		Optional<String> optionalCity= Optional.ofNullable(city);
		if(optionalCity.isPresent()) {
			System.out.println("length of the city :"+ city.length());
		}
		else {
			System.out.println("check if the value is assigned for city");
		}
		
	  getMessage(13).orElseThrow(()-> new RuntimeException("Invalid value - shoult be less than 5"));
	}

}
