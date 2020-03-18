package com.syntax.class12;

import java.util.Scanner;

public class Build {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a String please");
		String text=input.nextLine();
		
		if (!text.isEmpty()) {
			if (text.length() >=3 && text.length() %2 ==1) {
				System.out.println(text.charAt(text.length() /2 ));
			}else {
				System.out.println("Wrong sequence or you have typed an even #");
			}
		}
	

	}
}
