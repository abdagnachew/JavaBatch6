package com.syntax.class05;

import java.util.Scanner;

public class LogicalTask {

	public static void main(String[] args) {

		int height;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your height using inches");
		height=scan.nextInt();
		
		//short under 60 inch
		//medium between 60-72 inch
		//tall over 72 inch
		
		if (height > 0 && height<= 60) {
			System.out.println("You are short");
		}else if (height >= 60 && height <=72) {
			System.out.println("You are medium height");
		}else if  (height > 72) {
			System.out.println("You are tall height");
		}else { 
			System.out.println("Invalid");
			
	
		}	
		
	}

}
