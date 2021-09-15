package com.algorithm;

import java.util.Scanner;

public class StringPermutation {

	/*
	 * method to print permutation of strings using iterative method
	 */
	public void findPermutationIterative(String string) {
		int length = string.length();
		int f = factorial(length);
		for (int i = 0; i < f; i++) {
			StringBuilder sb = new StringBuilder(string);
			int temp = i;
			for (int div = length; div >= 1; div--) {
				int quotient = temp / div;
				int remainder = temp % div;
				System.out.print(sb.charAt(remainder));
				sb.deleteCharAt(remainder);
				temp = quotient;
			}
			System.out.println();
		}
	}

	public int factorial(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		return fact;
	}
}
