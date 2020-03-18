package com.syntax.class11;

public class StringDemo {

	public static void main(String[] args) {

		String school = " Syntax ";

		String str = new String("HELLO");

		String str1 = "This is a string, &^&^";

		// how many Characters stringCharacters has
		System.out.println(school.length());

		int size = str.length();
		System.out.println("String length is: " + size);

		// convert String to lowerCase or upperCase
		System.out.println(school.toUpperCase());
		System.out.println(str.toLowerCase());
		str = str.toLowerCase();

		// concatenate 2 String
		System.out.println("--------CONCAT FUNCTION---------");
		String newString = str + school;
		System.out.println(newString);

		String day = "Saturday";
		String date = "14";

		String newDate = day.concat(date);
		System.out.println(newDate);
		
		char grade='A';
		String str2="Student";
		//below code will give Compiler Error, since concat() method is used to attatch
		// 1 string to anoher string. (Only only with the strings
		//str2.concat(grade); 
		
		System.out.println("------------isEmpty Function-------------");
		
		String st3="";
		boolean empty = st3.isEmpty();
		System.out.println(empty);
		
		System.out.println("------trim() Function---------");
		//removes empty/white spaces at the beginning and the end of the String
		String str4= "      Welcome to Syntax!       ";
		
		str4=str4.trim();
		System.out.println("String with no leading or trailing spaces: " + str4);

	}
}
