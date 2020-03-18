package com.syntax.class09;

public class Pyramid {

	public static void main(String[] args) {
		for (int r = 1; r <= 4; r++) {

			for (int c = 1; c <= r; c++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-------2nd----");

		for (int i=1; i<=5; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("new");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
