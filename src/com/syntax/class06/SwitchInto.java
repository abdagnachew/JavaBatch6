package com.syntax.class06;

public class SwitchInto {

	public static void main(String[] args) {
		int day=4;
		String today;
		switch (day) {
		
		case 1: 
			today = "Monday";
			break;
		case 2:
			today = "Tuesday";
			break;
		case 3:
			today = "Wed";
			break;

		case 4:
			today = "Thurs";
			break;

		case 5:
			today = "Fri";
			break;

		case 6:
			today = "Sat";
			break;
		case 7:
			today = "Sun";
			break;
		default:
			today="Invalid";

		}
		System.out.println("Today is " +today);
		
		
	}

}
