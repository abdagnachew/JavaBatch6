package com.syntax.class06;

import java.util.Scanner;

public class SwitchWithStrings {

	public static void main(String[] args) {
/*
 * Ask user where he or she is from
 * then based on the country we will define their favor food
 * At the end of the program 
 * Your favorite food is __
 */
		
		Scanner scan;
		String country;
		String favoriteFood;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter your country ");
		country =scan.nextLine();
		
		switch(country) { 
		
		case "Marocco":
			favoriteFood="couscous";
			break;
		case"Belarus":
			favoriteFood="Potato";
			break;
		case "Tajikistan":
			favoriteFood ="Osh";
			break;
		case "Turkey":
			favoriteFood="Baklava";
			break;
		case "Afghanistan":
			favoriteFood="Mantu";
			break;
		case "Kazakhstan":
			favoriteFood="Beshparkmak";
			break;
		default:
			favoriteFood="Unknown";
			break;
			
			
		}
		
		System.out.println("Here is output " + favoriteFood);
	}

}
