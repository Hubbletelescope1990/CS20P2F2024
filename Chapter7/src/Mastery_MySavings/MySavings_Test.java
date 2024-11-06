package Mastery_MySavings;

import java.util.Scanner;

public class MySavings_Test {
	
	MySavings_Mastery bank = new MySavings_Mastery();

	public static void main(String[] args) {
		
		

		Scanner userInput = new Scanner(System.in);
		
		int quit = 0;
		int initial_penny;
		int initial_nickel;
		int initial_dime;
		int initial_quarter;
		int initial_choice;
		int choice;
		String total = null;
		
		System.out.println("Please create a bank account to begin.");
		System.out.println("To create a bank account with no money, press 1.");
		System.out.println("To create a bank account and add money to it, press 2.");
		System.out.println("");
		System.out.print("Please enter your prefered option: ");
		initial_choice = userInput.nextInt();
		
		if (initial_choice == 2) {
			System.out.print("Please enter number of pennies: ");
			initial_penny = userInput.nextInt();
			System.out.print("Please enter number of nickels: ");
			initial_nickel = userInput.nextInt();
			System.out.print("Please enter number of dimes: ");
			initial_dime = userInput.nextInt();
			System.out.print("Please enter number of quarters: ");
			initial_quarter = userInput.nextInt();
			MySavings_Mastery bank = new MySavings_Mastery(initial_penny, initial_nickel, initial_dime, initial_quarter);
		} else {
			
		}
		
		while (quit != 1) {
			System.out.println("Welcome to bank account management, please make a selection.");
			System.out.println("To view total bank value, press 1");
			System.out.println("To add a penny to the bank, press 2.");
			System.out.println("To add a nickel to the bank, press 3.");
			System.out.println("To add a dime to the bank, press 4.");
			System.out.println("To add a quarter to the bank, press 5.");
			System.out.println("To remove a penny from the bank, press 6.");
			System.out.println("To remove a nickel from the bank, press 7.");
			System.out.println("To remove a dime from the bank, press 8.");
			System.out.println("To remove a quarter from the bank, press 9.");
			System.out.println("To close the application, press 0.");
			System.out.println("");
			System.out.print("Please enter your selection: ");
			choice = userInput.nextInt();
			
			if (choice == 0) {
				quit = 1;
			}
			if (choice == 1) {
				bank.getTotal();
				System.out.println(bank.getTotal());
			}
		}
	}

}
