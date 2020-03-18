package com.syntax.class12;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("Please type Dad name");
		String name1=scan.nextLine();
		
		System.out.println("Please type Mom name");
		String name2=scan.nextLine();
		
		System.out.println("Boy or girl?");
		String babyName=scan.nextLine();
		
		String suggestedBName =null;
		
		int half1= name1.length() /2;
		int half2= name1.length() /2;

		if (babyName.equalsIgnoreCase("Girl")) {
			suggestedBName=name1.substring(0, half1)+ name2.substring(half2);
			System.out.println(suggestedBName);
		}else if (babyName.equalsIgnoreCase("Boy")) {
			suggestedBName = name2.substring(0,half2)+ name1.substring(half1);
			System.out.println(suggestedBName);
			
			
		}
		
		
		
		
		
		
		
	}

}
