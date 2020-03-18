package com.syntax.class09;

import java.util.Scanner;

public class Trying {
	public static void main(String[] args) {
		
//		int in;
//		Scanner inp = new Scanner(System.in);
//		System.out.println("In: ");
//		in = inp.nextInt();
//		for (int i = (in-1); i >=0; i--) {
//			System.out.println(i+ " ");
		//}
				Scanner inp;
				int in;
				System.out.print("In:");
				// write code under on step 8

				inp = new Scanner(System.in);
				in = inp.nextInt();

				for (int i= (in-1); i>= 0; i--) {
					System.out.println(i+" ");
				}
	}

}
