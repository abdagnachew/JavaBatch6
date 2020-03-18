package com.syntax.class04;

import java.util.Scanner;

public class HomeworkPractice {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Is it sunny outside?");
		boolean isSunny = input.nextBoolean();

		System.out.println("What is the temperature outside?");
		int degree = input.nextInt();

		if (isSunny==false) {
			System.out.println("I stay home and practice JAVA");
			if (degree > 85) {
				System.out.println("I am going to the beach");
			} else {
				System.out.println("I am going to the park");
			}
		} else {
			System.out.println("It is a sunny day, I should go somewhere!");
			
		}
	}
}
