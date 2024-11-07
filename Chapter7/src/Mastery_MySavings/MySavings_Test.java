package Mastery_MySavings;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class MySavings_Test {
	
	static MySavings_Mastery bank = new MySavings_Mastery();

	public static void main(String[] args) throws InterruptedException {
		
		Scanner userInput = new Scanner(System.in);
		DecimalFormat f = new DecimalFormat("0.00");
		
		int quit = 0;
		int initial_penny;
		int initial_nickel;
		int initial_dime;
		int initial_quarter;
		int initial_choice;
		int choice;
		String total = null;
		
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
				System.out.println(f.format(bank.getTotal()));
				TimeUnit.SECONDS.sleep(3);
			}
			if (choice == 2) {
				bank.addPenny();
			}
			if (choice == 3) {
				bank.addNickel();
			}
			if (choice == 4) {
				bank.addDime();
			}
			if (choice == 5) {
				bank.addQuarter();
			}
			if (choice == 6) {
				bank.removePenny();
			}
			if (choice == 7) {
				bank.removeNickel();
			}
			if (choice == 8) {
				bank.removeDime();
			}
			if (choice == 9) {
				bank.removeQuarter();
			}
			
		}
	}

}
