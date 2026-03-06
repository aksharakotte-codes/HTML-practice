package com.languagefundamentals.constructors.examples;


public class AllConnstructors {

	String accno;
	String accholder;
	double balance;
	
	//No-arg Constructor
	AllConnstructors() {
		System.out.println("No-arg Constructor called!!");
	}
	
	//Parameterized Constructor
	AllConnstructors(String accno, String accholder, double d) {
		System.out.println("Parameterized Constructor called!!");
		this.accno = accno;
		this.accholder = accholder;
		this.balance = d;
	}
	public static void main(String[] args) {
		System.out.println("Main Method Started!!!");
		
		AllConnstructors a = new AllConnstructors("22TP1A0587", "Akshara", 200000);
		a.bankInfo();
		
		AllConnstructors a1 = new AllConnstructors("22TP1A05D8", "Vyshnavi", 20000);
		a1.bankInfo();
		
		System.out.println("Main Method Ended!!!");
		
	}
	
	void bankInfo() {
		System.out.println(accno);
		System.out.println(accholder);
		System.out.println(balance);
	}

}
