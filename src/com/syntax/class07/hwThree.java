package com.syntax.class07;

public class hwThree {

	public static void main(String[] args) {

		System.out.println("------------check please----------");
		for (int a = 20; a >= 1; a--) {
			System.out.println(a--);
		}

		System.out.println("--------Second way ----------------------------");
		int x = 20;

		while (x > 1) {
			System.out.println(x);
			x -= 2;

		}
		System.out.println("------ third way ------");

		for (int b = 10; b > 0; b--) {
			System.out.println(2 * b);
		}

		System.out.println("-----------------another way----------");
		int y = 20;
		while (y >= 0) {
			System.out.println(y);
			y -= 2;
		}

	}
}
