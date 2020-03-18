package com.syntax.class05;

import java.util.Scanner;

public class ScanAndLogic {

	public static void main(String[] args) {

		/*
		 * salesman. ASK user for how much his sales are based on the amount of sales we
		 * need to calculate commission if sales is between 1-100--> commission be
		 * should be 10% if sales is between 100 and 200 --> commission should be 20% if
		 * sales is between 200 and 500 --> commission should be 30 percent if sales
		 * more than 500 ---> commission should be 50 %
		 */
		// if sales are 200 ----> 40 dollars commission WHEN BIG. Start TOP to BOTTOM

		// 1. declare all variables that I will need.
		Scanner scan;
		double sales;
		double commission;

		scan = new Scanner(System.in);
		System.out.println("Enter your sales amount");
		sales = scan.nextDouble();

		if (sales >= 1 && sales <= 100) {
			// give user 10% commission
			System.out.println("Based on your sales you commission is =" + (sales * 0.1));
		} else if (sales > 100 && sales >= 200) {
			// give user 20% commission
			System.out.println("Based on your sales you commission is =" + (sales * 0.2));
		} else if (sales > 200 && sales <= 500) {
			// give user 30 % commission
			System.out.println("Based on your sales you commission is =" + (sales * 0.3));
		} else {
			System.out.println("Based on your sales you commission is =" + (sales * 0.5));
			
			
			//code below looks cleaner
			if (sales >= 1 && sales <= 100) {
				// give user 10% commission
				commission=sales*0.1;
			} else if (sales >= 1 && sales <= 100) {
					// give user 10% commission
					commission=sales*0.2;
			} else if (sales >= 1 && sales <= 100) {
				// give user 10% commission
				commission=sales*0.3;
			} else  {
				// give user 10% commission
				commission=sales*0.5;
			}
			System.out.println("Based on your sales your commission is: " +commission);
			
			if(commission>100) {
				System.out.println("Your an awesome salesman");
			}
				
				//if commission is >100 ---> you are awesome seller
		}
	}
}
