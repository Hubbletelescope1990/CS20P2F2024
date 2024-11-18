package Mastery_LunchOrder;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class LunchOrder_Test {
	
	//Object creation
	static LunchOrder_Mastery food = new LunchOrder_Mastery();
	static LunchOrder_Mastery chow = new LunchOrder_Mastery(3, 6, 2, 8, 2, 7, 6, 6, 2, 8, 3, 5, 6, 3, 3, 4);
	
	public static void main(String[] args) throws InterruptedException {
		
		Scanner userInput = new Scanner(System.in);
		
		//Variable initialization
		int burg_num;
		int sald_num;
		int fry_num;
		int soda_num;
		int lever = 1;
		
		//User selects to run code with default values, or custom values
		System.out.println("1: default values");
		System.out.println("2: custom values");
		System.out.print("Enter choice: ");
		lever = userInput.nextInt();
		System.out.println("");
		
		if (lever == 1) {
		//Main code for default values
		System.out.print("Enter number of hamburgers: ");
		burg_num = userInput.nextInt();
		System.out.println(food.getBurgers(burg_num));
		TimeUnit.SECONDS.sleep(3);
		System.out.println("");
		System.out.print("Enter number of salads: ");
		sald_num = userInput.nextInt();
		System.out.println(food.getSalads(sald_num));
		TimeUnit.SECONDS.sleep(3);
		System.out.println("");
		System.out.print("Enter number of fries: ");
		fry_num = userInput.nextInt();
		System.out.println(food.getFries(fry_num));
		TimeUnit.SECONDS.sleep(3);
		System.out.println("");
		System.out.print("Enter number of sodas: ");
		soda_num = userInput.nextInt();
		System.out.println(food.getSodas(soda_num));
		TimeUnit.SECONDS.sleep(3);
		System.out.println("");
		System.out.print(food.getCost());
		}
		
		if (lever == 2) {
		//Main code for custom values
		System.out.print("Enter number of hamburgers: ");
		burg_num = userInput.nextInt();
		System.out.println(chow.getBurgers(burg_num));
		TimeUnit.SECONDS.sleep(3);
		System.out.println("");
		System.out.print("Enter number of salads: ");
		sald_num = userInput.nextInt();
		System.out.println(chow.getSalads(sald_num));
		TimeUnit.SECONDS.sleep(3);
		System.out.println("");
		System.out.print("Enter number of fries: ");
		fry_num = userInput.nextInt();
		System.out.println(chow.getFries(fry_num));
		TimeUnit.SECONDS.sleep(3);
		System.out.println("");
		System.out.print("Enter number of sodas: ");
		soda_num = userInput.nextInt();
		System.out.println(chow.getSodas(soda_num));
		TimeUnit.SECONDS.sleep(3);
		System.out.println("");
		System.out.print(chow.getCost());
		}
	}

}
