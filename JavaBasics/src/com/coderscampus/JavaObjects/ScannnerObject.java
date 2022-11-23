import java.util.Scanner;

public class ScannnerObject {

	public static void main (String[] args) {

		// Declaring a scan object
		Scanner scan = new Scanner(System.in);

		//instantiate a scan object
		scan.next(); // Grabs the user input
		scan.nextLine(); // Grabs the entire line
		
		//close scan instance
		scan.close();

	}
}
