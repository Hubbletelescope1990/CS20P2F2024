package SkillBuilders;

import java.util.Scanner;

public class NumbersSum {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		//Variable initialization
		int input;
		int sum = 0;
		
		//User input
		System.out.print("Please enter a whole number: ");
		input = userInput.nextInt();
		
		//For loop
		for (int i = 1; i <= input; i++) {
			sum += i;
			System.out.println(i);
		}
		System.out.print("The sum of all numbers is: " + sum);
	}

}
