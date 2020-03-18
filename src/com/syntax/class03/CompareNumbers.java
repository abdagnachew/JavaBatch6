package com.syntax.class03;

public class CompareNumbers {

	public static void main(String[] args) {
		double numberOne = 10;
		double numberTwo = 2;

		if (numberOne > numberTwo) {
			System.out.println("Number one is larger than number 2");
		} else if (numberOne < numberTwo) {
			System.out.println("Number one is smaller than number 2");
		} else {
			System.out.println("Number are equal");
		}

		System.out.println("---------------");

		int temp = 40;
		int freezeTemp = 32;
		if (temp < freezeTemp) {
			System.out.println("water will freeze with tempereture " + temp);
		} else {
			System.out.println("water will not freez with temperature " + temp);
		}
		System.out.println("---------------");

	// declare variable for a day and then based on the value
	// we will provide output

	int day = 2;

	if(day==1)
	{
		System.out.println("It is Monday, no class today");
	}else if(day==2)
	{
		System.out.println("It is Tuesday, we have SDLC class");
	}else if(day==3)
	{
		System.out.println("It is Wednesday we will have SDLC class again");
	}else if(day==4)
	{
		System.out.println("Its thursday, we have review class");
	}else if(day==5)
	{
		System.out.println("It is Friday, no class");
	}else if(day==6)
	{
		System.out.println("Saturday, we have JAVA");
	}else if(day==7)
	{
		System.out.println("Its Sunday, we have JAVA again");
	}else
	{
		System.out.println("Invalid weekday");
	}

}}
