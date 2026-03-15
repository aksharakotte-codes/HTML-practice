package com.languagefundamentals.constructors.chainingex;
//Copy Constructors example without constructor chaining 
public class Student3 {
	String name;
	String rollNo;
	String course;
    double marks;
	
	Student3(String name, String rollNo){
		System.out.println("Parameterized-1 Constructor called!!!");
		this.name = name;
		this.rollNo = rollNo;
	}	
		
	Student3(Student3 s,String course, double marks){
		System.out.println("Parameterized-2 Constructor called!!!");
		this.course = course ;
		this.marks = marks;
		this.name = s.name;
		this.rollNo = s.rollNo;
		
	}
	public static void main(String[] args) {
		System.out.println("Main Method Started!!");
		
		Student3 s1 = new Student3("Akshara", "22TP1A0587");
		s1.displayStudent();
		
		Student3 s2 = new Student3(s1, "CSE", 100.0);
		s2.displayStudent();
		
		System.out.println("Main Method Ended!!");
	}
	
	void displayStudent() {
		System.out.println("Name of the Student : " + name);
		System.out.println("RollNo of the Student : " + rollNo);
		System.out.println("Course of the Student : " + course);
		System.out.println("Marks of the Student: " + marks);
		System.out.println("****************************");
	}

}

