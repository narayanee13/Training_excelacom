package com.example.model;
import static java.lang.Math.*;
public class Invoice {
	// declaring a constant - note the all caps
     public static final int STARTNUMBER=100;
     
	 private int invoiceNumber; //instance variable
	 private static double discount; //static or class variable	 
	 /* 
	  * instance method can access both instance and static variables
	  *  */
	 public void show() {
		 
		 System.out.println(invoiceNumber);
		 System.out.println(discount);
		 //STARTNUMBER++ final can't be changed
		 showAll();
	 }
	 /*
	  * static method can access only static variables
	  */
     public static void showAll() {
		 
		//System.out.println(invoiceNumber);
		 System.out.println(discount);
		// show();
		// since static import is used we are not calling the method with class name 
	    System.out.println(sqrt(4));
	    double radian30 = toRadians(30);
	    double radian60 = toRadians(60);
	    System.out.println(sin(radian30));
	    System.out.println(sin(radian60));


	    
	 } 

}
