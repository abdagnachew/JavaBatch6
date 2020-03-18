package com.syntax.class04;

import java.util.Scanner;

public class TaskHw {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Do you have a credit card?");
		boolean askCard=input.nextBoolean();
		
		if (askCard == (true)) {
			System.out.println("What is the balance on card?");
			
			int balance=input.nextInt();
			if (balance > 1000) {
				System.out.println("Please pay balance immedietly");
			} else {
				System.out.println("You can go head and spend more $");
			}
		} else {
			System.out.println(" I will offer you a credit card");
		}
	}

}
