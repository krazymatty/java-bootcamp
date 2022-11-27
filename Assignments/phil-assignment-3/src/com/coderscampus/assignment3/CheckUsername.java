package com.coderscampus.assignment3;

import java.util.Scanner;

public class CheckUsername {
	String usernameEntered;
	String message;

	public CheckUsername() {
		System.out.println("Enter Your Username: ");
		// Declaring a scan object
		Scanner scan = new Scanner(System.in);
		usernameEntered = scan.nextLine();

		// close scan instance
		scan.close();
	}

	String getResults() {

		return usernameEntered;
	}
}
