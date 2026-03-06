package com.languagefundamentals.constructors.examples;


public class Person {

	String name;
	String city;
	
	//Parameterized constructor
	Person(String name, String city){
		System.out.println("Parameterized Constructors called!!");
		this.name = name;
		this.city = city;
			
	}
		public static void main(String[] args) {
			System.out.println("Main Method started!!");
			
			Person p1 = new Person("Akshara","Mancherial");
			p1.personInfo();
			
			
			System.out.println("Main Method ended!!");

		}
		
		void personInfo() {
			System.out.println("Name of the Person: " + name);
			System.out.println("City of the Person: " + city);
		}
}