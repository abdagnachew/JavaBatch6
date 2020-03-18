package com.syntax.class05;

import java.util.Scanner;

public class ScannerAndLogicalOperators {

	public static void main(String[] args) {

		/*
		 * take age input from user and then based on Age, print output if age is from
		 * 0-3 --> You are a baby if age is from 4-5 --. you are a kid if age from 6-12
		 * ---> you are a child if age is from 13-19 --> you are teenage if age is from
		 * 20 - 64 --> you are an adult if age is more or equal to 65 ---> you are a
		 * senior lets declare all variables to import shortcut we use ctrl+shift=o
		 */

		// 1. declare values
		int age;
		Scanner scan;

		// 2. capture values
		scan = new Scanner(System.in);
		System.out.println("Please enter your age");
		age = scan.nextInt();

		// 3. perform verification
		if (age > 0) {
			if (age > 0 && age < 3) {
				System.out.println("You are a baby");
			} else if (age >= 3 && age <= 5) {
				System.out.println("You are a kid");
			} else if (age >= 6 && age <= 12) {
				System.out.println("You are a child");
			} else if (age > 12 && age < 19) {
				System.out.println("You are a teen");
			} else if (age > 20 && age < 65) {
				System.out.println("You are a senior");
			} else {
				System.out.println("You are a enjoying your life");
			}
		} else {
			System.out.println("Please enter valid age");
		}

	}

}
