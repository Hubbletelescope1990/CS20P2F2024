package Mastery;

import java.util.Scanner;

public class GradeBook_Mastery {
	Scanner userInput = new Scanner(System.in);
	
	private double grades[][];
	private int test;
	private int student;
	
	//Constructor sets student and test numbers
	public GradeBook_Mastery(int students, int tests) {
		int grade;
		student = students;
		test = tests;
		grades = new double[students][tests];
		for (int i = 0; i < students; i ++) {
			for (int a = 0; a < tests; a++) {
				System.out.print("Enter the grade for student " + (i + 1) + " test " + (a + 1) + ": ");
				grade = userInput.nextInt();
				grades[i][a] = grade;
			}
		}
	}
	//Method changes the grade of a test for a specific student
	public void getGrades(int student, int test, int grade) {
		grades[student][test] = grade;
	}
	//Returns the entire array of grades
	public void showGrades() {
		for (int i = 0; i < student; i ++) {
			System.out.print((i+1) + ": ");
			for (int a = 0; a < test; a++) {
				System.out.print(grades[i][a] + "% ");
			}
		System.out.println("");
		}
	}
	//Returns the average grade of one student
	public double studentAvg(int student) {
		double average = 0;
		for (int i = 0; i < test; i++) {
			average += grades[student][i];
		}
		average = average / test;
		return(average);
	}
	//Returns the average grade of all students for one test
	public double testAvg(int test) {
		double average = 0;
		for (int i = 0; i < student; i++) {
			average += grades[i][test];
		}
		average = average / student;
		return(average);
	}
	

}
