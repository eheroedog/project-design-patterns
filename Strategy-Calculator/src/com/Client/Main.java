package com.Client;

import com.calculator.Calculator;

public class Main {

	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		System.out.println("~~Calculator~~");
		boolean flag = true;
		
		while(flag) {
			var message =  System.console().readLine();
			
			switch (message.toLowerCase()) {
			case "exit":
				flag = false;
				break;
			case "help":
				System.out.print("Valid Binary Operations: ");
				System.out.println(cal.getBOperations());
				System.out.print("Valid Unary Operations: ");
				System.out.println(cal.getUOperations() + "\n");
				break;
			default:
				cal.Calculate(message);
				break;
			}
		}
	}

}
