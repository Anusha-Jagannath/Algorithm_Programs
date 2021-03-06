package com.algorithm;

public class PrimePalindrome {

	/**
	 * check if number is prime or not
	 */
	public void check() {
		for (int i = 2; i <= 1000; i++) {
			boolean flag = true;
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					flag = false;
					break;
				}
			}
			if (flag == true) {
				palindrome(i);
			}
		}
	}

	/**
	 * check if passed prime number is palindrome
	 * 
	 * @param i
	 */
	private  void palindrome(int i) {
		int rem, num, reverseNum = 0;
		num = i;
		while (i != 0) {
			rem = i % 10;
			reverseNum = reverseNum * 10 + rem;
			i = i / 10;

		}
		if (num == reverseNum) {
			System.out.print(num + " ");
		}

	}

}
