package com.syntax.class04;

import java.util.Scanner;

public class ExampleofScanner {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please print any text here");
		String text=scan.nextLine();
		System.out.println(text);
		
		System.out.println("Please enter any number");
		int number=scan.nextInt();
		System.out.println(number);
		
		System.out.println("Please enter any number");
		boolean num=scan.nextBoolean();
		System.out.println(num);
		
		
		
		System.out.println("End of program");
		
		

	}

}
