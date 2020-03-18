package com.syntax.class07;

import java.util.Scanner;

public class inClass {

	public static void main(String[] args) {
//		we playing lottery and lucky number is 17;
		// we want to keep asking user any number from 1-20 until he gets lucky #
		// until he gets lucky number ---->
		
		Scanner scan;
		int num1=0;
		
		scan=new Scanner(System.in);
		while (num1<17 ) {
		System.out.println("Enter any number between 1 - 20");
		num1=scan.nextInt();
		num1++;
		}
		System.out.println("congratulations!!");
		
		
		
	}

}
