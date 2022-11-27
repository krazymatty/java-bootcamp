package com.coderscampus.assignment3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class UsernameValidation {
	String file;
	BufferedReader fileReader;
	String usernameFile;
	String passwordFile;

	public UsernameValidation(String file) throws IOException {

		try {
			BufferedReader fileReader = new BufferedReader(new FileReader(file));

			fetchUsernames();

			fileReader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	private void fetchUsernames() throws IOException {
		String line;
		while ((line = fileReader.readLine()) != null) {
			UserService fileInputs = new UserService();
			String[] userArray = fileInputs.parseText(line);
			User userResults = fileInputs.createUser(userArray[0], userArray[1], userArray[2]);
			if (usernameFile == null) {
				usernameFile = userResults.username;
			} else {
				usernameFile = usernameFile + "," + userResults.username;
			}
			
			
		}

	private void fetchPasswords(String username) throws IOException {
		String line;
		while ((line = fileReader.readLine()) != null) {
			UserService fileInputs = new UserService();
			String[] userArray = fileInputs.parseText(line);
			User userResults = fileInputs.createUser(userArray[0], userArray[1], userArray[2]);
			if (usernameFile == null) {
				usernameFile = userResults.username;
			} else {
				usernameFile = usernameFile + "," + userResults.username;
			}

		}

	}

	String getUsernameFile() {

		return usernameFile;
	}

}
