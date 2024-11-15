package Mastery_LunchOrder;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class LunchOrder_Test {

	static LunchOrder_Mastery food = new LunchOrder_Mastery();
	static LunchOrder_Mastery chow = new LunchOrder_Mastery(3, 6, 2, 8, 2, 7, 6, 6, 2, 8, 3, 5, 6, 3, 3, 4);
	
	public static void main(String[] args) throws InterruptedException {
		
		Scanner userInput = new Scanner(System.in);
		
		int burg_num;
		int sald_num;
		int fry_num;
		int soda_num;
		
		System.out.print("Enter number of hamburgers: ");
		burg_num = userInput.nextInt();
		System.out.println(food.getBurgers(burg_num));
		TimeUnit.SECONDS.sleep(3);
		System.out.println("");
		System.out.print("Enter number of salads: ");
		sald_num = userInput.nextInt();
		System.out.println(food.getBurgers(sald_num));
		TimeUnit.SECONDS.sleep(3);
		System.out.print("Enter number of fries: ");
		fry_num = userInput.nextInt();
		System.out.println(food.getBurgers(fry_num));
		TimeUnit.SECONDS.sleep(3);
		System.out.print("Enter number of sodas: ");
		soda_num = userInput.nextInt();
		System.out.println(food.getBurgers(soda_num));
		TimeUnit.SECONDS.sleep(3);
		
	}

}
