package SkillBuilders;

import java.util.Scanner;

public class PerfectSquare {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		//Variable initialization
		double number;
		double square_root;
		
		//User input
		System.out.print("Please input a number: ");
		number = userInput.nextDouble();
		
		//Calculation and logic
		square_root = Math.sqrt(number);		
		if (square_root % 1 == 0) {
			System.out.print("The number " + (int)number + " is a perfect square");
		} else {
			System.out.print("The number " + (int)number + " is not a perfect square");
		}
	}

}
