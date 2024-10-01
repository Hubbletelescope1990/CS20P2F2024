package Mastery;

import java.util.Scanner;
import java.util.Random;

public class MathTutor {

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);
		Random rand = new Random();
		
		//Variable initialization
		double random_number_1;
		double random_number_2;
		double user_answer;
		double computer_answer = 0;
		int math_method_int;
		String math_method = null;
		
		//Random math problem generation
		random_number_1 = Math.round(rand.nextDouble(10 - 1 + 1) + 1);
		random_number_2 = Math.round(rand.nextDouble(10 - 1 + 1) + 1);
		math_method_int = rand.nextInt(4 - 1 + 1) + 1;
		if (math_method_int == 1) {
			math_method = "+";
		}
		if (math_method_int == 2) {
			math_method = "-";
		}
		if (math_method_int == 3) {
			math_method = "*";
		}
		if (math_method_int == 4) {
			math_method = "/";
		}
		//User input
		System.out.print("What is the answer to: " + random_number_1 + math_method + random_number_2 + "?(round to nearest integer) ");
		user_answer = userInput.nextDouble();
		
		//logic and calculations
		if (math_method_int == 1) {
			computer_answer = random_number_1 + random_number_2;
		}
		if (math_method_int == 2) {
			computer_answer = random_number_1 - random_number_2;
		}
		if (math_method_int == 3) {
			computer_answer = random_number_1 * random_number_2;
		}
		if (math_method_int == 4) {
			computer_answer = Math.round(random_number_1 / random_number_2);
		}
		if (user_answer == computer_answer) {
			System.out.print("Your answer was correct. Good job!");
		} else {
			System.out.print("Your answer was iccorrect. The correct answer was: " + computer_answer);
		}
	}

}
