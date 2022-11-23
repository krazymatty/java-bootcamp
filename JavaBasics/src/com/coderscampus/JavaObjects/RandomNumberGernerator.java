import java.util.Random;

public class RandomNumberGernerator {

	public static void main (String[] args) {
		
		//rollTheDice();
		getRandomNumber();	

	}

	private static void getRandomNumber() {
		int max = 100;
		Random random = new Random();

		for(int counter = 1; counter < 100; counter++) {
			int randomNumber = 1+random.nextInt(max);
			System.out.println(randomNumber);
		}
		
	}

	private static void rollTheDice() {
		Random dice = new Random();

		for(int counter = 0; counter < 1; counter++) {
			int rolledDice = 1+dice.nextInt(6);
			System.out.println(rolledDice);
		}
		
	}
}
