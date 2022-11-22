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
	// The following code is meant to go into a main Runnable class
	/*Human philipMatthews = new Human();
	Human joniMatthews = new Human();
	
	philipMatthews.setProperties("Male", "6' 0\"", "255lbs", "Hazel");
	joniMatthews.setProperties("Female", "5' 5\"", "130lbs", "Blue");	
	
	System.out.println(philipMatthews.getInfo());
	System.out.println(joniMatthews.getInfo());*/
	
	/*YourDigits runNumbers = new YourDigits();*/
}
