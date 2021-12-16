package com.exceptionHandling1;

import java.util.Scanner;

public class UsingTryWithResource {

	public static void main(String[] args) {
	try(Scanner sc = new Scanner(System.in)) {
		System.out.println("Enter your name");
	     String name = sc.next();
	} catch (Exception e) {
		e.printStackTrace();
	} 
  }

}
