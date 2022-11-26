package com.coderscampus.week5;

public class Main {

	public static void main(String[] args) {
		UserService userService = new UserService();
		
		User philmatthews = userService.createUser("krazymatty@gmail.com", "mattypassword");
		
		System.out.println(philmatthews);
		
		

	}

}
