package com.coderscampus.objects;

public class YourDigits {
	int convertedString; 	
	int resultingNumber;

	int getResults() {

		return convertedString;
	}



	void theUserInput(String userInput) {

		convertedString = Integer.parseInt(userInput);

	}
}