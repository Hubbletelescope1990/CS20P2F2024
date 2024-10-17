package Mastery;

import java.util.Scanner;

public class AddCoins_mastery {
	//Adds pocket change together into total sum
	public static String getDollarAmount(int pennies, int dimes, int nickels, int quarters) {
		
		//Variable initialization
		double accuratepennies;
		double accuratedimes;
		double accuratenickels;
		double accuratequarters;
		double sum;
		String stringsum;
		
		//Converts coins to their actual value in Canadian dollars
		accuratepennies = pennies * 0.01;
		accuratedimes = dimes * 0.10;
		accuratenickels = nickels * 0.05;
		accuratequarters = quarters * 0.25;
		
		//Adds coins together for total sum
		sum = accuratepennies + accuratedimes + accuratenickels + accuratequarters;
		
		//Converts the integer number of the sum into a string and adds the dollar sign
		stringsum = "$" + String.valueOf(sum);
		
		//Return the string statement of the total value of the pocket change
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
		
		//Method call with variable to store the returned value
		sum = getDollarAmount(pennies, dimes, nickels, quarters);
		
		//output
		System.out.print("You have: " + sum);
		
	}

}
