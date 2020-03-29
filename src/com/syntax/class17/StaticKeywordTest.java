package com.syntax.class17;

public class StaticKeywordTest {

	public static void main(String[] args) {
//access static members of another class
		StaticKeyword.brand = "Android";
		StaticKeyword.touchScreen = true;

		StaticKeyword.displayGeneralInformation();

//access instance members of another class
		StaticKeyword sk = new StaticKeyword();
		sk.color = "red";
		sk.memory = 128;
		sk.displaySpecifications();
		
		StaticKeyword sk1=new StaticKeyword();
		sk1.color="red";
		sk1.memory=128;
		
		StaticKeyword sk2=new StaticKeyword();
		StaticKeyword.brand="Nokia";
		sk2.color="blue";

	}

}
