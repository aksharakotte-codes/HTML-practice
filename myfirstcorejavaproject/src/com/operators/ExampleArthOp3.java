package com.operators;

import java.util.Scanner;

//Arithmetic operators
public class ExampleArthOp3 {

	public static void main(String[] args) {
		System.out.println("Main Method Started!!");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Principal Amount : ");
		double P = sc.nextDouble();
		
		System.out.println("Enter Rate of Interest : ");
		double R = sc.nextDouble();
		
		System.out.println("Enter Time : ");
		double T = sc.nextDouble();
		
		double SI = (P * R * T) / 100;
		System.out.println("Simple Interest : " + SI);
		
		
		sc.close();
	}

}

