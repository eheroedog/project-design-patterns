package com.calculator.operators;

import com.calculator.UnaryOperation;

public class Decrement implements UnaryOperation {

	@Override
	public String getName() {
		return "--";
	}

	@Override
	public double calculate(double first) {
		return --first;
	}

}
