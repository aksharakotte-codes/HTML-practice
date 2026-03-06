package com.languagefundamentals.constructors.examples;

public class Student {

	String name;
	int age;
	
	public static void main(String[] args) {
		System.out.println("Main Method started!!");
		
		Student s1 = new Student();
		System.out.println("Student Object Created");
		System.out.println("Student's Name  :"  +s1.name);
		System.out.println("Student's Age   :"  +s1.age);
		
		
		System.out.println("Main Method ended!!");

	}

}