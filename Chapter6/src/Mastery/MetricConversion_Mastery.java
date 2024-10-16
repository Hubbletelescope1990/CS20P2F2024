package Mastery;

import java.util.Scanner;

public class MetricConversion_Mastery {

	public static void inchesToCentimeters(double num) {
		double conversion;
		
		conversion = num * 2.54;
		
		System.out.print(num + " inches is equal to: " + conversion + " centimeters.");
	}
	
	public static void feetTocentimeters(double num) {
		double conversion;
		
		conversion = num * 30;
		
		System.out.print(num + " feet is equal to: " + conversion + " centimeters.");
	}
	
	public static void yardsToMeters(double num) {
		double conversion;
		
		conversion = num * 0.91;
		
		System.out.print(num + " yards is equal to: " + conversion + " meters.");
	}
	
	public static void milesToKilometers(double num) {
		double conversion;
		
		conversion = num * 1.6;
		
		System.out.print(num + " miles is equal to: " + conversion + " kilometers.");
	}
	
	public static void centimetersToInches(double num) {
		double conversion;
		
		conversion = num / 2.54;
		
		System.out.print(num + " centimeters is equal to: " + conversion + " inches.");
	}
	
	public static void centimetersToFeet(double num) {
		double conversion;
		
		conversion = num / 30;
		
		System.out.print(num + " centimeters is equal to: " + conversion + " feet.");
	}
	
	public static void metersToYards(double num) {
		double conversion;
		
		conversion = num / 0.91;
		
		System.out.print(num + " meters is equal to: " + conversion + " yards.");
	}
	
	public static void kilometersToMiles(double num) {
		double conversion;
		
		conversion = num / 1.6;
		
		System.out.print(num + " kilometers is equal to: " + conversion + " miles.");
	}
	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);
		
		//variable initialization
		int choice;
		double number;
		
		//User input
		System.out.println("Press 1 for inches to centimeters.");
		System.out.println("Press 2 for feet to centimeters.");
		System.out.println("Press 3 for yards to meters.");
		System.out.println("Press 4 for miles to kilometers.");
		System.out.println("Press 5 for centimeters to inches.");
		System.out.println("Press 6 for centimeters to feet.");
		System.out.println("Press 7 for meters to yards.");
		System.out.println("Press 8 for kilometers to miles.");
		System.out.print("Enter your selection: ");
		choice = userInput.nextInt();
		
		System.out.print("Enter the number you wish to convert: ");
		number = userInput.nextDouble();
		
		//Logic to go to methods
		if (choice == 1) {
			inchesToCentimeters(number);
		} else if (choice == 2) {
			feetTocentimeters(number);		
		} else if (choice == 3) {
			yardsToMeters(number);
		} else if (choice == 4) {
			milesToKilometers(number);
		} else if (choice == 5) {
			centimetersToInches(number);
		} else if (choice == 6) {
			centimetersToFeet(number);
		} else if (choice == 7) {
			metersToYards(number);
		} else if (choice == 8) {
			kilometersToMiles(number);
		} else {
			System.out.print("Invalid conversion choice.");
		}

	}

}
