package com.foms.businesstier.entity;

public class Item {
	String itemName = "";
	double cost = 0.00;
	int calories = 0;
	String meatType = "";
	String review = "";
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public int getCalories() {
		return calories;
	}
	public void setCalories(int calories) {
		this.calories = calories;
	}
	public String getMeatType() {
		return meatType;
	}
	public void setMeatType(String meatType) {
		this.meatType = meatType;
	}
	public String getReview() {
		return review;
	}
	public void setReview(String review) {
		this.review = review;
	}
	
	
}
