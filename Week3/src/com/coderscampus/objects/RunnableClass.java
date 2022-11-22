package com.coderscampus.objects;

import java.util.Scanner;

public class RunnableClass {

	public static void main(String[] args) {
		int theResult;

		Scanner scan = new Scanner(System.in);
		System.out.println("Type a number between 50 and 300");
		do {

			String userInput = scan.next();

			YourDigits userResults = new YourDigits();
			userResults.theUserInput(userInput);

			theResult = userResults.getResults();
			
			if (theResult < 50 || theResult > 300) {
				System.out.println("Oops, that number wasn't between 50 and 300, try again:");
			}
		} 

		while (theResult < 50 || theResult > 300);
		
		System.out.println("The number you typed in was:  "+ theResult);
		scan.close();
	}
}
