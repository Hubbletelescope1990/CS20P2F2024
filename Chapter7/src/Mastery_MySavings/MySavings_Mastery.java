package Mastery_MySavings;

public class MySavings_Mastery {
	private double pennies;
	private double nickels;
	private double dimes;
	private double quarters;
	private double total;
	
	//Creates bank object with no money in it by default
	public MySavings_Mastery() {
		pennies = 0;
		nickels = 0;
		dimes = 0;
		quarters = 0;
		total = 0;
	}
	
	//Creates a bank object with set values for pennies, nickels, dimes, and quarters. Also checks if values are negative
	public MySavings_Mastery(double pen, double nic, double dim, double quart) {
		if (pen < 0 || nic < 0 || dim < 0 || quart < 0) {
			System.out.print("Error: Cannot have negative amount of coins.");
		} else {
			pennies = pen;
			nickels = nic;
			dimes = dim;
			quarters = quart;
			total = (pen * 0.01) + (nic * 0.05) + (dim * 0.1) + (quart * 0.25);
		}
	}
	
	//Returns the total amount of money in the bank
	public String getTotal() {
		String totalString;
		
		totalString = "There is: " + total + " Dollars in the bank.";
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
	public void removePenny() {
		if (total < 0.01) {
			System.out.print("Error: Not enough money in the bank to remove one penney.");
		} else {
			total -= 0.01;
		}
	}
		
	//Removes one nickel from the banks total value after confirming enough money is in the bank to remove
	public void removeNickel() {
		if (total < 0.05) {
			System.out.print("Error: Not enough money in the bank to remove one nickel.");
		} else {
			total -= 0.05;
		}
	}
		
	//Removes one dime from the banks total value after confirming enough money is in the bank to remove
	public void removeDime() {
		if (total < 0.1) {
			System.out.print("Error: Not enough money in the bank to remove one dime.");
		} else {
			total -= 0.1;
		}
	}
		
	//Removes one quarter from the banks total value after confirming enough money is in the bank to remove
	public void removeQuarter() {
		if (total < 0.25) {
			System.out.print("Error: Not enough money in the bank to remove one quarter.");
		} else {
			total -= 0.25;
		}
	}
	

	
}
