package com.coderscampus.assignment3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Login {

	public static void main(String[] args) throws IOException {
		String db = null;

		BufferedReader fileReader = null;
		try {
			fileReader = new BufferedReader(new FileReader("data.txt"));
			String line;
			while ((line = fileReader.readLine()) != null) {

				UserService fileInputs = new UserService();
				String[] userArray = fileInputs.parseText(line);

				User readDB = fileInputs.createUser(userArray[0], userArray[1], userArray[2]);

				if (db == null) {
					db = readDB.username;
				} else {
					db = db + "," + readDB.username;
				}
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
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			fileReader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println();
		
		for (String string : readDB) {
			
		}

		/*
		 * System.out.println("Please enter your username: "); try (Scanner
		 * usernameInputScan = new Scanner(System.in)) { String usernameInput =
		 * usernameInputScan.next();
		 * 
		 * }
		 */

	}
}
