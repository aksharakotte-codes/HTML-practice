package com.operators;

import java.util.Scanner;

//Swap Two Numbers without using third variable
public class ExampleArthOp4 {

	public static void main(String[] args) {
		System.out.println("Main Method Started!!");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		int a = sc.nextInt();
		
		System.out.println("Enter second number: ");
		int b = sc.nextInt();
		
		// Before Swapping
		System.out.println("Before Swapping:");
		System.out.println("a = " + a);//5
		System.out.println("b = " + b);//10
		
		// Swapping logic
		a = a + b;//a ==> 5 + 10 = 15 --> a= 15 ,b = 10 
		b = a - b;//b ==> 15 - 10 = 5 --> a = 15, b = 5
		a = a - b;//a ==> 15 - 5 = 10 --> a = 10, b = 5 
		
		// After Swapping
		System.out.println("After Swapping:");
		System.out.println("a = " + a);// 10
		System.out.println("b = " + b);//5
		
		sc.close();
	}
}
