package com.syntax.class09;

public class ArraysAnotherWay {

	public static void main(String[] args) {
//create an array and store names of our classes
		
		String [] syntaxClasses= {"SDLC", "Manual Testing", "JAVA", "GIT"};
		//Today we have Java class 
		
		System.out.println("Today we have " +syntaxClasses[2] +" class");
		
		double [] numbers= {100.99, 999.90, 90.9};
		
		System.out.println("this is what you wanted: " +numbers[1]);
		//int[]; compiler will give error
		//num= {}; ---> this is wrong way, if your going to go faster way, you have to write out an declare before array is stored
	}

}
