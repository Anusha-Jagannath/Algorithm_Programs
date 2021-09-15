package com.algorithm;

public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to algorithm and data structure programs");
		
		BubbleSort bubblesort = new BubbleSort();
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
		binarysearch.search();
		
		StringPermutation permutation = new StringPermutation();
		permutation.findPermutationIterative("abc");
		
		int number = Integer.parseInt(args[0]);
		QuestionNumber question = new QuestionNumber();
		question.findNumber(number);
		
		PrimePalindrome primepalindrome = new PrimePalindrome();
		primepalindrome.check();
		
	}
}
