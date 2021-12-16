package com.Training;

public class Application {

	public static void main(String[] args) {
       Student ram= new Student();
       // can't access firstname because its marked as private
       // System.out.println(ram.firstname);
       
       // can access fees because its marked as default
       System.out.println(ram.fees);
	}

}
