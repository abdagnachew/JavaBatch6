package com.syntax.class10;

public class Task1 {

	public static void main(String[] args) {
	System.out.println("-----------1st Task.-----------");

		String[] animals = { "Dog", "Cat", "Monkey", "Lion", "Tiger", "Mouse" };
		int arraySize = animals.length;
		for (int i = 0; i < arraySize; i++) {
			System.out.println(animals[i]);
		}
		System.out.println("-------another Loop--------");
		for (String animal : animals) {
			System.out.println(animal);
		}
		System.out.println("-------2nd Task--------");

		int[] studyHours = { 2, 4, 6, 10, 13, 15 };
		int sum = (studyHours[0] + studyHours[1] + studyHours[3] + studyHours[4] + studyHours[5]);
		System.out.println("Your calculated sum is: " + sum);

		System.out.println("-----------");
		int[] hours = { 3, 5, 10, 11, 12 };
		int total = 0;
		for (int i : hours) {
			total = total + i;
			System.out.println("The sum is: " + i);
		}

		System.out.println("-------3rd Task-----------");

		String[] countries = { "US", "England", "Ethiopia" };
		for (String country : countries) {
			if (country.equals("US")) {
				System.out.println(country + " Capital is: Washington DC");
			} else if (country.equals("England")) {
				System.out.println(country + " Capital is: London");
			} else if (country.equals("Ethiopia")) {
				System.out.println(country + " Capital is: Addis Ababa");
			} else {
				System.out.println();
			}

		}
		System.out.println("---------another way -----------------");

		for (int y = 0; y < countries.length; y++) {

			switch (countries[y]) {
			case "US":
				System.out.println("Washington DC");
				break;
			case "England":
				System.out.println("london");
				break;
			case "Ethiopia":
				System.out.println("Addis Ababda");
				break;
			}
		}
	}

}
