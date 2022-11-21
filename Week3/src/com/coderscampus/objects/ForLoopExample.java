package com.coderscampus.objects;

public class ForLoopExample {
	void forLoopExample() {
		// for loops: initial i value; boolean condition i <= ?; increment i = i +- 1
		for (int i = 1; i <= 10; i = i + 1) {
			System.out.print(i + ": ");
			System.out.println(i * i);
		}

		System.out.println("Done");
	}
}
