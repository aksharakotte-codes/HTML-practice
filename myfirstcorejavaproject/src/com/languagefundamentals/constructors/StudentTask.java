package com.languagefundamentals.constructors;

public class StudentTask {
	
	String name;
	int marks1;
	int marks2;
	int marks3;
	int total;
	double average;
	
	StudentTask(String name, int marks1, int marks2, int marks3) {
		this.name = name;
		this.marks1 = marks1;
		this.marks2 = marks2;
		this.marks3 = marks3;
		
		total =  marks1+marks2+marks3;
		average= (double)total / 3;
	}
	
	public static void main(String[] args) {
		System.out.println("Main Method Started!!");
		System.out.println("******Student's Info1******");
		StudentTask s1 = new StudentTask("Akshara", 100, 99, 98);
		s1.studentInfo();
		
		System.out.println("******Student's Info2******");
		StudentTask s2 = new StudentTask("Virat", 78, 99, 90);
		s2.studentInfo();
		
		System.out.println("******Student's Info3******");
		StudentTask s3 = new StudentTask("Dhoni", 87, 69, 65);
		s3.studentInfo();
		
		System.out.println("******Student's Info4******");
		StudentTask s4 = new StudentTask("Sachin", 93, 98, 81);
		s4.studentInfo();
		
		System.out.println("******Student's Info5******");
		StudentTask s5 = new StudentTask("Hardik", 100, 87, 76);
		s5.studentInfo();
		
		System.out.println("Main Method Ended");

	}
	
	void studentInfo() {
		System.out.println("Student name:" +name);
		System.out.println("Student's Maths score:" +marks1);
		System.out.println("Student's English score:" +marks2);
		System.out.println("Student's Physics score:" +marks3);
		System.out.println("Student's Total marks:" +total);
		System.out.println("Student's Average score:" +average);
	}

}
