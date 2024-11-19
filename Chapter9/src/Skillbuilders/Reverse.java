package Skillbuilders;

import java.util.concurrent.TimeUnit;

public class Reverse {

	public static void main(String[] args) throws InterruptedException {

		//Array initialization and space making
		int[] countdown;
		countdown = new int[10];
		
		//Setting element value
		for (int i = 0; i < 10; i++) {
			countdown[i] = i;
		}
		
		//Output statement
		System.out.println("Countdown");
		TimeUnit.SECONDS.sleep(1);
		for (int i = 9; i >= 0; i--) {
			System.out.println(countdown[i]);
			TimeUnit.SECONDS.sleep(1);
		}

	}

}
