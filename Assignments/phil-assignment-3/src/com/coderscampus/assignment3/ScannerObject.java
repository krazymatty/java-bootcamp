package com.coderscampus.assignment3;

import java.util.Scanner;

public class ScannerObject {
	int convertedString;
	String message;

	public ScannerObject(String message) {
		System.out.println(message);
		// Declaring a scan object
		Scanner scan = new Scanner(System.in);
		convertedString = Integer.parseInt(scan.next());

		// close scan instance
		scan.close();
	}

	int getResults() {

		return convertedString;
	}
}
