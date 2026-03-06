package com.languagefundamentals.constructors.examples;

public class Calculator {
	double no1;
	double no2;
	
	Calculator(double no1, double no2) {
		this.no1 = no1;
		this.no2 = no2;
	}
	
	public static void main(String[] args) {
		System.out.println("Main Method Started");
		
		Calculator c1 = new Calculator(90.0, 30.0);
		c1.calInfo();
		
		System.out.println("Main Method Ended");

	}
	
	void calInfo() {
		System.out.println("Sum of two numbers : " + (no1 + no2));
		System.out.println("Difference of two numbers : " + (no1 - no2));
		System.out.println("Product of two numbers : " + (no1 * no2));
		System.out.println("Division of two numbers : " + (no1 / no2));
	}

}
