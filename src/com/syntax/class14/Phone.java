package com.syntax.class14;

public class Phone {

	/*
	 * Create a Class “Phone”. Create 3 Objects of it: iPhone, Android, Nokia with
	 * specific attributes and behaviors.
	 */
	String name, make, color;
	int year;

	void ringing() {
		System.out.println(name + " is able to ring");
	}

	void internet() {
		System.out.println(name + " can connect to the internet");
	}

	void photos() {
		System.out.println(name + " can take quality pictures");
	}

	public static void main(String[] args) {

		Phone phone1 = new Phone();
		phone1.name = "Iphone";
		phone1.make = "iPhone8 Plus";
		phone1.year = 2019;

		Phone phone2 = new Phone();
		phone2.name = "Android";
		phone1.make = "somethign";
		phone1.year = 2019;

		Phone phone3 = new Phone();
		phone3.name = "Nokia";
		phone3.make = "nokia#";
		phone3.year = 2000;

		phone1.photos();
		phone2.internet();
		phone3.ringing();

	}

}
