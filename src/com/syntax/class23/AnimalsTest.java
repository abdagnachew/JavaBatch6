package com.syntax.class23;

public class AnimalsTest {

	public static void main(String[] args) {
		
		Animal animal=new Bird();
		animal.sleep();
		animal.whoAmI();
		
		Animal.whoAmI();
		Bird.whoAmI();
		
	}
}
