package Mastery;

import java.util.Scanner;

import java.text.DecimalFormat;

public class Project_Mastery {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		DecimalFormat value = new DecimalFormat("#.##");
		
		//Variable initialization
		double minutes_spent_planning;
		double minutes_spent_coding;
		double minutes_spent_debugging;
		double minutes_spent_testing;
		double total_time;
		double percent_time_planning;
		double percent_time_coding;
		double percent_time_debugging;
		double percent_time_testing;
		
		//User input
		System.out.print("Please input the amount of time spent planning the project: ");
		minutes_spent_planning = userInput.nextDouble();
		System.out.print("Please input the amount of time spent coding the project: ");
		minutes_spent_coding = userInput.nextDouble();
		System.out.print("Please input the amount of time spent debugging the project: ");
		minutes_spent_debugging = userInput.nextDouble();
		System.out.print("Please input the amount of time spent testing the project: ");
		minutes_spent_testing = userInput.nextDouble();
		
		//Calculations
		total_time = minutes_spent_planning + minutes_spent_coding + minutes_spent_debugging + minutes_spent_testing;
		percent_time_planning = minutes_spent_planning / total_time * 100;
		percent_time_coding = minutes_spent_coding / total_time * 100;
		percent_time_debugging = minutes_spent_debugging / total_time * 100;
		percent_time_testing = minutes_spent_testing / total_time * 100;
		
		//Final output and answer formatting
		System.out.println(" ");
		System.out.println("Total time spent on project: " + total_time + " minutes");
		System.out.println("Percent of time spent planning: " + value.format(percent_time_planning) + "%");
		System.out.println("Percent of time spent coding: " + value.format(percent_time_coding) + "%");
		System.out.println("Percent of time spent debugging: " + value.format(percent_time_debugging) + "%");
		System.out.println("Percent of time spent testing: " + value.format(percent_time_testing) + "%");
	}
}
