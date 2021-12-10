package com.interfaces;

import com.example.interfaces.Function;

public class CurrencyConvertor implements Function {

	@Override
	public double apply(double arg) {
		return 60*arg;
	}

}
