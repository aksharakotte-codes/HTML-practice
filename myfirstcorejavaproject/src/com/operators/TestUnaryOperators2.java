package com.operators;

public class TestUnaryOperators2 {

	public static void main(String[] args) {
		System.out.println("Main Method started!!");
		
		int a = 5;
		int b = 4;
		
		System.out.println(b++);//4(prints) --> 5(then Increments) b = 5
		System.out.println(++a);//6 a= 6
		System.out.println(b--);//5(prints) --> 4(then Decrements) b=4
		System.out.println(--b);//3 b=3
		System.out.println(a--);//6(prints) --> 5(then Decrements) a=5
		System.out.println(b++);//3(prints) --> 4(then Increments) b=4
		System.out.println(++b);//5 b=5
		System.out.println(--a);//4 a=4
		System.out.println(a-b);// 4-5 =-1
		System.out.println(a++);//4(prints) --> 5(then Increments) a=5
		System.out.println(--b);//4
		
		System.out.println("A value : " + a);//5
		System.out.println("B value : " + b);//4
		
//		a++ = 5(prints) --> 6(then Increments) a = 6
//		b++ = 4(prints) --> 5(then Increments) b = 5
//		++a = 7  --> a = 7
//		++b = 6	 --> b = 6	
		System.out.println(a++ + b++ + ++a + ++b);// 5 + 4 + 7 + 6 = 22
		
//		a++ = 7(prints) --> 8(then Increments) a = 8
//		++b = 7 --> b = 7
//		++a = 9  --> a = 9
//		--b = 6	 --> b = 6		
		System.out.println(a++ + ++b - ++a + --b);// 7 + 7 - 9 + 6 = 11
		System.out.println((a++ + ++b) - (++a + --b));// (7 + 7) - (9 + 6) = 14 - 15 = -1
		
	}

}
