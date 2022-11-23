
import java.util.Random;
import java.util.Scanner;

public class JavaBasicsRunnable {

	public static void main(String[] args) {

		/*
		 ScannerObject() {
			// Declaring a scan object
			Scanner scan = new Scanner(System.in);

			//instantiate a scan object
			scan.next(); // Grabs the user input
			scan.nextLine(); // Grabs the entire line

			//close scan instance
			scan.close();
		}
		 */
		int max = 100;
		Random random = new Random();
		for(int counter = 1; counter < 100; counter++) {
			int randomNumber = 1+random.nextInt(max);
			System.out.println(randomNumber);
		}
	}

}
