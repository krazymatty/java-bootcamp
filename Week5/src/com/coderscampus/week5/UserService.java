package com.coderscampus.week5;

public class UserService {

	public User createUser(String username, String password, String name) {
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		user.setPassword(name);
		return user;
	}

}
