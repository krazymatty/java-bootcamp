package com.coderscampus.objects;

public class YourDigits {
	int convertedString; 	
	int resultingNumber;
	
	int getResults() {
		if (convertedString < 50 || convertedString > 300 ) {
			resultingNumber =  0;
			return resultingNumber;
		} else {
			resultingNumber = convertedString;
			return resultingNumber;
		}	
	}
	void theUserInput(String userInput) {
		 
		convertedString = Integer.parseInt(userInput);
		
		
	}
}