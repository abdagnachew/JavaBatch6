package com.syntax.class04;

import java.util.Scanner;

public class SalaryPage {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter years worked");
		double num = input.nextInt();
		System.out.println("Please enter annual salary");
		int salary = input.nextInt();

		if (num >= 5) {
			System.out.println("Eligible for bonus");
			if (salary > 50000) {
				System.out.println("Your bonus is 5000$");
			} else {
				System.out.println("Your bonus is 3000$");
			}
		} else {
			System.out.println("Not eligible for bonus");
		}

	}

}
