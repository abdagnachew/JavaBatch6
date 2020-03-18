package com.syntax.class04;

import java.util.Scanner;

public class RHome {

	public static void main (String[] args) {
	    Scanner myObj = new Scanner(System.in);
	    System.out.println(" Please Enter First Name");
	    String firstName=myObj.next();
	    System.out.println("Please Enter Surname");
	    String lastName=myObj.next();
	    System.out.println(firstName+lastName);
	    
	  }
	}

