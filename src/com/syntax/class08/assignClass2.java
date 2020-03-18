package com.syntax.class08;

import java.util.Scanner;

public class assignClass2 {

	public static void main(String[] args) {

		/*
		 * Create aprogram that will be asking user to apply for credit card 10 times As
		 * soon as user says "Yes" (Stop Asking)
		 */

		Scanner scan;
		String answer;

		scan = new Scanner(System.in);

		for (int i = 1; i <= 10; i++) {
			System.out.println("Apply for credit card here");
			answer = scan.nextLine();
			if (answer.equals("yes")) {
				System.out.println("stop asking");
				break;
			}

		}
int num1=15;
	    
	    while(num1>=0) {
	      System.out.println(num1);
	      num1--;
	    }
	}

}
