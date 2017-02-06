package com.epam.news.bean;

public class Disk extends News{
	private double duration;
	
	public Disk (String s){
		super(s);
		setDuration(Double.parseDouble(s.split(" / ")[4])); //not correct, change to type Time
	}

	public double getduration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}
	
	@Override
	public String toString() {
		return "Disk: " + super.toString() + ", duration=" + duration;
	}
}

