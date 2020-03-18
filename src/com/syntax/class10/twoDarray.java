package com.syntax.class10;

public class twoDarray {

	public static void main(String[] args) {
String[][] month = { { "January", "Feburary", "March" }, { "April", "May", "June" }, { "July", "August", "September" }, 
		{ "October", "November", }, };

		int rows = month.length; // how many arrays
		int firstArray = month[2].length;
		System.out.println(firstArray);
System.out.println("--------------------");
		for (int i = 0; i < month.length; i++) {
			for (int j = 0; j < month[i].length; j++) {
System.out.println(month[i][j]);
			}
		}

	}
}
