package com.interfaces;

import com.example.interfaces.Function;

public class TempConvertor implements Function {
   
	// cel to fahren
	@Override
	public double apply(double arg) {
		
		return (arg*9/5)+32;
	}

}
