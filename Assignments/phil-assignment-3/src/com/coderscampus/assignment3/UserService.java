package com.coderscampus.assignment3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class UserService {
	public static Integer userAttempts = 0;
	public static String username = null;
	public static String password = null;
	public static String name = null;
	public static String validateUser = null;
	public static String[] userArray = null;
	public static Boolean userAuth = null;

	public static void login() {
		if (userAttempts < 5) {
			try (Scanner scan = new Scanner(System.in)) {
				if (userAttempts == 0) {
					System.out.println("Enter Username: ");
				} else {
					System.out.println("You have attempts " + (5 - userAttempts) + " remaining!");
					System.out.println("Enter Username: ");
				}

				username = scan.nextLine().toLowerCase();
				System.out.println("Enter Password: ");
				password = scan.nextLine();
				getUsers();
				scan.close();
			}
		} else {
			failedAttempts();
		}

	}

	public static void getUsers() {
		String line = null;
		try (BufferedReader fileReader = new BufferedReader(new FileReader("data.txt"))) {

			while ((line = fileReader.readLine()) != null) {
				userArray = parseText(line);
				createUser(userArray[0],userArray[1],userArray[2]);
				if (username.equals(userArray[0].toLowerCase()) && password.equals(userArray[1])) {
					userAuth = true;
					break;
				}
			}
			fileReader.close();
			if (userAuth != null) {
				name = Arrays.stream(userArray[2].split("\\s+")).map(t -> t.substring(0, 1).toUpperCase() + t.substring(1))
						.collect(Collectors.joining(" "));
				System.out.println("Welcome: " + name);
			} else {
				userAttempts = userAttempts + 1;
				System.out.println("Invalid login, please try again:");
				login();
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static String[] parseText(String fileInput) {
		String[] userArray = fileInput.split(",");

		return userArray;
	}

	public static User createUser(String username, String password, String name) {
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		user.setName(name);
		return user;

	}

	public static String[] getResults() {

		return userArray;
	}

	public static void failedAttempts() {

		System.out.println("You have too many failed login attempts: Your account is locked!");
	}

}
