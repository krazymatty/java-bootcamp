package com.coderscampus.week5_8;

public class Main {

	public static void main(String[] args) {
		String input = "exampleUser, examplePassword, exampleName";
		
		//UserService userService = new UserService();
		
		UserService stringInput = new UserService();
		String[] newArray = stringInput.parseText(input);
		

		/*User[] users = new User[13];

		for (int i = 0; i < 13; i++) {
			users[i] = userService.createUser("user" + (i + 1), "password" + (i + 1));

		}*/

		System.out.println(newArray);
	}
}