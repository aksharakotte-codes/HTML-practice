package com.languagefundamentals.constructors.chainingex;
//Copy Constructors example with constructor chaining 
public class Employee1 {
	
	String empName;
	int empId;
	double salary;
	String department;
	
	Employee1() {
		System.out.println("No-arg Constructor called!!!");
	}
	
	Employee1(String empName, int empId){
		this();
		System.out.println("Parameterized-1 Constructor called!!!");
		this.empName = empName;
		this.empId = empId;
	}	
		
	Employee1(Employee1 e,String department, double salary) {
		this(e.empName, e.empId); 
		System.out.println("Parameterized-2 Constructor called!!!");
		this.department = department;
		this.salary = salary ;
		
	}
	public static void main(String[] args) {
		System.out.println("Main Method Started!!");
		
		Employee1 e = new Employee1();
		e.displayEmployee();
		
		Employee1 e1 = new Employee1("Akshara", 587);
		e1.displayEmployee();
		
		Employee1 e2 = new Employee1(e1,"Java Developer", 10000000.0);
		e2.displayEmployee();
		
		System.out.println("Main Method Ended!!");
	}
	
	void displayEmployee() {
		System.out.println("Name of the Employee:" + empName);
		System.out.println("Id of the Employee:" + empId);
		System.out.println("Salary of the Employee:" + salary);
		System.out.println("Department of the Employee:" + department);
		System.out.println("***************************************");
	}

}

