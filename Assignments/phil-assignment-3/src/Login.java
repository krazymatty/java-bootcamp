

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.coderscampus.week5_8.User;
import com.coderscampus.week5_8.UserService;

public class Login {

	public static void main(String[] args) throws IOException {
		int userAttempts = 0;
		BufferedReader fileReader = null;
		try {
			fileReader = new BufferedReader(new FileReader("data.txt"));
			String line;
			while ((line = fileReader.readLine()) != null) {
				
				UserServices fileInputs = new UserServices();
				String[] userArray = fileInputs.parseText(line);

				User readDB = fileInputs.createUser(userArray[0], userArray[1], userArray[2]);
								/*
				System.out.println("Please enter your username: ");
				Scanner usernameInputScan = new Scanner(System.in);
				String usernameInput = usernameInputScan.next();
				
			
				
				System.out.println(usernameInput);
				
	

				System.out.println("Please enter your password: ");
				Scanner passwordInputScan = new Scanner(System.in);
				String passwordInput = passwordInputScan.next();

				System.out.println(usernameInput + " : " + passwordInput);

				//System.out.println(readDB);
				usernameInputScan.close();
				//passwordInputScan.close();
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
		
		System.out.println(db);
	}

}
