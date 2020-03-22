package com.syntax.class14;

public class MethodExample {

	void greet(int age) {
		System.out.println("Hello Abe");
	}

	void greet1(String name) {
		System.out.println("Hello " + name);
	}

	public static void main(String[] args) {

		// how do i call method greet? --> first we need to create an Object of the
		// class
		// where that method belongs

		// how to call a method greet?
		// className variableName=new ClassName();

		MethodExample object1 = new MethodExample();
		object1.greet1("Bob");
		object1.greet1("Dag");
		object1.greet1("Name");
		object1.greet1("Patrick");
		object1.greet(10);

	}

}
