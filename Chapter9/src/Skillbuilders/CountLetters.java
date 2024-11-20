package Skillbuilders;

import java.util.Scanner;

public class CountLetters {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		final int LOW = 'A'; //Smallest possible value
		final int HIGH = 'Z'; //Largest possible value
		int[] letterCounts = new int[HIGH - LOW + 1];
		String word;
		char[] wordLetters;
		int offset; //Array index
		
		//Word input
		System.out.print("Enter a word: ");
		word = userInput.nextLine();
		
		word = word.toUpperCase(); //Converts all letters to upper case
		wordLetters = word.toCharArray(); //Converts letter into char array
		
		
		for (int letter = 0; letter < wordLetters.length; letter++) { //Counts letter occurrences
			//If statement checks if the character is a letter or not
			if (wordLetters[letter] >= LOW && wordLetters[letter] <= HIGH) {
				offset = wordLetters[letter] - LOW;
				letterCounts[offset] += 1;
			}
		}
		
		for (int i = LOW; i <= HIGH; i++) { //Shows letter occurrences
			System.out.println((char)i + ": " + letterCounts[i - LOW]);
		}
		
		
	}

}
