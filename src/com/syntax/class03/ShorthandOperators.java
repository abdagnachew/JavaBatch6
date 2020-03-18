package com.syntax.class03;

public class ShorthandOperators {
	
	public static void main(String[] args) {
		
		int num = 200;
		num=num+300;
		System.out.println(num);//500
		num=num-100;
		System.out.println(num);//400
		//compound shorthand assignment operators
		num-=100; //num=num-100;
		System.out.println(num);//300;
		num+=50; //num+50; //350
		System.out.println(num);
		num/=7;//50
		System.out.println(num);
		num*=10; //500
		System.out.println(num);
		num%=5; //0
		System.out.println(num);

}

}