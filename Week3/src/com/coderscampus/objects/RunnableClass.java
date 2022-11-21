package com.coderscampus.objects;

import java.util.Scanner;

public class RunnableClass {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Type a number between 50 and 300");
		String userInput = scan.next();
		
		YourDigits userResults = new YourDigits();
		userResults.theUserInput(userInput);
		
		if (userResults.getResults() == 0)
			System.out.println("The number you typed in was: null");
		else {
			System.out.println("The number you typed in was: " + userResults.getResults());
		}
		
		/*Human philipMatthews = new Human();
		Human joniMatthews = new Human();
		
		philipMatthews.setProperties("Male", "6' 0\"", "255lbs", "Hazel");
		joniMatthews.setProperties("Female", "5' 5\"", "130lbs", "Blue");	
		
		System.out.println(philipMatthews.getInfo());
		System.out.println(joniMatthews.getInfo());*/
		
		/*YourDigits runNumbers = new YourDigits();*/
	scan.close();
	}
}
