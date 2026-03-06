package com.languagefundamentals.constructors.examples;


public class City {

	String name;
	double population;
	
	//No-arg constructor
	City (){
		System.out.println("City Object Creation");
		name = "Unknown";
		population = 0.0;
	}
	public static void main(String[] args) {
		System.out.println("Main Method started!!");
		
		City c1 = new City ();
		System.out.println("City name  :"  +c1.name);
		System.out.println("City population  :"  +c1.population);
		
		
		System.out.println("Main Method ended!!");

	}
}

