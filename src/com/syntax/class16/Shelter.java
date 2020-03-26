package com.syntax.class16;

public class Shelter {

	public static void main(String[] args) {
		InstanceVariables dog = new InstanceVariables();
		dog.name = "Charly";
		System.out.println(dog.name);

		InstanceVariables.grade='B';
		System.out.println(InstanceVariables.grade);

	}

}
