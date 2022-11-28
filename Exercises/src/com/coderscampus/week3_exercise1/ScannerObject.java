package com.coderscampus.week3_exercise1;

import java.util.Scanner;

public class ScannerObject {
	public Integer convertedString;
	public String message;

	public ScannerObject(String message) {
		System.out.println(message);
		Scanner scan = new Scanner(System.in);
		convertedString = Integer.parseInt(scan.next());

		scan.close();
	}

	public Integer getResults() {
		if (convertedString < 50 || convertedString > 300) {
			return null;
		}
		return convertedString;
	}
}
