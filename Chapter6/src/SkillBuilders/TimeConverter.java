package SkillBuilders;

import java.util.Scanner;

public class TimeConverter {
	
	//Hours to minutes method
	public static void hoursToMinutes() {
		Scanner userInput = new Scanner(System.in);
		
		int hours;
		int minutes;
		
		System.out.print("Enter number of hours: ");
		hours = userInput.nextInt();
		
		minutes = hours * 60;
		
		System.out.print(minutes + " minutes");
	}
	
	//Days to hours method
	public static void daysToHours() {
		Scanner userInput = new Scanner(System.in);
		
		int days;
		int hours;
		
		System.out.print("Enter number of days: ");
		days = userInput.nextInt();
		
		hours = days * 24;
		
		System.out.print(hours + " hours");
	}
	
	//Minutes to hours method
	public static void minutesToHours() {
		Scanner userInput = new Scanner(System.in);
		
		double minutes;
		double hours;
		
		System.out.print("Enter number of minutes: ");
		minutes = userInput.nextDouble();
		
		hours = minutes / 60;
		
		System.out.print(hours + " hours");
	}
	
	//Hours to days method
	public static void hoursToDays() {
		Scanner userInput = new Scanner(System.in);
		
		double hours;
		double days;
		
		System.out.print("Enter number of hours: ");
		hours = userInput.nextDouble();
		
		days = hours / 24;
		
		System.out.print(days + " days");
	}
	
	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		//Variable initialization
		int choice;
		
		//User input
		System.out.println("Enter 1 for hours to minutes conversion");
		System.out.println("Enter 2 for days to hours conversion");
		System.out.println("Enter 3 for minutes to hours conversion");
		System.out.println("Enter 4 for hours to days conversion");
		System.out.print("Enter your choice: ");
		choice = userInput.nextInt();
		
		//logic
		if (choice == 1) {
			hoursToMinutes();
		} else if (choice == 2) {
			daysToHours();
		} else if (choice == 3) {
			minutesToHours();
		} else if (choice == 4) {
			hoursToDays();
		} else {
			System.out.print("Invalid choice");
		}

	}

}
