package com.epam.news.bean;

public class Book extends News{	
	private String genre;

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "Book: " + super.toString() + ", genre=" + genre;
	}


}
