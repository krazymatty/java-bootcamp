package com.coderscampus.assignment3;

import java.io.IOException;

public class Login {

	public static void main(String[] args) {
		UsernameValidation locateUsernames;
		String usernameResults;
		String[] usernameArray = null;
		
		try {
			locateUsernames = new UsernameValidation("data.txt");
			usernameResults = locateUsernames.getUsernameFile();
			UserService stringInput = new UserService();
			usernameArray = stringInput.parseText(usernameResults);

		} catch (IOException e) {
			e.printStackTrace();
		}

		CheckUsername scan = new CheckUsername();
		String usernameInput = scan.getResults();
		for (String username : usernameArray) {

			if (username.equals(usernameInput)) {
				
				
			} 

		}

		// System.out.println(usernameResults);

		/*
		 * System.out.println("Please enter your username: "); Scanner usernameInputScan
		 * = new Scanner(System.in); String usernameInput = usernameInputScan.next();
		 * 
		 * System.out.println(usernameInput);
		 * 
		 * System.out.println("Please enter your password: "); Scanner passwordInputScan
		 * = new Scanner(System.in); String passwordInput = passwordInputScan.next();
		 * 
		 * System.out.println(usernameInput + " : " + passwordInput);
		 * 
		 * 
		 * // System.out.println(readDB); usernameInputScan.close();
		 * passwordInputScan.close();
		 * 
		 * // System.out.println(db);
		 */

		/*
		 * System.out.println("Please enter your username: "); try (Scanner
		 * usernameInputScan = new Scanner(System.in)) { String usernameInput =
		 * usernameInputScan.next();
		 * 
		 * }
		 */

	}
}
