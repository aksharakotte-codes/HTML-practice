package com.languagefundamentals.constructors;

//Instead of JVM providing default values,
//developer can provide default values through no-arg constructor
public class EmployeeCon {
	
	String eid;
	String ename;
	double salary;
	
	EmployeeCon() {
		System.out.println("No-arg Constructor called!!");
		eid = "JFS-083";
		ename = "unknown";
		salary = 50000.00;
	}

	public static void main(String[] args) {
		System.out.println("Main Method Started!!");
		
		 EmployeeCon e1 = new  EmployeeCon();
		 e1.empInfo();

		
		System.out.println("Main Method Ended!!");

	}
	
	void empInfo() {
		System.out.println("Employee Id:" +  eid);
		 System.out.println("Employee Name:" +  ename);
		 System.out.println("Employee Salary:" +  salary);
	}

}
