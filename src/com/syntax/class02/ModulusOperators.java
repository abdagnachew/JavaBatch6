package com.syntax.class02;

public class ModulusOperators {

	public static void main(String[] args) {
		float f = 12.50f;
		float f1 = 2.7f;

		double d = 12.50;
		double d1 = 2.7;

		// float can hold up to 6-7 decimals
		// double can hold up to 12
		float result = f / f1; // result will 4.6296296
		double result3 = d / d1;

		System.out.println(result);
		System.out.println(result3);

		int i = 12;
		int y = 7;
		int remainder = i % y;

		int result1 = i / y; // 1 .0987
		double result2 = i / y;
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(remainder);

		// modulus

		int v = 16;
		int w = 7;

		int mod = v % w;

		System.out.println(mod);
		// divide 12/7
		// int num1=12.5;
		// not possible to store decimals into intergers.

		double num2 = 12; // we can store int into double.
		double num3 = 7;

		System.out.println(num2 / num3);

	}

}
