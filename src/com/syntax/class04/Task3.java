package com.syntax.class04;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
		System.out.print("Write required loan: ");
		int num1 =input.nextInt();
		
		if ( num1 > 200000) {
			System.out.print("Loan rejected");
		}else {
			System.out.println("Loan approved");
		}
		
		
		
		
		
		
	}

}
