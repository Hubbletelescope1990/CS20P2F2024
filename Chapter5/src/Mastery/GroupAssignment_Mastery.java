package Mastery;

import java.util.Scanner;

public class GroupAssignment_Mastery {

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);
		
		//Variable initialization
		String first_name;
		String last_name;
		char initial;
		int index = 0;
		
		//user input
		System.out.print("please input your first name: ");
		first_name = userInput.next();
		System.out.print("please input your last name(Capitalize first letter): ");
		last_name = userInput.next();
		
		//Figuring out last name initial
		initial = last_name.charAt(index);
		
		//If statement logic and output
		if (initial == 'A' || initial == 'B' || initial == 'C' || initial == 'D' || initial == 'E' || initial == 'F' || initial == 'G' || initial == 'H' || initial == 'I') {
			System.out.print(first_name + " " + last_name + " belongs in group 1");
		}
		if (initial == 'J' || initial == 'K' || initial == 'L' || initial == 'M' || initial == 'N' || initial == 'O' || initial == 'P' || initial == 'Q' || initial == 'R' || initial == 'S') {
			System.out.print(first_name + " " + last_name + " belongs in group 2");
		}
		if (initial == 'T' || initial == 'U' || initial == 'V' || initial == 'W' || initial == 'X' || initial == 'Y' || initial == 'Z') {
			System.out.print(first_name + " " + last_name + " belongs in group 3");
		}
		
	}

}
