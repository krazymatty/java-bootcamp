package com.coderscampus.objects;

import java.util.Date;

public class WhileLoopExample {
	void whileLoopExample1() {
		// while ( boolean Expression )
		// this example is the same as a for loop
		int i = 0;
		while (i < 11) {
			System.out.println(i);
			i++;
		}

		System.out.println("Done More");
	}

	void whileLoopExample2() {

		Date now = new Date();
		Date stopNow = new Date(122, 10, 21, 14, 39, 0);
		int i = 0;
		while (now.before(stopNow)) {
			i = i + 1;
			System.out.println(i + ": " + now);
			now = new Date();
		}
	}
}
