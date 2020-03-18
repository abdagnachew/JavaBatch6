package com.syntax.class08;

public class BreakAndContinue {

	public static void main(String[] args) {

		// once i = 4 ---. stop the loop

		for (int i = 1; i <= 10; i++) {

			if (i == 5) {
				System.out.println("Stopping the loop");
				break;
			}
			System.out.println("I am inside of the loop");

			System.out.println(i);
		}
		System.out.println("----------------Continue-------------");

		for (int y = 1; y <= 10; y++) {
			if (y == 2) {
				System.out.println("i am skipping iteration");
				continue;
			}

			System.out.println("I am inside the loop");
			System.out.println(y);
		}
		// write a program that print numbers from 1 to 20
		// i do not want to print 5,6,7
		System.out.println("----------------Continue Example -------------");
		for (int i = 1; i < 21; i++) {
			if (i == 5 || i == 6 || i == 7) {
				continue;
			}
			System.out.println(i);
		}
		System.out.println("----------------Continue Example -------------");
		//write program that prints numbers from 1 to 100
		//i do not want to print 35-55
		
		for (int i=1; i<=100; i++) {
			if (i>=35 && i<=55) {
				continue;
			}
			System.out.println(i);
			}
		}
		
	}


