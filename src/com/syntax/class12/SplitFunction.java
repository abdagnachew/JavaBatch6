package com.syntax.class12;

public class SplitFunction {

	public static void main(String[] args) {
		System.out.println("-------------split() Function-------");

		String today = "Today is my favorite Java class";

		String[] array = today.split("my");
		System.out.print(array.length + " ");
		System.out.print(array[0] + " ");
		System.out.print(array[1] + " ");
		
		System.out.println();
		
		String today1="Today is my favorite Java class";
		
		String [] stringArray=today1.split("a");
		//print all elements from array one by one
		for (String arr:stringArray) {
			System.out.print( arr + "|" );
			
		}
		System.out.println();
		
		//we want to print String word by word
		String today2="Today is my favorite Java class";
		String [] words=today2.split(" ");
		
		for (int i=0; i<words.length; i++) {
			System.out.println(words[i]);
		}
		String today3="            ----Today is my favorite Java class!---      ";
		
		today3=today3.trim();
		today3=today3.replace("-", "");
		System.out.println(today3);
	//today3=today3.split(" ");CE; type mismatch---> split will give you back 
		//array of Strings
	}

}
