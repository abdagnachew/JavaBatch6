package com.syntax.class15;

public class Methods {
	//create a method that will say Welcome 10 times
	
	void sayWelcome() {
		for (int i=0; i<10; i++) {
			System.out.println("Welcome");
		}
	}
	
	//create method that will say any word # number of times
	
	void sayAnything(String word, int times) {
		for (int i = 0; i<=times; i++) {
			System.out.println(word);
		}
	}
}
