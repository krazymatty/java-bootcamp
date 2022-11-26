package com.coderscampus.week5;

public class Main {

	public static void main(String[] args) {
		UserService userService = new UserService();

		User[] users = new User[13];

		for (int i = 0; i < 13; i++) {
			users[i] = userService.createUser("user" + (i + 1), "password" + (i + 1), "User" + (i+1));

		}

		System.out.println(users);
	}
}