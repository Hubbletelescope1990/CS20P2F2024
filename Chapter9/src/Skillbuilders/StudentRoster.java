package Skillbuilders;

import java.util.Scanner;

public class StudentRoster {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		//Variable initialization
		int student_number;
		String[] student_names = {};
		
		//Input for number of students and sizing of array
		System.out.print("Enter number of students in the class: ");
		student_number = userInput.nextInt();
		student_names = new String[student_number];
		System.out.println("");
		
		//Input of student names
		for (int i = 0; i < student_number; i++) {
			System.out.print("Enter a students name: ");
			student_names[i] = userInput.next();
		}
		System.out.println("");
		
		//Output statement
		System.out.println("Student Roster");
		for (int i = 0; i < student_number; i++) {
			System.out.println("The name of student " + (i + 1) + " is: " + student_names[i]);
		}
		

	}

}
