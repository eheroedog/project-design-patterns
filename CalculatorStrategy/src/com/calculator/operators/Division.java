package com.calculator.operators;

import com.calculator.BinaryOperation;

public class Division implements BinaryOperation{

	@Override
	public String getName() {		
		return "/";
	}

	@Override
	public double calculate(double first, double second) {
		return first == 0 || second == 0 ? 0.0 : first / second;
	}

}
