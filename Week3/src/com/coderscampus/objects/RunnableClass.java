package com.coderscampus.objects;

public class RunnableClass {

	public static void main(String[] args) {
		Human philipMatthews = new Human();
		
		philipMatthews.eyeColor = "Hazel";
		philipMatthews.gender = "male";
		philipMatthews.height = "6'0\"";
		philipMatthews.weight = "240lbs";
		
		System.out.println(philipMatthews.getInfo());

	}

}
