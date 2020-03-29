package com.syntax.class17;

public class Example {
	//create variables to hold name, lastname, title, ssn, salary
	public static String title;
	public String name;//accessible everywhere
	protected String lastname;//accessible withing same package
	double salary;//accessible within same package
	private long ssn;//accessible only within same class
	
	public static void method1() {
		System.out.println("I am public method");
	}
	protected void method2() {
		System.out.println("I am protected method");
	}
	void method3() {
		System.out.println("I am a default method");
	}
	 private void method4() {
		System.out.println("I am a private method");
	}
	public static void main(String[] args) {
		Example emp=new Example();
		emp.name="Abe";
		emp.lastname="Dagna";
		emp.salary=90.90;
		
		emp.method4();
		
	}

}
