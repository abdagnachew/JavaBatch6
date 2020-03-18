package com.syntax.class12;

import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class Task1 {

	public static void main(String[] args) {

		System.out.println("-----Task1.-----");

		String s = "Stopit";
		char reverse;

		for (int i = s.length() - 1; i > -1; i--) {
			reverse = s.charAt(i);
			System.out.print(reverse);

		}
		System.out.println();

		System.out.println("----------------Task2.-----");

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a string: ");
		String text = scan.nextLine();
		if (!text.isEmpty()) {
			if (text.length() % 2 == 1 && text.length() >= 3) {

				System.out.println(text.charAt(text.length() / 2));
			} else {
				System.out.println("Even number of characters entered");
			}
		}

		System.out.println("----------------Task3.-----");

//		Scanner input=new Scanner(System.in);
//		System.out.println("What is Dads name?");
//		String dadName=input.nextLine();
//		
//		System.out.println("What is Moms name?");
//		String momName=input.nextLine();
//		
//		System.out.println("What is it? Boy or Girl?");
//		String babyName=input.nextLine();
//		
//		int half1=dadName.length() /2;
//		int half2=momName.length() /2;
//		
//		String suggestedInput=null;
//		
//		if (babyName.equalsIgnoreCase("Girl")) {
//			suggestedInput=dadName.substring(0,half1) + momName.substring(0,half2);
//			System.out.println(suggestedInput);
//			
//		}else if (babyName.equalsIgnoreCase("boy")){
//			suggestedInput=momName.substring(0,half2) + dadName.substring(0,half1);
//			System.out.println(suggestedInput);
//			
//		}
//		
//		System.out.println("----------------Task4.-----");

		String name = "abedagnachew123!";
		String newString=name.replaceAll("[A-Za-z]", " ");
		System.out.println(newString);
		
	}
}
