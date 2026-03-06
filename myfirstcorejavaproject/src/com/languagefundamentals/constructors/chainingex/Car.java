package com.languagefundamentals.constructors.chainingex;

public class Car {
	
	String brand;
	String model;
	double price;
	String color;
	
//	No-arg Constructor
	Car() {
		this("Generic");
		System.out.println("No-arg Constructor Called!!");
		
	}
	
//	One-arg Constructor
	Car(String brand){
		this(brand,"unknown");
		System.out.println("One-arg Constructor Called!!");
	}
	
//	Two-arg Constructor 
	Car(String brand, String model){
		this(brand,model, 500000.0);
		System.out.println("Two-arg Constructor Called!!");
	}
	
//	Three-arg Constructor
	Car(String brand, String model, double price){
		this(brand,model, price, "White");
		System.out.println("Three-arg Constructor Called!!");
	}
	
//	Four-arg Constructor
	Car(String brand, String model, double price,String color){
		System.out.println("Four-arg Constructor Called!!");
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.color = color;
	}
	public static void main(String[] args) {
		System.out.println("Main Method started!!");
		
		Car c1 = new Car();
		System.out.println("Brand of the Car : " + c1.brand);
		System.out.println("********************************");
		
		
		Car c2 = new Car("Generic");
		System.out.println("Brand of the Car : " + c2.brand);
		System.out.println("Brand of the Car : " + c2.model);
		System.out.println("************************************");
		
		
		Car c3 = new Car("Generic", "Unknown");
		System.out.println("Brand of the Car : " + c3.brand);
		System.out.println("Brand of the Car : " + c3.model);
		System.out.println("Brand of the Car : " + c3.price);
		System.out.println("***********************************");
		
		Car c4 = new Car("Generic", "Unknown", 500000.0);
		c4.carInfo();
		
		
		Car c5 = new Car("Toyota", "Fortuner", 3500000.0, "Black");
		c5.carInfo();
		
		System.out.println("Main Method ended!!");

	}
	void carInfo() {
	     System.out.println("Brand of the Car : " + brand);
	     System.out.println("Model of the Car : " + model);
	     System.out.println("Price of the Car : " + price);
	     System.out.println("Color of the Car : " + color);
	     System.out.println("***************************************");
	}    
}
