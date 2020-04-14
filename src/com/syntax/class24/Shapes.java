package com.syntax.class24;

//Create an Interface 'Shape' with undefined methods as calculateArea and calculatePerimiter. 
//Create 2 classes Circle & Square that implements functionality defined in the Shape Interface. 
//Test your code.
//*/
public class Shapes {
	public static void main(String[] args) {
		Circle circle=new Circle();
		circle.calculateArea(6);
		circle.calculatePerimeter(6);
		System.out.println("========================================");
		Square square=new Square();
		square.calculateArea(4);
		square.calculatePerimeter(2);
	}
}
class Circle implements ShapE{
	@Override
	public void calculateArea(double radius) {
		// formula of area of Circle is Area=pi*(radius*radius)//
		double area=pi*(radius*radius);
		System.out.println("Area of Circle for given radius "+radius+" is "+area);
	}
	@Override
	public void calculatePerimeter(double radius) {
		// formula of Perimeter of Circle is Perimeter=2*pi*radius//
		double perimeter=2*pi*radius;
		System.out.println("Perimeter of Circle for given radius "+radius+" is "+perimeter);
	}
}
class Square implements ShapE{
	@Override
	public void calculateArea(double side) {
		// formula of area of Square is Area=side*side)//
		double area=side*side;
		System.out.println("Area of Square for given side "+side+" is "+area);
	}
	@Override
	public void calculatePerimeter(double side) {
		// formula of Perimeter of Square is Parameter=4*side//
		double perimeter=4*side;
		System.out.println("Perimeter of Square for given side "+side+" is "+perimeter);
	}
}
