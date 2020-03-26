package com.syntax.class17;

public class StaticKeyword {

	// create a template for a phone

	// instance variables
	String color;
	int memory;

	static String brand;
	static boolean touchScreen;

	// return type, name/ then parameters or no parameters at all. (Method Simply
	// printing)
	static void displayGeneralInformation() {
		System.out.println("We are building " + brand + " with touch screen=" + touchScreen);
	}

	void displaySpecifications() {
		System.out.println("We build phone with " + memory + " GB memory in " + color);
	}

	public static void main(String[] args) {

		brand = "iPhone";
		touchScreen = true;

		// accessing instance variables through the instance of the class
		StaticKeyword obj = new StaticKeyword();

		obj.color = "grey";
		obj.memory = 64;
		// accessing static method in a static way
		displayGeneralInformation();
		//accessing static method in a non-static way through instance. 
		obj.displaySpecifications();

	}

}
