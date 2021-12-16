package com.exceptionHandling;

public class Application {

	public static void main(String[] args) {
      
	Myservice service = new Myservice();
	service.mark();
	service.markWithNestedTryCatch("50");
	service.markWithMultiCatch("60");
	
	String city = null;
	try {
	service.exampleForDeclare(city);
	}
	catch (NullPointerException e) {
		System.err.println(e.getMessage());
		//e.printStackTrace();
	}
}
}
