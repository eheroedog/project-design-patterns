package com.calculator.operators;

import com.calculator.BinaryOperation;

public class Subtraction implements BinaryOperation {

	@Override
	public String getName() {
		return "-";
	}

	@Override
	public double calculate(double first, double second) {
		return first - second;
	}
	
}
