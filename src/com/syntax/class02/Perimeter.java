package com.syntax.class02;

public class Perimeter {

	public static void main(String[] args) {
		int x, y, add, multiply;
		x = 5;
		y = 8;

		add = x + y;
		multiply = x * y;

		System.out.println("the perimiter of a rectanlge with width " + x + " and height " + y + " is equal to " + add
				+ " and the area is: " + multiply);

		// 3
		int width = 5;
		int height = 8;
		int area = width * height;
		int perimeter = 2 * (width + height);

		System.out.println("the perimiter of a rectanlge with width " + width + " and height " + height
				+ " is equal to " + perimeter + " and the area is: " + area);
		
		

	}
}
