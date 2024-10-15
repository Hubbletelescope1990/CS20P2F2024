package SkillBuilders;

import java.util.Scanner;

public class SpanishNumbers {
	
	//Method for Spanish number word
	public static void spanishNumberWord(int number) {
		switch(number) {
		case 1:
			System.out.println("Uno");
			break;
		case 2:
			System.out.println("Dos");
			break;
		case 3:
			System.out.println("Tres");
			break;
		case 4:
			System.out.println("Cuatro");
			break;
		case 5:
			System.out.println("Cinco");
			break;
		case 6:
			System.out.println("Seis");
			break;
		case 7:
			System.out.println("Siete");
			break;
		case 8:
			System.out.println("Ocho");
			break;
		case 9:
			System.out.println("Nueve");
			break;
		case 10:
			System.out.println("Diez");
			break;
		}
	}
	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		//Variable
		int num;
		for (int i = 1; i <= 10; i++) {
			//User input
			System.out.print("Enter a number between 1 and 10: ");
			num = userInput.nextInt();
			spanishNumberWord(num);
		}
		
		
		

	}

}
