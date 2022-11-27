package com.coderscampus.week5_8;

//import com.coderscampus.week5.User;

public class UserService {

	public String[] parseText(String input) {

		String[] inputArray = input.split(",");

		return inputArray;
	}

	public User createUser(String username, String password, String name) {
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		user.setName(name);
		return user;
	}
}
