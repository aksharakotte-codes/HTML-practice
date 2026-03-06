package com.languagefundamentals.constructors;

public class BikeConChaining {
	
	String brand;
	String model;
	String color;
	double price;
	
	
//	Four-arg Constructor 
	BikeConChaining(String brand,String model,double price,String color) {
		System.out.println("Four-arg Constructor called!!");
		this.brand=brand;
		this.model=model;
		this.price=price;
		this.color=color;
	}
//	Three-arg Constructor 
	BikeConChaining(String brand,String model,double price) {
		this(brand, model, price, "black");
		System.out.println("Three-arg Constructor called!!");
	}

//	Two-arg Constructor 
	BikeConChaining(String brand,String model) {
		this(brand, model, 100000.0);
		System.out.println("Two-arg Constructor called!!");
	}

	
//	One-arg Constructor 
	BikeConChaining(String brand) {
		this(brand, "unknown");
		System.out.println("One-arg Constructor called!!");
	}
	
//	No-arg Constructor 
	BikeConChaining() {
		this("unknown");
		System.out.println("No-arg Constructor called!!");
	}
	
	public static void main(String[] args) {
		System.out.println("Maain Method Started");
		
		BikeConChaining b1 = new BikeConChaining();
		System.out.println(b1.brand);
		System.out.println("**********************************");
		
		BikeConChaining b2 = new BikeConChaining("RE");
		System.out.println("Brand of the Bike: " +b2.brand);
		System.out.println("Model of the Bike: " +b2.model);
		System.out.println("**************************************");
		
		BikeConChaining b3 = new BikeConChaining("RE","Classic");
		b3.show();
		
		BikeConChaining b4 = new BikeConChaining("Yamaha","FZ-s",200000.0);
		b4.show();
		
		BikeConChaining b5 = new BikeConChaining("RE","Himalaya",250000.0,"Red");
		b5.show();
		
		System.out.println("Main Method Ended");

	}
	void show() {
		System.out.println("Brand of the Bike: " +brand);
		System.out.println("Model of the Bike: " +model);
		System.out.println("Price of the Bike: " +price);
		System.out.println("Color of the Bike: " +color);
		System.out.println("***********************************");
	}
}
