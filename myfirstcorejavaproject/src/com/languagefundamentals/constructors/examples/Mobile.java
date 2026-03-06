package com.languagefundamentals.constructors.examples;


public class Mobile {
		String brand;
		int price;
		
		//No-arg constructor
		Mobile (){
			System.out.println("Mobile Created successfully");
			brand = "Samsung";
			price = 25000;
		}
		public static void main(String[] args) {
			System.out.println("Main Method started!!");
			
			Mobile  m1 = new Mobile ();
			System.out.println("Mobile Brand  :"  +m1.brand);
			System.out.println("Mobile Price  :"  +m1.price);
			
			
			System.out.println("Main Method ended!!");

		}
	}

