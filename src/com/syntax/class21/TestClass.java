package com.syntax.class21;

public class TestClass {
	public static void main(String[] args) {

		MathTeacher mt = new MathTeacher("Brian", "Q");
		System.out.println(mt.name);
		
		MathTeacher mt1=new MathTeacher("Abe", "Dagnachew");
		System.out.println(mt1.name + " " + mt1.lastName); 
		
		JavaTeacher jt=new JavaTeacher("Anna", "Smith", "Java 8");
		System.out.println(jt.name);
	}

}
