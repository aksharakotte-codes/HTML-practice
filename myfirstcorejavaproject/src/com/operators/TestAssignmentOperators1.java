package com.operators;

//AssignmentOperators or Compound Operators --> = += -= /= %= 
public class TestAssignmentOperators1 {

	public static void main(String[] args) {
		
		int result = 0;
		double a = 5.5;
		System.out.println("Equals to : " + a );
//		result = result + a;//Type mismatch: cannot convert from double to int
		
		result += a;//result(variable) = result(value) + a; --> 0 + 5.5 = 5
		System.out.println("Addition : " + result);// 5.5(double) --> 5 (int)
		
		double b = 2.9;
		result -= b;//result = result - b; --> 5 - 2.9 = 2
		System.out.println("Subtraction : " + result);//2.1(double) --> 2(int)
		
		double c = 4.5;
		result *= c;//result = result * b; --> 4.5 * 2 = 9
		System.out.println("Multiplication : " + result);// 9
		
		double d = 3;
		result /= d;//result = result / d; --> 9/3 --> 3
		System.out.println("Division/Quotient : " + result);//3
		
		double e = 1;
		result %= e;//result = result - b; --> 3/1 = 0
		System.out.println("Modulus/Remainder : " + result);//0
	}

}
