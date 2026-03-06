package com.languagefundamentals.constructors;

public class Employee1Con {
	
	String eid;
	String ename;
	double salary;
	
	Employee1Con() {
		System.out.println("No-arg Constructor called!!");
		eid = "JFS-083";
		ename = "unknown";
		salary = 50000.00;
	}
//	To avoid ambiguity problems,we must provide same name for constructor parameters and 
//	When we have same name we must need to use this to  invoke current class object data members 
	Employee1Con(String eid,String ename,double salary){
		System.out.println("Parameterized constructor called!!");
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
	}

	public static void main(String[] args) {
		System.out.println("Main Method Started!!");
		
		 Employee1Con e1 = new  Employee1Con();
		 e1.empInfo();
		 
		 Employee1Con e2 = new  Employee1Con("JFS-084","Vyshu",20000.00);
		 e2.empInfo();

		
		System.out.println("Main Method Ended!!");

	}
	
	void empInfo() {
		System.out.println("Employee Id         :" +  eid);
		System.out.println("Employee Name       :" +  ename);
		System.out.println("Employee Salary     :" +  salary);
		System.out.println("******************************************");
	}

}
