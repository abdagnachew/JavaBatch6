package com.syntax.class07;

public class hwFour {

	public static void main(String[] args) {
		System.out.println("----------------------4.  1st way ----------------");

		for (int num2 = 20; num2 < 50; num2++) {
			System.out.println(num2 += 1);
		}

		System.out.println("4.-------------------2nd way------");
		int n = 20;

		while (n <= 50) {

			if (n % 2 != 0) {
				System.out.println(n);
			}
			n++;
		}
		System.out.println("-----------------another way----------");
	
	}

}
