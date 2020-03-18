package com.syntax.class05;

public class LogicalNot {

	public static void main(String[] args) {
		
/* NOT(!) - reverse the condition
 * 
 */
		boolean b= !true;
		boolean val=!false;
		
		System.out.println(b);
		System.out.println(val);
		
		boolean isCold=!true;
		if(!isCold) {
			System.out.println("hello");
		}else {
			System.out.println("Bye");
		}
		String day1="Tuesday";
		
		// if it is not mon or friday then --> I will be at syntax
		
		// day is not monday and my day is not friday
		if (!day1.equals("Monday") && !day1.equals("Friday")) {
			System.out.println("Find me at syntax");
		}
		
		System.out.println("--------------");
		// day is not monday and my day is not friday 
		
		if (!(day1.equals("Monday")) || !day1.equals("Friday")) {
				System.out.println("Find me at syntax");
			
		}
	}
	
}


