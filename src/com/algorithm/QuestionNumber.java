package com.algorithm;

import java.util.Scanner;

public class QuestionNumber {

	/*
	 * method to find your number using binary search
	 * @param number
	 */
	public void findNumber(int number) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Think a number between range(0 , N-1)");
		System.out.println("Answer in yes, low, high");
		int low = 0;
		int high = number - 1;
		while (low <= high) {
			int middle = (low + high) / 2;
			System.out.println("Is your number " + middle + " ?");
			String input = scanner.nextLine();
			input = input.toLowerCase();
			if (input.equals("yes")) {
				System.out.println("Your number is " + middle);
				System.exit(0);
			} else if (input.equals("low")) {
				high = middle - 1;
			}

			else if(input.equals("high")) {
				low = middle + 1;
			}
		}
		System.out.println("Number not found");
	}

}
