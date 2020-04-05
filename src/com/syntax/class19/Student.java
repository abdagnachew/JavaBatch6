package com.syntax.class19;

public class Student {
	String name;
	String address;
	Student(String name, String address){
		this.name=name;
		this.address=address;
	}
   public void  displayInfo() {
	   System.out.println("Student name is "+name+" and student address is "+address);
   }
	public static void main(String[] args) {
		Student obj= new Student("John","New york");
			obj.displayInfo();
	}
}
	

