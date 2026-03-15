package com.languagefundamentals.constructors;

public class MovieCopyCon {
	
	String hero;
	String heroine;
	String director;
	double budget;
	String movieName;
	String producer;
	
	MovieCopyCon() {
		System.out.println("No-arg Constructor called!!!");
	}
	
	MovieCopyCon(String producer, String director) {
		this();
		System.out.println("Parameterized-1 Constructor called!!!");
		this.producer = producer;
		this.director = director;
	}
	MovieCopyCon(MovieCopyCon m, String hero, double budget) {
		System.out.println("Parameterized-2 Constructor called!!!");
		this.hero = hero;
		this.budget = budget;
		this.producer = m.producer;
		this.director = m.director;
	}
	MovieCopyCon(MovieCopyCon m, String movieName, String heroine) {
		this(m, m.hero, m.budget);
		System.out.println("Parameterized-2 Constructor called!!!");
		this.heroine = heroine;
		this.movieName = movieName;
	}
	
	public static void main(String[] args) {
		System.out.println("Main Method Started!!");
		
		MovieCopyCon m1 = new MovieCopyCon();
		m1.showDetails();
		
		MovieCopyCon m2 = new MovieCopyCon("D V V", "Rajamouli");
		m2.showDetails();
		
		MovieCopyCon m3 = new MovieCopyCon(m2,"Mahesh Babu", 500000000000.0);
		m3.showDetails();
		
		MovieCopyCon m4 = new MovieCopyCon(m3,"VARANASI", "Priyanka Chopra");
		m4.showDetails();
		
		System.out.println("Main Method Ended!!");
	}
	
	void showDetails() {
		System.out.println("Name of the Movie : " +movieName);
		System.out.println("Name of the Hero : " + hero);
		System.out.println("Name of the Heroine : " + heroine);
		System.out.println("Name of the Director : " + director);
		System.out.println("Name of the Producer : " + producer);
		System.out.println("Budget of the Movie : " + budget);
		System.out.println("************************************");
	}

}
