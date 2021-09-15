package com.algorithm;

import java.util.Scanner;

public class Prime {
	/*
	 * method to find prime no within the range
	 */
	public void findPrime() {
		int start,end,flag,i,j,count=0;
		System.out.println("Enter starting and ending range");
		Scanner sc = new Scanner(System.in);
		start = sc.nextInt();
		end = sc.nextInt();
		for(i=start;i<=end;i++) {
			flag = 0;
			for(j=2;j<=(i/2);j++) {
				if(i%j==0) {
					flag=1;
					break;
				}
			}
			if(flag == 0) {
				count++;
				System.out.print(i+" ");
			}
		}
		if(count == 0)
			System.out.println("no prime numbers");
		else
			System.out.println("\nThe total prime numbers are "+count);
	}
}
