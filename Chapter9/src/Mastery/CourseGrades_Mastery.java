package Mastery;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class CourseGrades_Mastery {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		Scanner userInput = new Scanner(System.in);
		
		int selection;
		int student_number = 1;
		int test_number = 1;
		int grade = 0;
		int student_selection;
		int test_selection;
		int quit = 0;
		double average[][];
		
		System.out.print("Enter number of students");
		student_number = userInput.nextInt();
		System.out.print("Enter number of tests");
		test_number = userInput.nextInt();
		
		GradeBook_Mastery grades = new GradeBook_Mastery();
		
		/*
		for (int i = 0; i < 60; i ++) {
			System.out.print("Enter the grade for student " + student_number + " test " + test_number + ": ");
			grade = userInput.nextInt();
			scores.getGrades(student_number - 1, test_number - 1, grade);
			test_number += 1;
			if (test_number == 6) {
				student_number += 1;
				test_number = 1;
			}
		}
		*/
		while (quit == 0) {
			System.out.println("1: View all grades for all students");
			System.out.println("2: View average grade for a student");
			System.out.println("3: View average grade for a test");
			System.out.println("4: Close application");
			System.out.println("");
			System.out.print("Enter selection: ");
			selection = userInput.nextInt();
			
			if (selection == 1) {
				System.out.print();
				TimeUnit.SECONDS.sleep(2);
			}
			
			if (selection == 2) {
				System.out.print("Enter student number: ");
				student_selection = userInput.nextInt();
				System.out.print("Student " + student_selection + " average grade is: " + grades.studentAvg(student_selection - 1) + "%.");
				TimeUnit.SECONDS.sleep(2);
			}
			
			if (selection == 3) {
				System.out.print("Enter test number: ");
				test_selection = userInput.nextInt();
				System.out.print("The average grade for test " + test_selection + " is: " + grades.testAvg(test_selection - 1) + "%.");
				TimeUnit.SECONDS.sleep(2);
			}
			
			if (selection == 4) {
				quit = 1;
			}
			
			if (selection > 5 || selection < 1){
				System.out.print("Invalid input, please try again");
				TimeUnit.SECONDS.sleep(2);
			}
			System.out.println("");
		}
		
	}


}
