package Skillbuilders;

public class Squares {

	public static void main(String[] args) {
		
		//Array initialization and space making
		int[] squares;
		squares = new int[5];
		
		//Setting element value
		for (int i = 0; i < 5; i++) {
			squares[i] = i * i;
		}
		
		//Output statement
		for (int i = 0; i < 5; i++) {
			System.out.println("The square of index " + i + " is: " + squares[i]);
		}
		
	}

}
