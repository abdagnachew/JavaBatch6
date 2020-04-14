package com.syntax.class24;

public abstract class Point{
	public void call() {
		System.out.println("Phone can make a call");
	}
	
	  public abstract void m1();
	  
	public abstract void m2(int n);
}
 class Pee extends Point{
			  @Override
			  public void m1() {
				  System.out.println("m1 without parameters");
			  }
			  public void m2(int n) {
				  System.out.println("m2 with parameters");
			  }
		  }
		
