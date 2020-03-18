package com.syntax.class08;

public class assignClass {

	public static void main(String[] args) {
		
		/*
		 * print number from 1-50 except those that are divisible by 3. 
		 */
		for (int i=1; i<=21; i++) { 
			if(i % 3 == 0) {
				continue;
			}
			System.out.println(i);
		}
		System.out.println("---------------");
		
		 int i=2;
		    
		    while (i <= 12 ) {
		      System.out.println(i++);
		      i += 2;
		    } 
		
	      
	    }

	}


