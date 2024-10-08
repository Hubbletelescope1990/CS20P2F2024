package Mastery;

import java.util.Scanner;
import java.util.Random;

public class GuessingGame_Mastery {

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);
		Random rand = new Random();
		
		//Variable initialization
		int secret_number;
		int user_guess;
		int win = 0;
		//Secret number generation
		secret_number = rand.nextInt(20 - 1 + 1) + 1;
		
		//loop initialization
		while (win != 1) {
			
			//User input
			System.out.print("Guess a number between 1 and 20: ");
			user_guess = userInput.nextInt();
		
			//output and logic

			if (secret_number == user_guess) {
				System.out.print("You won!");
				win = 1;
			} else {
				System.out.println("Try again.");
			}
		}

	}

}