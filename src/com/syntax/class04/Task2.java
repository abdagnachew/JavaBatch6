package com.syntax.class04;

public class Task2 {

	public static void main(String[] args) {

		double mortgageRate = 4.4;
		int mortgagePrice = 50000;

		if (mortgageRate > 4.5) {
			System.out.println("Mortgage too high");
		} else {
			System.out.println("I will buy house");

			if (mortgagePrice > 200000) {
				System.out.println("I need Mortgage");
			} else
				System.out.println("I pay cash");

		}

	}

}
