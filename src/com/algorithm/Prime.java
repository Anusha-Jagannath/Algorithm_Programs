package com.algorithm;

import java.util.Scanner;

public class Prime {
	
	public void findPrime() {
		int sr,er,flag,i,j,count=0;
		System.out.println("Enter starting and ending range");
		Scanner sc = new Scanner(System.in);
		sr = sc.nextInt();
		er = sc.nextInt();
		for(i=sr;i<=er;i++) {
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
