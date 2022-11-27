package com.coderscampus.week3_exercise1;

public class Main {

	public static void main(String[] args) {

		String instructions = "Type a number between 50 and 300.";
		ScannerObject userInput = new ScannerObject(instructions);
		System.out.println("The number you typed in was: " + userInput.getResults());

	}

}
