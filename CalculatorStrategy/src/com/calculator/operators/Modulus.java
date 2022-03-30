package com.calculator.operators;

import com.calculator.BinaryOperation;

public class Modulus implements BinaryOperation{

	@Override
	public String getName() {
		return "%";
	}

	@Override
	public double calculate(double first, double second) {
		return first % second;
	}

}
