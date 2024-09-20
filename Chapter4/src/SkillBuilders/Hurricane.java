package SkillBuilders;

import java.util.Scanner;

public class Hurricane {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		//Variable initialization
		int hurricanecat;
		
		//User input
		System.out.print("Please enter the hurricane category: ");
		hurricanecat = userInput.nextInt();
		
		//If statements
		if (hurricanecat == 1) {
			System.out.print("Category 1 hurricanes have wind speeds of: 74-95 mph, or 64-82 kt, or 119-153 km/h.");
		}
		if (hurricanecat == 2) {
			System.out.print("Category 2 hurricanes have wind speeds of: 96-110 mph, or 83-95 kt, or 154-177 km/h.");
		}
		if (hurricanecat == 3) {
			System.out.print("Category 3 hurricanes have wind speeds of: 111-130 mph, or 96-113 kt, or 178-209 km/h.");
		}
		if (hurricanecat == 4) {
			System.out.print("Category 4 hurricanes have wind speeds of: 131-155 mph, or 114-135 kt, or 210-249 km/h.");
		}
		if (hurricanecat == 5) {
			System.out.print("Category 5 hurricanes have wind speeds of: over 155 mph, or 135 kt, or 249 km/h.");
		}
		
	}
}
