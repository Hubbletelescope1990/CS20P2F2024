package Mastery;

import java.util.Scanner;

public class AddCoins_mastery {

	public static String inchesToCentimeters(int pennies, int dimes, int nickels, int quarters) {
		double accuratepennies;
		double accuratedimes;
		double accuratenickels;
		double accuratequarters;
		double sum;
		String stringsum;
		
		accuratepennies = pennies * 0.01;
		accuratedimes = dimes * 0.10;
		accuratenickels = nickels * 0.05;
		accuratequarters = quarters * 0.25;
		
		sum = accuratepennies + accuratedimes + accuratenickels + accuratequarters;
		stringsum = "$" + String.valueOf(sum);
		return stringsum;
	}

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);
		
		//variable initialization
		int pennies;
		int dimes;
		int nickels;
		int quarters;
		String sum;
		
		//user input
		System.out.print("Enter number of pennies: ");
		pennies = userInput.nextInt();
		System.out.print("Enter number of dimes: ");
		dimes = userInput.nextInt();
		System.out.print("Enter number of nickels: ");
		nickels = userInput.nextInt();
		System.out.print("Enter number of quarters: ");
		quarters = userInput.nextInt();
		
		sum = inchesToCentimeters(pennies, dimes, nickels, quarters);
		
		System.out.print("You have: " + sum);
		
	}

}
