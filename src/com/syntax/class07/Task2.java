package com.syntax.class07;

public class Task2 {

	public static void main(String[] args) {

		boolean workDay = true;
		int day = 1;

		while (workDay) {
			if (day <=5) {
				System.out.println("Need a day off");
				day++;
			} else {
				System.out.println("I do not need a day off any more");
				workDay = false;
			}
		}
	}
}
