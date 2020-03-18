package com.syntax.class07;

import java.util.PrimitiveIterator.OfDouble;

public class ForLoopIntro {

	public static void main(String[] args) {
		// Good morning 5 times

		for (int c = 1; c < 6; c++) {
			System.out.println("Good Morning");
		}

//		print number from 1-10

		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}

		// print number 10 to 1
		for (int i = 10; i >= 1; i--) {
			System.out.println(i);
		}
//		what will be the output??
		for (int i = 0; i <= 50; i += 5) {
			System.out.println(i);
		}

		// what is the output.
		int sum = 0;

		for (int i = 1; i < 5; i++) {
			sum = sum + i;
		System.out.println("value of sum " +sum);
		}
	}
}
