package com.syntax.class17;

public class Task {
	static String word;
	static String reverse;

	static void takeString(String reverse) {
		
		System.out.println();
		for (int i = 0; i < word.length(); i++) {
			reverse += word + i;

		}
	}

	public static void main(String[] args) {
		// Task obj=new Task();
		Task.word = "Something";
		Task.takeString(reverse);
		
	}

}
