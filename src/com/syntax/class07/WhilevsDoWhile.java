package com.syntax.class07;

import java.security.Timestamp;

public class WhilevsDoWhile {

	public static void main(String[] args) {

		// Hello 5 Times
		int num = 11;

		while (num <= 12) {
			System.out.println("Hello");
			num++;
		}

		System.out.println("--USING DO WHILE LOOP------");

//		i want to say hello 5 times again
		int num1 = 11;
		
		do {
			System.out.println("Hello");
			num1++;
		} while (num1 <= 12);
		
		System.out.println("------------------Check -----------");
	
		
	for (int a = 20; a >= 1; a--) {
		System.out.println(a--);
	}
	}

}
