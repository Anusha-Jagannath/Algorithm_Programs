package com.algorithm;

import java.io.IOException;
import java.util.Scanner;

/*
 * RegexMain class takes input from the user
 */
public class RegexMain {

	public static void main(String[] args) throws IOException{

		UserDetails user = new UserDetails();
		ReplaceRegex replace = new ReplaceRegex();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter first name");
		String firstName = scanner.nextLine();
		user.setFirstName(firstName);

		System.out.println("Enter last name");
		String lastName = scanner.nextLine();
		user.setLastName(lastName);

		System.out.println("Enter mobile number");
		String mobile = scanner.nextLine();
		user.setMobileNo(mobile);

		System.out.println("Enter the date");
		String date = scanner.nextLine();
		user.setDate(date);
		replace.replaceContents();

	}
}
