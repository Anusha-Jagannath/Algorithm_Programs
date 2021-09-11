package com.algorithm;

import java.util.Scanner;

public class InsertionSort {

	/*
	 * method to sort integers using insertion sort
	 */
	public void sort() {
		String[] sentence = { "cat", "dog", "apple", "orange" };
		for (int i = 1; i < sentence.length; i++) {
			String temp = sentence[i];
			int j = i - 1;
			while (j >= 0 && sentence[j].compareTo(temp) > 0) {
				sentence[j + 1] = sentence[j];
				j = j - 1;
			}
			sentence[j + 1] = temp;
		}
		System.out.println("After sorting");
		for (int i = 0; i < sentence.length; i++)
			System.out.print(sentence[i]+" ");
	}
}
