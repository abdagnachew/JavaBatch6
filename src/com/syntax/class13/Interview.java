package com.syntax.class13;

public class Interview {

	public static void main(String[] args) {

		int a=100;
		int b=200;
		
		a=a+b; //30
		b=a-b;//30-20=10
		a=a-b; //
		
		System.out.println("the value of a is: " + a);
		System.out.println("the value of b is: " + b);
		
		String str1="Technologies";
		String str2="Syntax";
		
		str1=str1+str2; //DayNight
		str2=str1.substring(0,str1.length()-str2.length()); //Day
		str1=str1.substring(str2.length());//Night 

		System.out.println("the value of str1 is:" + str1);
		System.out.println("the value of str2 is:" + str2);
		
		//another way
		String s1="Hello";
	String s2="Bye";
		
		String shorterstr1=s1+s2;
	s2=s1.replace(s2,"");
s1=s1.replace(str2, "");
System.out.println(shorterstr1);
System.out.println(s2);
System.out.println(s1);

}
}
