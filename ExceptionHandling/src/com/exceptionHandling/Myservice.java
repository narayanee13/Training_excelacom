package com.exceptionHandling;

public class Myservice {
	public int mark(){
	//Object strMark = new Integer(45);
	// Deprecated means in future the support will be withdrawn or it will be removed
	//Object strMark = new String("ninety");	
	Object strMark = Integer.valueOf(50);
	int mark=0;
	try {
		mark = (Integer)strMark;
	} catch (ClassCastException e) {
		e.printStackTrace();
	}
	System.out.println(mark);
	return 0;
}
	public double markWithNestedTryCatch(String markScored) {
 		Object strMark=Integer.valueOf(45);
	double testScore=0.0;
	int mark=0;
	
	try {
		try {
			mark = (Integer)strMark;
		} catch (ClassCastException e) {
			e.printStackTrace();
		}
		testScore=Double.parseDouble(markScored);
	} catch (NumberFormatException e) {
		
		e.printStackTrace();
	}
	
	System.out.println(mark);
	System.out.println(testScore);
	return 0;
	}
 	
	public double markWithMultiCatch(String markScored){
		//Object strMark = new String("ninety");	
 		Object strMark=Integer.valueOf(50);

		int mark=0;
		double testScore=0.0;
		try {
			mark = (Integer)strMark;
			testScore = Double.parseDouble(markScored);
		} catch (NumberFormatException| ClassCastException e) {
			e.printStackTrace();
		}
		System.out.println(mark);
		System.out.println(testScore);
		return 0;
	}
	// declare exception instead of handling
  public String exampleForDeclare(String name)throws NullPointerException {
	  
	  return name.toUpperCase();
  }
}
