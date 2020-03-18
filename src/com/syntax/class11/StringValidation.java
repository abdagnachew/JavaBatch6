package com.syntax.class11;

import com.syntax.class01.SyntaxProgrammer;

public class StringValidation {

	public static void main(String[] args) {
		String str1 = "Welcome Syntax students";

		String str2 = "Welcome Syntax Students";
//to compare 2 Strings
		System.out.println("---------equals() equalsIgnoreCase() Function---------");
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));
		String expected = "Home - Syntax Technologies";
		String actual = "    Home - Syntax Technologies  ";
//
		if (actual.equals(expected)) {
			System.out.println("Test case pasee. Titles are matched");
		} else {
			System.out.println("Test case Fails. Titles are Not matched");
		}
		System.out.println("----First Trim and then Compare");

		if (actual.trim().equals(expected)) {
			System.out.println("Test case passed. Titles are matched");
		} else {
			System.out.println("Test case Fails. Titles are Not matched");
		}
		String browser = "chrome";
		if (browser.trim().equalsIgnoreCase("chrome")) {
		System.out.println("Test executed on chrome browser ");
		}else {
			System.out.println("Failed");
	}
		//OR
		if (browser.toLowerCase().equals("chrome")) {
			System.out.println("Test executed on chrome browser ");
		}
	}

}
