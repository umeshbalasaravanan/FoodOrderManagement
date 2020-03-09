package com.foms.businesstier.entity;

public class Hotel {

	String Name = "";
	String Type = "";
	String Ratings = "";
	String location = "";
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public String getRatings() {
		return Ratings;
	}
	public void setRatings(String ratings) {
		Ratings = ratings;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
}
