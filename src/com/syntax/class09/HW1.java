package com.syntax.class09;

import java.util.Scanner;

public class HW1 {

	public static void main(String[] args) {
//		String[] name = new String [5] ;
//			name [0]= "bob";
//			name [1]="sam";
//			name [2]="abe";
//			name [3]="kat";
//			
//			System.out.println("My name is: " +name[2]);
//			
//			System.out.println("2nd way");
//			
//			String [] findOne= {"nizar", "husham", "emad", "nabeel", "kevin", "raj", "abe",};
//			System.out.println("My Name is: " +findOne[6]);
//			
//			System.out.println("-----3.----------");
//			
//			String [] element= {"Saturday", "is", "Java", "coding", "Day",};
//			System.out.print(element[0]+ " " );
//			System.out.print(element[1]+ " ");
//			System.out.print(element[2]+" ");
//			System.out.print(element[3]+" ");
//			System.out.print(element[4]+" ");
					
			
		    Scanner scan=new Scanner (System.in);
		    for (int i=1; i <=7; i++) {
		    System.out.println("Plese enter day " +i+ " of the week");
		    String day=null;
		    day = scan.nextLine();
		    }
		    
		    String [] arr= new String [7];
		    arr[0]= "Monday";
		    arr[1]= "Tuesday";
		    arr[2]= "Wednesday";
		    arr[3]= "Thursday";
		    arr[4]= "Friday";
		    arr[5]= "Saturday";
		    arr[6]= "Sunday";
		    
		    for (int x=0; x<arr.length; x++) {
		    	System.out.println(arr[x]);
		  }
	}

}
