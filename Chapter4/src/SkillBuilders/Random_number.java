package SkillBuilders;

import java.util.Scanner;
import java.util.Random;

public class Random_number {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		Random rand = new Random();
		
		//Variable initialization
		int number1;
		int number2;
		int random_number;
		
		//User input
		System.out.print("Please input the minimum value of the random number: ");
		number1 = userInput.nextInt();
		System.out.print("Please input the maximum value of the random number: ");
		number2 = userInput.nextInt();
		
		//Calculation
		random_number = rand.nextInt(number2 - number1 + 1) + number1;
		
		//Output
		System.out.print("The generated random number is: " + random_number);
		
	}

}
