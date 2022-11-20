package com.coderscampus.objects;

public class RunnableClass {

	public static void main(String[] args) {
		
		Human philipMatthews = new Human();
		Human joniMatthews = new Human();
		
		philipMatthews.setProperties("Male", "6' 0\"", "255lbs", "Hazel");
		joniMatthews.setProperties("Female", "5' 5\"", "130lbs", "Blue");	
		
		System.out.println(philipMatthews.getInfo());
		System.out.println(joniMatthews.getInfo());

	}

}
