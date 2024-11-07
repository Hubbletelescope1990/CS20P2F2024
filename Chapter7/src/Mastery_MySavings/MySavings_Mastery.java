package Mastery_MySavings;

import java.util.concurrent.TimeUnit;

public class MySavings_Mastery {
	private double total;
	
	//Creates bank object with no money in it by default
	public MySavings_Mastery() {
		total = 0;
	}
	
	//Returns the total amount of money in the bank
	public double getTotal() {
		double totalString;
		
		totalString = total;
		return(totalString);
	}
	
	//Adds one penny to the banks total value
	public void addPenny() {
		total += 0.01;
	}
	
	//Adds one nickel to the banks total value
	public void addNickel() {
		total += 0.05;
	}
	
	//Adds one dime to the banks total value
	public void addDime() {
		total += 0.1;
	}
	
	//Adds one quarter to the banks total value
	public void addQuarter() {
		total += 0.25;
	}
	
	//Removes one penny from the banks total value after confirming enough money is in the bank to remove
	public void removePenny() throws InterruptedException {
		if (total < 0.01) {
			System.out.println("Error: Not enough money in the bank to remove one penney.");
			TimeUnit.SECONDS.sleep(3);
		} else {
			total -= 0.01;
		}
	}
		
	//Removes one nickel from the banks total value after confirming enough money is in the bank to remove
	public void removeNickel() throws InterruptedException {
		if (total < 0.05) {
			System.out.println("Error: Not enough money in the bank to remove one nickel.");
			TimeUnit.SECONDS.sleep(3);
		} else {
			total -= 0.05;
		}
	}
		
	//Removes one dime from the banks total value after confirming enough money is in the bank to remove
	public void removeDime() throws InterruptedException {
		if (total < 0.1) {
			System.out.println("Error: Not enough money in the bank to remove one dime.");
			TimeUnit.SECONDS.sleep(3);
		} else {
			total -= 0.1;
		}
	}
		
	//Removes one quarter from the banks total value after confirming enough money is in the bank to remove
	public void removeQuarter() throws InterruptedException {
		if (total < 0.25) {
			System.out.println("Error: Not enough money in the bank to remove one quarter.");
			TimeUnit.SECONDS.sleep(3);
		} else {
			total -= 0.25;
		}
	}
	

	
}
