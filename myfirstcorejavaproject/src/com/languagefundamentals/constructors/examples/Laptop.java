package com.languagefundamentals.constructors.examples;



public class Laptop {
	
		String brand;
		String price;
		
		//No-arg constructor
		Laptop(){
			System.out.println("Laptop Ready");
			
		}
		public static void main(String[] args) {
			System.out.println("Main Method started!!");
			
			Laptop l1 = new Laptop();
			System.out.println("Mobile Brand  :"  +l1.brand);
			System.out.println("Mobile Price  :"  +l1.price);
			
			
			System.out.println("Main Method ended!!");

	}

}