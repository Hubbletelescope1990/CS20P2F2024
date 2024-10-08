package Mastery;

import java.util.*;

public class GuessingGame {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		Random rand = new Random();
		
		//Variable initialization
		int secret_number;
		int user_guess;
		
		//Secret number generation
		secret_number = rand.nextInt(20 - 1 + 1) + 1;
		
		//User input
		System.out.print("Guess a number between 1 and 20: ");
		user_guess = userInput.nextInt();
		
		//output and logic
		System.out.println("The number was: " + secret_number);
		System.out.println("You guessed: " + user_guess);
		if (secret_number == user_guess) {
			System.out.print("You won!");
		} else {
			System.out.print("Better luck next time.");
		}
	}

}
