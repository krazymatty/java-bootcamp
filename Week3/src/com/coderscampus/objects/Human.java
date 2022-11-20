package com.coderscampus.objects;

public class Human {
	String gender;
	String height;
	String weight;
	String eyeColor;
	
	String getInfo () {
		return "Gender: " + gender + ", Height: " + height + ", Weight: " + weight +
				", Eye Color: " +  eyeColor;
	}
	
	void setProperties (String gender, String height, String weight, String eyeColor) {
		this.gender = gender;
		this.height = height;
		this.weight = weight;
		this.eyeColor = eyeColor;
	}
}
