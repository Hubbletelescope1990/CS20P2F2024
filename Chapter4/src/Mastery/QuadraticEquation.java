package Mastery;

import java.util.Scanner;

public class QuadraticEquation {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		//Variable initialization
		int a;
		int b;
		int c;
		double x_1;
		double x_2;
		
		//User input
		System.out.print("Please input the value for a: ");
		a = userInput.nextInt();
		System.out.print("Please input the value for b: ");
		b = userInput.nextInt();
		System.out.print("Please input the value for c: ");
		c = userInput.nextInt();
		
		//Calculations
		x_1 = (-b + Math.sqrt(b*b - 4*a*c)) / (2*a);
		x_2 = (-b - Math.sqrt(b*b - 4*a*c)) / (2*a);
		
		//Final output
		System.out.print("The roots are: " + x_1 + " and: " + x_2);
	}

}
