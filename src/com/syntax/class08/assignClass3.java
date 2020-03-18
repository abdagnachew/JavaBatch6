package com.syntax.class08;

import java.util.Scanner;

public class assignClass3 {

	public static void main(String[] args) {

		int totalEven = 0;
		int totalOdd = 0;

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter  numbers here");
		int min = scan.nextInt();
		int max = scan.nextInt();

		for (int i = min; i < max; i++) {
			if (i % 2 == 0) {
				totalEven = totalEven + i;
			} else {
				totalOdd = totalOdd + i;
			}

		}
		System.out.println("The total of even numbers between " +min+ "and " +max+ " is: " + totalEven);
		System.out.println("The total of odd numbers between " +min +"and " +max+ " is " +totalOdd);

	}

}
