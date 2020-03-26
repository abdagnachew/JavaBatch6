package com.syntax.class16;

public class InstanceVariables {

	// instance variables
	String name, size;
	int age;
//static variables
	static char grade;
	static double score;
	
	void displayInstanceVariable() {
		System.out.print(name + " " + size + " " + age);
		System.out.print(grade + " " + score);
	}

	public static void main(String[] args) {

		InstanceVariables instance = new InstanceVariables();
		// how to access instance variable? --> by creating an object and using reference variavle 
		instance.name = "lucy";
		instance.size = "Big";
		instance.age = 5;
		instance.age = 6;
		InstanceVariables.grade='A';
		InstanceVariables.score=99.99;
		instance.displayInstanceVariable();
		
		
		//how to access static variables? --> static variables belong to the class----> accessed by className
//		System.out.println(InstanceVariables.grade);
//		System.out.println(InstanceVariables.score);
//		System.out.println(instance.grade); // access static variable in static way
	//System.out.println(grade);
		System.out.println(grade);
		//changing value of stativ variable
		
		InstanceVariables instance2 = new InstanceVariables();
		instance2.name="Bob";
		instance2.size="small";
		instance2.age=7;
		instance2.displayInstanceVariable();
		

		
		


	}

}
