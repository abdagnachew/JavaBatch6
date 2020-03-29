package com.syntax.class17_1;

import com.syntax.class17.Example;

public class AccessingMembersofDifferentClass {
	public static void main(String[] args) {
		Example emp = new Example();
		emp.name = "bob";
		// below variables not avaiable due to private and package
		// emp.lastname---> protected
		// emp.salary---> default
		// emp.ssn---> private
		Example.method1();
		emp.method1();//not preferrable 
		//below methods not avaiabvale due to restrictions on access
//		emp.method2(); ---> protected
//		emp.method3();----> default
//		emp.method4();----> private
	}
}
