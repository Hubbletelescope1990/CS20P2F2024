package Mastery;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		//Variable initialization
		int input;
		
		//user input
		System.out.print("Please input a whole number: ");
		input = userInput.nextInt();
		
		//if statement returns true if number is prime
		if (input % 2 != 0 && input % 3 != 0 && input % 5 != 0) {
			System.out.print(input + " is a prime number.");
		} else {
			System.out.print(input + " is not a prime number.");
		}

	}

}
