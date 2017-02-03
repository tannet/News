package com.epam.news.bean;

/**
 * Created by hannatarletskaya on 1/30/17.
 */
public class News {

	private String category;
    private String title;
    private String author;
    private int year;
    //private double price;
    //private String additionalInfo;
    
    
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
//	public double getPrice() {
//		return price;
//	}
//	public void setPrice(double price) {
//		this.price = price;
//	}

    @Override
	public String toString() {
		return "category=" + category + ", title=" + title + ", author=" + author + ", year=" + year;
	}
}
