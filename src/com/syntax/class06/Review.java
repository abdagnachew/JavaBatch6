package com.syntax.class06;

import java.util.Scanner;

public class Review {

	public static void main(String[] args) {
	
		double x, y, z, large;
		Scanner input= new Scanner(System.in);
		System.out.println("Please Enter first  number :");
		x = input.nextDouble();
		System.out.println("Please Enter 2nd  number :");
		y = input.nextDouble();
		System.out.println("Please Enter 2nd  number :");
		z = input.nextDouble();
		if (x > y) {
			if (x > z) {
				large = x;
			} else {
				large = z;
			}
		} else {
			if (y > z) {
				large = y;
			} else {
				large = z;
			}
		}
		if (x != y && y != z && z != x) {
			System.out.println(large + " is the largest of numbers you entered");
		} else {
			System.out.println("You have not entered distinct numbers");
	}

	}
}
