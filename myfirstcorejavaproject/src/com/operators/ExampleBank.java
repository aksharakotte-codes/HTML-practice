package com.operators;
//Assignment Operators
public class ExampleBank {

	public static void main(String[] args) {
		System.out.println("Main Method Started!!");
		
		int balance = 1000;
		
		double interest = 5.75;
		balance += interest;
		System.out.println("Adding Interest : " + balance);
		
		double expenses = 2.45;
		balance -= expenses;
		System.out.println("Subtracting Expenses : " + balance);
		
		double bonus = 8.9;
		balance *= bonus;
		System.out.println("Multiplying Bonus : " + balance);
		
		double sharingAmount = 5;
		balance /= sharingAmount;
		System.out.println("Sharing Amount : " + balance);
	}

}
