package com.operators;

import java.util.Scanner;

//Arithmetic operators
public class ExampleArthOp2 {

	public static void main(String[] args) {
		System.out.println("Main Method Started!!");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter length : ");
		double l = sc.nextDouble();
		
		System.out.println("Enter breadth : ");
		double b = sc.nextDouble();
		
		System.out.println("Area of Rectangle : " + l*b);
		
		System.out.println("Perimeter of Rectangle : " + 2*(l+b));
		
		sc.close();
	}

}
