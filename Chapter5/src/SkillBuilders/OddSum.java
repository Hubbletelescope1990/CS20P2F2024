package SkillBuilders;

import java.util.Scanner;

public class OddSum {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		//variable initialization
		int input;
		int sum = 0;
		
		//user input
		System.out.print("Please input a whole number: ");
		input = userInput.nextInt();
		
		//for loop
		for (int i = 1; i <= input; i++) {
			//Nested if to check if number is odd
			if (i % 2 != 0) {
				sum += i;
			}
		}
		//Output statement displaying sum
		System.out.print("The sum of all odd the odd numbers between 1 and " + input + " is: " + sum);
	}

}
