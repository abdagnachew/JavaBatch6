package com.syntax.class04;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
//capture name from a user and 
		//print in the format
		//my name is ___
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter name");
		
		String name=scan.nextLine();
		System.out.println("My name is " +name);
		
		System.out.println("How old are you?");
		int age=scan.nextInt();
		System.out.println("Your name is " +name+ " your age is " +age);
		
	}

}
