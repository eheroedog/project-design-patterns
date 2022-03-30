package com.calculator.operators;

import com.calculator.BinaryOperation;

public class Addition implements BinaryOperation {

	@Override
	public double calculate(double first, double second) {
		return first + second;
	}

	@Override
	public String getName() {
		return "+";
	}

}
