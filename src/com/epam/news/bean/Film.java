package com.epam.news.bean;

public class Film extends News{
	private double rating;
	
	public Film (String s){
		super(s);
		setRating(Double.parseDouble(s.split(" / ")[4]));
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}
	
	@Override
	public String toString() {
		return "Film: " + super.toString() + ", rating=" + rating;
	}
}
