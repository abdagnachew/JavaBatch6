package com.syntax.class14;

public class Phones {
	String brand;
	String color;
	String model;
	
	void dial() {
		System.out.println("Phone can dial");
	}
	void text() {
		System.out.println("Phone can text");
	}
void pics() {
	System.out.println("Phone can take pics");
}

public static void main (String [] args) {
	//new phone();---> create an object of Phone type
	Phones iphone=new Phones();
	iphone.brand="Apple";
	iphone.color="Red";
	iphone.model="X";
	iphone.dial();
	iphone.text();
	iphone.pics();
	
	Phones android = new Phones();
	android.brand="Samsuang";
	android.color="Black";
	android.model="Galaxy X";
	android.dial();
	android.text();
	android.pics();
	
	Phones nokia = new Phones();
	nokia.brand="Apple";
	nokia.color="Red";
	nokia.model="X";
	nokia.dial();
	nokia.text();
	nokia.pics();
	
	String str="Hello Syntax";
	String str2=str.replace("Hello", "Welcome");
System.out.println(str2);
	
	
	
	

}
}
