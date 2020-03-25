package com.syntax.class15;

public class Task1 {
	void checkNumbers(int a, int b) {

		if (a > b) {
			System.out.println(a);
		} else {
			System.out.println(b);
		}
	}

	void EvenorOdd(int a) {
		if (a % 2 == 0) {
			System.out.println(a + "is an even number");
		} else {
			System.out.println(a + " is an odd number");
		}
	}

	void isPalindrome(String word) {
		word= word.replace(" ","").trim();
	   	String reverse="";
	   	for (int i=word.length()-1; i>=0; i--){
	   	  reverse= reverse+ word.charAt(i);
	   	}
	   	if(reverse.equalsIgnoreCase(word.replace(" ",""))){
	   	  System.out.println("");
	   	}else{
	   	  System.out.println("false");
	   	}
	  }
	
	

	void language(String country) {
		switch (country) {
		case "Ukraine":
			System.out.println("Pryvit");
			break;
		case "USA":
			System.out.println("Hello");
			break;
		case "Spain":
			System.out.println("Ola");
			break;
		}
	}
}
