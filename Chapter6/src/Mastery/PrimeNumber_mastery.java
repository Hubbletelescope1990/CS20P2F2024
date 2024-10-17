package Mastery;

import java.util.Scanner;

public class PrimeNumber_mastery {
	//Determine if prime and return true or false depending on answer
	public static boolean isPrime(int num) {

		if (num == 2 || num == 3 || num == 5) {//Initial statement checks if the number is 3, 5, or 2
			return true;
		} else if (num % 2 != 0 && num % 3 != 0 && num % 5 != 0) {//Main prime number test statement
			return true;
		} else {
			return false;
		}
		}

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);
		
		//Variable initialization
		int number;
		boolean answer;
		
		//user input
		System.out.print("Please enter a whole number: ");
		number = userInput.nextInt();
		
		//Method calling
		answer = isPrime(number);
		
		//output
		System.out.print(answer);
	}

}
