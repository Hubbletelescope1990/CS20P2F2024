package Mastery_DigitExtractor;

public class DigitExtractor_Mastery {
	private int whole_number;
	private int ones_place;
	private int tens_place;
	private int hundreds_place;
	
	//Constructor creates number object with no values
	public DigitExtractor_Mastery() {
		whole_number = 0;
		ones_place = 0;
		tens_place = 0;
		hundreds_place = 0;
	}
	
	//Adds a three digit double into the system
	public void setInteger(int num) {
		whole_number = num;
		hundreds_place = (int)Math.floor(num/100);
		tens_place = (int)Math.floor((num%100)/10);
		ones_place = (num%100)%10;
	}
	
	//Returns the whole number
	public int getWholeNumber() {
		return(whole_number);
	}
	//Returns the ones place
	public int getOnesPlace() {
		return(ones_place);
	}
	//Returns the tens place
	public int getTensPlace() {
		return(tens_place);
	}
	//Returns the hundreds place
	public int getHundredsPlace() {
		return(hundreds_place);
	}

}
