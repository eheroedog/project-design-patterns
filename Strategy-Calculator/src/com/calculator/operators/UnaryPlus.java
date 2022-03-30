package com.calculator.operators;

import com.calculator.UnaryOperation;

public class UnaryPlus implements UnaryOperation{

	@Override
	public String getName() {
		return "+";
	}

	@Override
	public double calculate(double first) {
		return Math.abs(first);
	}

}
