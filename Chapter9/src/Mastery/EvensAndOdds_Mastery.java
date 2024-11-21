package Mastery;

import java.util.Random;

public class EvensAndOdds_Mastery {

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		//Variable initialization
		int[] random_numbers = new int[25];
		int[] even_numbers;
		int[] odd_numbers;
		int even_number = 0;
		int odd_number = 0;
		int even_index = 0;
		int odd_index = 0;
		
		//Generates 25 random numbers and counts how many are odd and even
		for (int i = 0; i < 25; i++) {
			random_numbers[i] = rand.nextInt(99 - 0 + 1) + 0;
			if (random_numbers[i] % 2 == 0) {
				even_number += 1;
			} else if (random_numbers[i] % 2 != 0) {
				odd_number += 1;
			}
		}
		
		//Creates space in the array based on how many even/odd numbers counted
		even_numbers = new int[even_number];
		odd_numbers = new int[odd_number];
		
		
		//Assigns the random numbers to the odd or even array
		for (int i = 0; i < 25; i++) {
			if (random_numbers[i] % 2 == 0) {
				even_numbers[even_index] = random_numbers[i];
				even_index += 1; //Index increment
			} else if (random_numbers[i] % 2 != 0) {
				odd_numbers[odd_index] = random_numbers[i];
				odd_index += 1; //Index increment
			}
		}
		
		//Outputs all the random odd numbers, with space in between
		System.out.println("Odd:");
		for (int i = 0; i < odd_number; i++) {
			System.out.print(odd_numbers[i]);
			System.out.print(" ");
		
		}
		
		//Outputs all even numbers, with space in between
		System.out.println(" ");
		System.out.println("Even:");
		for (int i = 0; i < even_number; i++) {
			System.out.print(even_numbers[i]);
			System.out.print(" ");
		
		}
		
	}

}
