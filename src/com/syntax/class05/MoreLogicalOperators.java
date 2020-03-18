package com.syntax.class05;

public class MoreLogicalOperators {

	public static void main(String[] args) {
/*we have total 7 days in a week
 * if day is 2,3 --> sdlc class
 * if day 6, 7 ---> JAva Class
 * if day 1, 5 ---> off dayus
 * if day 4 ---> review class
 * to compare two strings you can use logicaal operators
 */
		int day = 1;
		
		if (day ==2 || day==3) {
			System.out.println("We will have SDLC class today");
		}else if (day == 6 || day ==7) {
			System.out.println("We will have Java Class today");
		}else if (day ==1|| day==5) {
			System.out.println("Today is no Class / off day");
		}else if (day==4) {
			System.out.println("Today is a review class with Elion");
		}else {
			System.out.println("Invalid date");
		}
		System.out.println("------using strings------");
		
		String day1 = "Monday";
		
		if (day1.equals("Tuesday") || day1.equals("Wednesday")) {
			System.out.println("We will have SDLC class today");
		}else if (day1.equals("Saturday") || day1.equals("Sunday")) {
		System.out.println("We will have Java Class today");
		}else if (day1.equals("Monday") || day1.equals("Friday")) {
			System.out.println("Today is no Class / off day");
		}else if (day1.equals("Thursday")) {
			System.out.println("Today is a review class with Elion");
		}else { 
			System.out.println("Invalid date");
		}
		
		
		
		
		
	}

}

