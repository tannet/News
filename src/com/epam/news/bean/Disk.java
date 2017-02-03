package com.epam.news.bean;

public class Disk extends News{
	private double numberOfTracks;

	public double getNumberOfTracks() {
		return numberOfTracks;
	}

	public void setNumberOfTracks(double numberOfTracks) {
		this.numberOfTracks = numberOfTracks;
	}
	
	@Override
	public String toString() {
		return "Disk: " + super.toString() + ", numberOfTracks=" + numberOfTracks;
	}
}

