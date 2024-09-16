package SkillBuilders;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Gradeavg2 {
	
	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		DecimalFormat value = new DecimalFormat("#.##");
		
		double gradeavg = 0;
		System.out.print("Enter grade 1: ");
		double grade1 = userInput.nextDouble();
		gradeavg += grade1;
		System.out.print("Enter grade 2: ");
		double grade2 = userInput.nextDouble();
		gradeavg += grade2;
		System.out.print("Enter grade 3: ");
		double grade3 = userInput.nextDouble();
		gradeavg += grade3;
		System.out.print("Enter grade 4: ");
		double grade4 = userInput.nextDouble();
		gradeavg += grade4;
		System.out.print("Enter grade 5: ");
		double grade5 = userInput.nextDouble();
		gradeavg += grade5;
		
		gradeavg = gradeavg / 5;
		System.out.println("Your grade average is: " + value.format(gradeavg) + "%");
	}
}
	

