package SkillBuilders;

import java.text.DecimalFormat;

import java.util.Scanner;

public class Digits {

	public static void main(String[] args) {
		
		DecimalFormat value = new DecimalFormat("#");
		
		Scanner userInput = new Scanner(System.in);
		System.out.print("Please enter a two digit number: ");
		int number = userInput.nextInt();
		
		int tensplace = number / 10;
		int onesplace = number % 10;
		
		System.out.println("The tens place digit is: " + value.format((Math.floor(tensplace))));
		System.out.println("The ones place digit is: " + onesplace);
	}

}
