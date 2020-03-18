package com.syntax.class04;

public class Nested2 {

	public static void main(String[] args) {

		boolean isSick = true;
		int fever = 95;
		
		if (isSick) {
			System.out.println("Feel Better");
			if (fever >= 105) {
				System.out.println("High Fever");
			}else { 
				System.out.println("Good to go");
			}
		}
	}

}
