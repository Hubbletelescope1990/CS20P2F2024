package Mastery_DigitExtractor;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class DigitExtractor_Test {

	static DigitExtractor_Mastery num = new DigitExtractor_Mastery();
	
	public static void main(String[] args) throws InterruptedException {
		
		Scanner userInput = new Scanner(System.in);
		
		char choice;
		int number;
		int quit = 0;
		
		System.out.print("Please enter a three digit(###) whole number: ");
		number = userInput.nextInt();
		num.setInteger(number);
		
		while (quit == 0) {
			
			System.out.println("w: Show the whole number");
			System.out.println("o: Show the ones place");
			System.out.println("t: Show the tens place");
			System.out.println("h: Show the hundreds place");
			System.out.println("q: Quit");
			System.out.println("");
			System.out.print("Enter your choice: ");
			choice = userInput.next().charAt(0);
		
			if (choice == 'w') {
				System.out.println("The whole number is: " + num.getWholeNumber());
				TimeUnit.SECONDS.sleep(3);
			} else if (choice == 'o') {
				System.out.println("The ones place is: " + num.getOnesPlace());
				TimeUnit.SECONDS.sleep(3);
			} else if (choice == 't') {
				System.out.println("The tens place is: " + num.getTensPlace());
				TimeUnit.SECONDS.sleep(3);
			} else if (choice == 'h') {
				System.out.println("The hundreds place is: " + num.getHundredsPlace());
				TimeUnit.SECONDS.sleep(3);
			} else if (choice == 'q') {
				quit = 1;
			} else {
				System.out.println("Error: invalid input");
				TimeUnit.SECONDS.sleep(3);
			}
			System.out.println("");
		
		}
		
		
		

	}

}
