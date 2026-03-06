package com.languagefundamentals.constructors.examples;

public class Product {
	String prodname;
	String product;
	
	//Parameterized constructor
	Product(String prodname, String product){
		System.out.println("Parameterized Constructors called!!");
		this.prodname = prodname;
		this.product = product;
			
	}
		public static void main(String[] args) {
			System.out.println("Main Method started!!");
			
			Product p1 = new Product("Facewash","ABC");
			p1.prodInfo(); 
			
			
			System.out.println("Main Method ended!!");

		}
		
		void prodInfo() {
			System.out.println("Name of the Product: " + prodname);
			System.out.println("Product's Brand : " + product);
		}
}

