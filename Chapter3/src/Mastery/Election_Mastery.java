package Mastery;

import java.text.DecimalFormat;
import java.util.Scanner;


public class Election_Mastery {
	
	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		DecimalFormat value = new DecimalFormat("#.##");
		
		//variable initialization
		double election_results_NY_Awbrey;
		double election_results_NY_Martinez;
		double election_results_NJ_Awbrey;
		double election_results_NJ_Martinez;
		double election_results_C_Awbrey;
		double election_results_C_Martinez;
		double total_votes;
		double total_votes_Awbrey;
		double total_votes_Martinez;
		double Percent_of_votes_Awbrey;
		double percent_of_votes_Martinez;
		
		//input
		System.out.print("Enter votes for candidate Awbrey in New york: ");
		election_results_NY_Awbrey = userInput.nextDouble();
		System.out.print("Enter votes for candidate Martinez in New york: ");
		election_results_NY_Martinez = userInput.nextDouble();
		System.out.println(" ");
		System.out.print("Enter votes for candidate Awbrey in New Jersey: ");
		election_results_NJ_Awbrey = userInput.nextDouble();
		System.out.print("Enter votes for candidate Martinez in New Jersey: ");
		election_results_NJ_Martinez = userInput.nextDouble();
		System.out.println(" ");
		System.out.print("Enter votes for candidate Awbrey in Connecticut: ");
		election_results_C_Awbrey = userInput.nextDouble();
		System.out.print("Enter votes for candidate Martinez in Connecticut: ");
		election_results_C_Martinez = userInput.nextDouble();
		
		//Calculations
		total_votes = election_results_NY_Awbrey + election_results_NY_Martinez + election_results_NJ_Awbrey + election_results_NJ_Martinez + election_results_C_Awbrey + election_results_C_Martinez;
		total_votes_Awbrey = election_results_NY_Awbrey + election_results_NJ_Awbrey + election_results_C_Awbrey;
		total_votes_Martinez = election_results_NY_Martinez + election_results_NJ_Martinez + election_results_C_Martinez;
		Percent_of_votes_Awbrey = total_votes_Awbrey / total_votes * 100;
		percent_of_votes_Martinez = total_votes_Martinez / total_votes * 100;
		
		//Final output and variable integer recasting
		System.out.println(" ");
		System.out.println("Total votes: " + (int)total_votes);
		System.out.println("Total votes for Awbrey: " + (int)total_votes_Awbrey + ", Percent of vote for Awbrey: " + value.format(Percent_of_votes_Awbrey) + "%");
		System.out.println("Total votes for Martinez: " + (int)total_votes_Martinez + ", Percent of vote for Martinez: " + value.format(percent_of_votes_Martinez) + "%");
	}

}