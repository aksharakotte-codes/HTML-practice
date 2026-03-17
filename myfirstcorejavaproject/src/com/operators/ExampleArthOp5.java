package com.operators;

import java.util.Scanner;

//Arithmetic Operators
public class ExampleArthOp5 {

	public static void main(String[] args) {
		System.out.println("Main Method started!!");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter CSS Subject marks : ");
		int a = sc.nextInt();
		
		System.out.println("Enter Java Subject marks: ");
		int b = sc.nextInt();
		
		System.out.println("Enter Python Subject marks: ");
		int c = sc.nextInt();
		
		System.out.println("Enter Html Subject marks: ");
		int d = sc.nextInt();
		
		System.out.println("Enter C++ Subject marks: ");
		int e = sc.nextInt();
		
		int marks = a + b + c + d + e;
		System.out.println("Total Marks : " + marks);
		
		double percentage = marks/5;
		System.out.println("Percentage : " + percentage);
		sc.close();

	}

}
