package com.syntax.class04;

import java.util.Scanner;

public class ScannerAndVerifications {

	public static void main(String[] args) {
		/*
		 * capture 2 numbers from a user Compare numbers and identify which is larger
		 */

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter first number");
		int num1 = input.nextInt();
		System.out.println("Please enter second number now");
		int num2 = input.nextInt();
		System.out.println(num1);
		System.out.println(num2);

		// now you have two number
		// HOW do you compare

		if (num1 > num2) {
			System.out.println(num1 + " is larger than " + num2);
		} else if (num2 == num1) {
			System.out.print(num1 + " is equal to " + num2);
		} else {
			System.out.println(num2 + " is larger than " + num1);
		}

	}
}
