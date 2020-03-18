package com.syntax.class04;

public class MoreNested {
	
	public static void main (String[] args) {
		int price=3000000;
		double rate= 4.7;
		
		if (rate>4.5) {
			System.out.println("Mortgage approved");
		}else {
			System.out.println("Mortgage Not Approved");
		}
		if (price>200000) {
			System.out.println("Loan required");
		}else {
			System.out.println("No Loan, Ill pay in cash");
		}
		
	}
}
