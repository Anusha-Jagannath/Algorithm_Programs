package com.algorithm;

public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to algorithm and data structure programs");
		
		/*BubbleSort bubblesort = new BubbleSort();
		bubblesort.sortUsingBubbleSort();
		
		MergeSort mergesort = new MergeSort();
		mergesort.compute();
		
		Anagram anagram = new Anagram();
		anagram.checkAnagram();
		
		Prime prime = new Prime();
		prime.findPrime();
		
		InsertionSort insertionsort = new InsertionSort();
		insertionsort.sort();
		
		BinarySearch binarysearch = new BinarySearch();
		binarysearch.search();*/
		
		System.out.println("Iterative method");
		StringPermutation.findPermutationIterative("abc");
		
		System.out.println("Recursive method");
		StringPermutation.findPermutationRecursive("abc", 0, 2);
		
		/*int number = Integer.parseInt(args[0]);
		QuestionNumber question = new QuestionNumber();
		question.findNumber(number);
		
		PrimePalindrome primepalindrome = new PrimePalindrome();
		primepalindrome.check();*/
		
	}
}
