package com.operators;
//Unary Operators : ++ -- + -
//Post-Increment
//Pre-Increment
public class TestUnaryOperators {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		
		int a = +10;
		System.out.println("Unary Plus : " + a);//10
		
		int b = -10;
		System.out.println("Unary minus : " + b);//-10
		
		int i = 10;
		int j = 5;
		
		System.out.println(++i);//11
		System.out.println(++j);//6
		System.out.println(i++);//11(prints)--> 12(then Increments)
		System.out.println(j++);//6 (prints)--> 7(then Increments)
		System.out.println(++i);//13
		System.out.println(j++);//7 (prints)--> 8(then Increments)
		System.out.println(i++);//13 (prints)--> 14(then Increments)
		System.out.println(++j);//9
		
		 System.out.println("i value : " + i);//14
		 System.out.println("j value : " + j);//9
	}

}
