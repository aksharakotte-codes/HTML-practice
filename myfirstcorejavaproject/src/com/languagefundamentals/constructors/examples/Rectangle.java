package com.languagefundamentals.constructors.examples;

public class Rectangle {

	double length;
	double width;
	
	//Parameterized constructor
	Rectangle(double length, double width){
		System.out.println("Parameterized Constructors called!!");
		this.length = length;
		this.width = width;
			
	}
		public static void main(String[] args) {
			System.out.println("Main Method started!!");
			
			Rectangle r1 = new Rectangle(59.6,98.6);
			r1.areaofRect();
			
			
			System.out.println("Main Method ended!!");

		}
		
		void areaofRect() {
			System.out.println("Area of Rectangle:" + (length*width));
		}
	}