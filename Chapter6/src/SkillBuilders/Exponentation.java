package SkillBuilders;

import java.util.Scanner;

public class Exponentation {
	
	//To the power of method
	public static void powerOf(int num1, int num2) {
		double num3;
		
		num3 = Math.pow(num1, num2);
		
		System.out.print(num1 + " to the power of " + num2 + " is equal to: " + (int)num3);
	}

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		//Variable
		int num1;
		int num2;
		
		//user input
		System.out.print("Enter the number: ");
		num1 = userInput.nextInt();
		System.out.print("Enter the power: ");
		num2 = userInput.nextInt();
		
		powerOf(num1, num2);
	}

}
