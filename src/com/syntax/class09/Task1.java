package com.syntax.class09;

public class Task1 {

	public static void main(String[] args) {
		char[] Grade = { 'A', 'B', 'C', 'D', 'E', 'F', };

		System.out.println("Grade: " + Grade[1]);

		System.out.println("--------Next way--------");

		char[] storeGrade = new char[6];
		storeGrade[0] = 'A';
		storeGrade[1] = 'B';
		storeGrade[2] = 'C';
		storeGrade[3] = 'D';
		storeGrade[4] = 'E';
		storeGrade[5] = 'F';
		System.out.println("Grade Requested: " + storeGrade[1]);
		
		

		System.out.println("----------------try---------");
		char[] grades1 = { 'A', 'B', 'C', 'D', 'E', 'F' };

		for (int i = 0; i < grades1.length; i++) {
			System.out.print(grades1[i] +" ");
		}
		System.out.println();
	
		System.out.println("===printing using advanced loop=====");

		for (char grades2 : grades1) {
			System.out.print(grades2 + " ");
		}
		System.out.println();
		
		
		System.out.println("---------------------");
		// create an array of fruits and retrieve all elements

		String[] fruits = { "Banana", "Kiwi", "Apple", "Mango" };
		// if fruit is apple---> that is your favorite food
		// advanced for loop, enhanced for loop, for each loop

		for (String fruit : fruits) {
			if (fruit.equals("Apple")) {
				System.out.println(fruit + " - This is your favorite fruit!");
			} else {
				System.out.println(fruit);
			}
		}
		System.out.println("---------2.------------");
		// regular loop
		// fruits.length=number of element
		for (int i = 0; i < fruits.length; i++) {
			System.out.println(fruits[i]);
		}

	}

}
