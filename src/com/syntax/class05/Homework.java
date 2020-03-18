package com.syntax.class05;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter quiz score? " );
		int quiz=input.nextInt();
		System.out.println("Enter mid score? " );
		int mid=input.nextInt();
		System.out.println("Enter last score? " );
		int last=input.nextInt();
		int average=quiz+mid+last/3;
		String score=input.nextLine();
		
		if (average >=90) {
			score="A";
			
		}else if (average >= 70 && average <=90) {
		
			score="B";
			
		} else if (average >=50 && average<70) {
		
			score="C";
			
		}else {
			score="F";
}
			System.out.println("Your final grade is: " +score);
			}

}
