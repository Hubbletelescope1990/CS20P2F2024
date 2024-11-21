package Mastery;

import java.util.Scanner;

public class Palindrome_Mastery {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		final int LOW = 'A'; //Smallest possible value
		final int HIGH = 'Z'; //Largest possible value
		String phrase;
		char[] phrase_array;
		int[] filtered_array;
		int letter_count = 0;
		int letter_index = 0;
		int runtime = 0;
		int reverse_index = 1;
		int char_checks = 0;
		
		System.out.print("Enter a word or phrase: ");
		phrase = userInput.nextLine();
		
		phrase = phrase.toUpperCase();
		phrase_array = phrase.toCharArray();
		
		for (int i = 0; i < phrase_array.length; i++) { //Counts letter occurrences
			//If statement checks if the character is a letter or not
			if (phrase_array[i] >= LOW && phrase_array[i] <= HIGH) {
				letter_count += 1;
			}
		}
		
		filtered_array = new int[letter_count];
		
		for (int i = 0; i < phrase_array.length; i++) {
			//If statement checks if the character is a letter or not
			if (phrase_array[i] >= LOW && phrase_array[i] <= HIGH) {
				filtered_array[letter_index] = phrase_array[i];
				letter_index += 1;
			}
		}
		runtime = letter_count;
		if (letter_count % 2 != 0) {
			runtime -= 1;
		}
		
		runtime = runtime / 2;
		
		for (int i = 0; i < runtime; i++) {
			if (filtered_array[i] == filtered_array[(letter_count - reverse_index)]) {
				char_checks += 1;
				reverse_index += 1;
			} else {
				break;
			}
		}
		
		if (char_checks == runtime) {
			System.out.print("Word or phrase is a palindrome.");
		} else {
			System.out.print("Word or phrase is not a palindrome.");
		}
		
		
	}

}
