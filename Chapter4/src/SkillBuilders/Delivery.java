package SkillBuilders;

import java.util.Scanner;

public class Delivery {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		//Variable initialization
		int package_width;
		int package_length;
		int package_height;
		
		//User input
		System.out.print("Please enter the width of the package: ");
		package_width = userInput.nextInt();
		System.out.print("Please enter the length of the package: ");
		package_length = userInput.nextInt();
		System.out.print("Please enter the height of the package: ");
		package_height = userInput.nextInt();
		
		//Logic
		if (package_width <= 10) {
			if (package_length <= 10) {
				if (package_height <= 10) {
				System.out.print("Package accepted.");
				} else {
					System.out.print("Package rejected, only packages with paramaters equal to or under 10 are accepted.");
				}
			} else {
				System.out.print("Package rejected, only packages with paramaters equal to or under 10 are accepted.");
			}
		
		} else {
			System.out.print("Package rejected, only packages with paramaters equal to or under 10 are accepted.");
		}
		
		}

}
