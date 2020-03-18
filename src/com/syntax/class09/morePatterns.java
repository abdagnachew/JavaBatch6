package com.syntax.class09;

public class morePatterns {

	public static void main(String[] args) {
		System.out.println("Printing pattern for columns");
		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= 5; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println("-------Printing Pattern for rows");
		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= 5; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		System.out.println("=Patterns--");
		for (int x = 1; x <= 5; x++) {
			for (int y = 5; y >= 1; y--) {
				System.out.println(y);
			}
			System.out.println();
		}
		System.out.println("next patern====");
		for(int x=5; x>=1; x--) {
			for(int y=1; y<=5; y++) {
				System.out.print(x + " ");
			}
			System.out.println();
		}
	}

}
