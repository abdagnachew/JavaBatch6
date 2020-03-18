package com.syntax.class09;

public class Patterns {

	public static void main(String[] args) {

		for (int a = 1; a <= 5; a++) {
			System.out.println("*");
		}
		System.out.println("-------------------------");

		System.out.println();
		for (int a = 1; a <= 5; a++) {
			System.out.println("*");
		}
		System.out.println();

		for (int a = 1; a <= 5; a++) {
			System.out.println("*");
		}
		System.out.println();

		for (int a = 1; a <= 5; a++) {
			System.out.println("*");
		}
		System.out.println();

		for (int a = 1; a <= 5; a++) {
			System.out.println("*");
		}
		System.out.println();

		for (int a = 1; a <= 5; a++) {
			System.out.println("*");
		}
		System.out.println("----Printing PATTERN USING NESTED LOOP------------");

		for (int i = 1; i <= 4; i++) {

			for (int j = 1; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("PATTERN 1");
		for (int i = 0; i <10; i++) {

			for (int j = 1; j <= 10; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
		System.out.println("---Pattern 2");
		for (int i = 1; i <=5; i++) {

			for (int j = 1; j <= 10; j++) {
				System.out.print("*");
			}
			System.out.println();
	}
}
}
