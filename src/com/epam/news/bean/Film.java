package com.epam.news.bean;

public class Film extends News{
	private double rating;

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
