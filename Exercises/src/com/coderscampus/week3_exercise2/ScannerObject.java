package com.coderscampus.week3_exercise2;

import java.util.Scanner;

public class ScannerObject {
	public Integer convertedString;
	public String message;

	public ScannerObject(String message) {

		System.out.println(message);
		Scanner scan = new Scanner(System.in);
		convertedString = Integer.parseInt(scan.next());
		
		while (convertedString < 50 || convertedString > 300) {
				
			System.out.println("Oops, that number wasn't between 50 and 300, try again:");
			convertedString = Integer.parseInt(scan.next());
			} 
			
		
		//System.out.println("The number you typed in was: " + convertedString);
		
		scan.close();
	}
	

	public Integer getResults() {
		return convertedString;
	}
}
