package Mastery;

import java.util.Random;

public class EvensAndOdds_Mastery {

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		int[] random_numbers = new int[25];
		int[] even_numbers;
		int[] odd_numbers;
		int even_number = 0;
		int odd_number = 0;
		int even_index = 0;
		int odd_index = 0;
		
		for (int i = 0; i < 25; i++) {
			random_numbers[i] = rand.nextInt(99 - 0 + 1) + 0;
			if (random_numbers[i] % 2 == 0) {
				even_number += 1;
			} else {
				odd_number += 1;
			}
		}
		
		even_numbers = new int[even_number];
		odd_numbers = new int[odd_number];
		
		for (int i = 0; i < 25; i++) {
			if (random_numbers[i] % 2 == 0) {
				even_numbers[even_index] = i;
				even_index += 1;
			} else {
				odd_numbers[odd_index] = i;
				odd_index += 1;
			}
		}
		
		System.out.println("Odd:");
		for (int i = 0; i < 25; i++) {
			if (random_numbers[i] % 2 == 0) {
				even_numbers[even_index] = i;
				even_index += 1;
			} else {
				odd_numbers[odd_index] = i;
				odd_index += 1;
			}
		}
		
	}

}
