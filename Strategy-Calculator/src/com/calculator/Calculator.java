package com.calculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.calculator.operators.*;

public class Calculator {
	
	private List<BinaryOperation> binOp;
	private List<UnaryOperation> unaOp;
	private List<String> bOps = new ArrayList<>();
	private List<String> uOps = new ArrayList<>();
	
	public Calculator() {
		binOp = new ArrayList<BinaryOperation>(Arrays.asList(new Addition(),new Subtraction(),new Multiplication(), new Division(), new Modulus(), new Power()));
		binOp.forEach(x -> bOps.add(x.getName()));
		unaOp = new ArrayList<UnaryOperation>(Arrays.asList(new UnaryPlus(),new UnaryMinus(),new Increment(),new Decrement()));
		unaOp.forEach(x -> uOps.add(x.getName()));
	}
	
	public String getBOperations() {
		return bOps.toString();
	}
	
	public String getUOperations() {
		return uOps.toString();
	}
	
	public double Calculate(String text) {
		
		var elements = text.split(" ");
		
		if(elements.length == 2){
			double first = Double.parseDouble(elements[0]);
			String operator = elements[1];

			unaOp.forEach(x -> System.out.print(x.getName().equals(operator) ? "Result: " + x.calculate(first) : ""));
			System.out.println("\n");
			
		} else if(elements.length == 3){
			double first = Double.parseDouble(elements[0]);
			String operator = elements[1];
			double second = Double.parseDouble(elements[2]);

			binOp.forEach(x -> System.out.print(x.getName().equals(operator) ? "Result: " + x.calculate(first, second) : ""));
			System.out.println("\n");
		}
		
		return 0.0;
	}
	
}
