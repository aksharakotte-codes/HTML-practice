package com.languagefundamentals.constructors.examples;

public class Book {

	String title;
	String author;
	
	//No-arg constructor
	Book(){
		System.out.println("Book Read successfully");
		title = "Believe in Yourself";
		author = "Sunil";
	}
	public static void main(String[] args) {
		System.out.println("Main Method started!!");
		
		Book b1 = new Book();
		System.out.println("Book's Title  :"  +b1.title);
		System.out.println("Book's Author :"  +b1.author);
		
		
		System.out.println("Main Method ended!!");

	}

}