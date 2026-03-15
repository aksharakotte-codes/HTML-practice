package com.languagefundamentals.constructors.chainingex;
//Copy Constructors example without constructor chaining 
public class Book {
	String title;
	String author;
	double price;
	String publisher;
	
	Book(String title, String author){
		System.out.println("Parameterized-1 Constructor called!!!");
		this.title = title;
		this.author = author;
	}	
		
		Book(Book b,double price, String publisher){
			System.out.println("Parameterized-2 Constructor called!!!");
			this.price = price ;
			this.publisher = publisher;
			this.title = b.title;
			this.author = b.author;
		
	}
	public static void main(String[] args) {
		System.out.println("Main Method Started!!");
		
		Book b1 = new Book("Abbot", "Walter Scott");
		b1.displayBook();
		
		Book b2 = new Book(b1,5000.0, "Akshara");
		b2.displayBook();
		
		System.out.println("Main Method Ended!!");
	}
	
	void displayBook() {
		System.out.println("Title of the Book : " + title);
		System.out.println("Author of the Book : " + author);
		System.out.println("Price of the Book : " + price);
		System.out.println("Publisher of the Book : " + publisher);
		System.out.println("****************************");
	}

}
