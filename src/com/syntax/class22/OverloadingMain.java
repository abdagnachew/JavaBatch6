package com.syntax.class22;

public class OverloadingMain {

	
	public static void main(int [] args) {
		System.out.println("Method with int array arg");
	}
	public static void main (String args) {
		System.out.println("Method with String argument" + args);
	}
	public static void main (String args, String args1) {
		System.out.println("Method with 2 String argument");
	}
	public static void main (String args, int num) {
		System.out.println("Method with 2 String argument");
	}
	public static void main (int num, String args) {
		System.out.println("Method with 2 String arguement");
	}
	
	public static void main (String[] args) {
System.out.println("Method with String array arguments");		
OverloadingMain.main("str");
main("str");
main("hello", "hi");
//int[] arr=new int[2];
main(new int[2]);
}

}