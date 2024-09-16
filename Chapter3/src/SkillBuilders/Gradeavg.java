package SkillBuilders;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Gradeavg {
	
	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		DecimalFormat value = new DecimalFormat("#.##");
		
		double gradeavg;
		System.out.print("Enter grade 1: ");
		double grade1 = userInput.nextDouble();
		System.out.print("Enter grade 2: ");
		double grade2 = userInput.nextDouble();
		System.out.print("Enter grade 3: ");
		double grade3 = userInput.nextDouble();
		System.out.print("Enter grade 4: ");
		double grade4 = userInput.nextDouble();
		System.out.print("Enter grade 5: ");
		double grade5 = userInput.nextDouble();
		
		gradeavg = (grade1 + grade2 + grade3 + grade4 + grade5) / 5;value.format(gradeavg);
		System.out.println("Your grade average is: " + value.format(gradeavg));
		
	}
}
