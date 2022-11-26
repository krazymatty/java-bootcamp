package com.coderscampus.week5;

public class UserService {

	public User createUser(String username, String password) {
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		return user;
	}

}
