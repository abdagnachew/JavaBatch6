package com.syntax.class04;

public class NestedIfContinues {

	public static void main(String[] args) {

		boolean allergy = true;
		boolean appleAllergy = true;
		boolean orangeAllergy = true;
		boolean kiwiAllergy = true;

		if (allergy) {
			System.out.println("You are allergic");
			if (appleAllergy) {
				System.out.println("Do not have apple");
			}
			if (orangeAllergy) {
				System.out.println("Do not have orange");
			}
			if (kiwiAllergy) {
				System.out.println("Do not have kiwi");
			}
		} else {
			System.out.println("You are healthy");

		}
	}
}
