package com.syntax.class07;

import java.util.Scanner;

public class ScannerAndLoops {

	public static void main(String[] args) {

// we want to ask users name and print good afternoon ---;

		Scanner input;
		String name = null;
		int num = 1;

		input = new Scanner(System.in);
		while (num <= 3) {

			System.out.println("What is your name");
			name = input.nextLine();
			System.out.println("Good afternoon " + name);

			num++;

		}

	}

}
