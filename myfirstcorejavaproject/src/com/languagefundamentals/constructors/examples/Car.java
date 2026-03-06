package com.languagefundamentals.constructors.examples;


public class Car {

	String brand;
	String model;
	
	//No-arg constructor
	Car(){
		System.out.println("Car Created successfully");
		brand = "Sonet";
		model= "KIA";
	}
	public static void main(String[] args) {
		System.out.println("Main Method started!!");
		
		Car c1 = new Car();
		System.out.println("Car Brand  :"  +c1.brand);
		System.out.println("Car Model  :"  +c1.model);
		
		
		System.out.println("Main Method ended!!");

	}

}
		