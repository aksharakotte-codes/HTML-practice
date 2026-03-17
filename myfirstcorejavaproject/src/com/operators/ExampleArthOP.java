package com.operators;

import java.util.Scanner;

//Arithmetic Operators
public class ExampleArthOP {

	public static void main(String[] args) {
		System.out.println("Main Method started!!");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int a = sc.nextInt();
		
		System.out.println("Enter b number : ");
		int b = sc.nextInt();
		
		System.out.println("Enter c number : ");
		int c = sc.nextInt();
		
		double d = a + b + c;
		System.out.println("Adding the Three Numbers : " + d);
		
		System.out.println("Average of Three Numbers : " + d/3);
		sc.close();

	}

}
