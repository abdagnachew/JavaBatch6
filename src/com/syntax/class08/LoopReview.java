package com.syntax.class08;

import java.util.Scanner;


public class LoopReview {

	public static void main(String[] args) {
		/*
		 * Ask user to pay for a candy as long as the entered price is not 2 we need to
		 * keep ask for paying one amount is correct ---> enjoy your candy
		 */

//		
//		s=new Scanner(System.in);
//		
//		do {
//			System.out.println("Please pay for a candy");
//			price=s.nextDouble();
//	}while (price!=2);
//		System.out.println("enjoy your candy");

		Scanner s;
		double price;
		s = new Scanner(System.in);

		System.out.println("Please pay for a candy");
		price = s.nextDouble();
		while (price != 2) {
			System.out.println("Please pay for a candy");
			price = s.nextDouble();
		}
		System.out.println("Enjoy your candy");

	}

}
