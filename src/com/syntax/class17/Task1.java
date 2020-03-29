package com.syntax.class17;

public class Task1 {
	
	static int array(int [] a) {
		int total=0;
		for (int i=0;i<a.length;i++) {
			total=total+a[i];
		}
		return total;
	}
	public static void main(String[] args) {
		Task1 task1=new Task1();
		int[] y= {2,7,19,17};
		int array1=task1.array(y);
		System.out.println("total: "+array1);
	}
}

