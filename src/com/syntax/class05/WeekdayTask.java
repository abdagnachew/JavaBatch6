package com.syntax.class05;

import java.util.Scanner;

public class WeekdayTask {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a day");
		int day = scan.nextInt();
		
		if (day>1 || day <5) {
			System.out.println("Weekday");
		}else if (day ==6 || day== 7 ) {
			System.out.println("Weekend");
		}else {
			System.out.println("Invalid day");
		}
	}

}
