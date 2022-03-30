package com.calculator.operators;

import com.calculator.UnaryOperation;

public class Increment implements UnaryOperation{

	@Override
	public String getName() {
		return "++";
	}

	@Override
	public double calculate(double first) {
		return ++first;
	}

}
