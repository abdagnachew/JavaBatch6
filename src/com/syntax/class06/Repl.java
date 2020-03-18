package com.syntax.class06;

import java.util.Scanner;

public class Repl {

	public static void main(String[] args) {
		Scanner scan;
		boolean loan;
		int score = 0;

		scan = new Scanner(System.in);
		System.out.println("Do you need a loan? ");
		loan = scan.nextBoolean();

		if (loan==true) {
		System.out.println("What is your credit score?");
		score = scan.nextInt();
	}else if(score <600){
		System.out.println("Not Eligible");
	}else if(score>=600 && score>=700){
		System.out.println("Maybe eligible");
	}else if(score>=701 && score<=800){
		System.out.println("Eligible");
	}else if(score>800) {
		System.out.println("Deinitely eligible");
	}else {
		System.out.println("Unkown");
	}

		System.out.println("Your eligibility is Unknown");

}
}



