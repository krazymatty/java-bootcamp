package com.coderscampus.week2;

import java.util.Scanner;

public class Week2Example {
	
	public static void main (String[] args)	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Type a number between 50 and 300");
		String input = scanner.nextLine();
		Integer convertedInput = Integer.parseInt(input);
		System.out.println("You typed in: \"" + convertedInput + "\"");
		if (convertedInput > 50 && convertedInput < 300) {
			System.out.println("Yes!");
		} else {
			
			System.out.println("No!");
		}
		scanner.close();
	}
}