

public class UserServices {

	public String[] parseText(String fileInput) {

		String[] userArray = fileInput.split(",");

		return userArray;
	}

	public User createUser(String username, String password, String name) {
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		user.setName(name);

		return user;
	}

}
