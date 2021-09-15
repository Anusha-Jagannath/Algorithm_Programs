package com.algorithm;

import java.util.Scanner;

public class BubbleSort {

	/*
	 * method to sort integers using bubble sort
	 */
	public void sortUsingBubbleSort() {
		int noOfElements;
		System.out.println("Enter no of elements");
		Scanner scanner = new Scanner(System.in);
		noOfElements = scanner.nextInt();
		int array[] = new int[noOfElements];
		System.out.println("Enter array elements");
		for (int i = 0; i < noOfElements; i++) {
			array[i] = scanner.nextInt();
		}
		for(int i=0;i<noOfElements-1;i++) {
			for(int j=0;j<noOfElements-1-i;j++) {
				if(array[j] > array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		System.out.println("After sorting");
		for(int i=0;i<noOfElements;i++) {
			System.out.print(array[i]+" ");
		}
	}
}
