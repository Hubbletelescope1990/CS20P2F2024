package Mastery;

import java.util.Scanner;

public class Digits {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		//variable initialization
		double $threedigitnumber;
		double hundredsplace;
		double tensplace;
		double onesplace;
	
		//user input
		System.out.print("Please enter a 3 digit whole number.(100-999) ");
		$threedigitnumber = userInput.nextDouble();
	
		//Calculations
		hundredsplace = (Math.floor($threedigitnumber / 100));
		tensplace = (Math.floor(($threedigitnumber % 100) / 10));
		onesplace = (Math.floor(($threedigitnumber % 100) % 10));
	
		//Print statement with recasting of variables to integer
		System.out.println("The hundreds place is: " + (int)hundredsplace);
		System.out.println("The tens place is: " + (int)tensplace);
		System.out.println("The ones place is: " + (int)onesplace);
	}
}
