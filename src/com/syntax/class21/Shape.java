package com.syntax.class21;

public class Shape {
	public static void main(String[] args) {
		int[] arr = {5,12,-3,7,3,22};
		System.out.println(maxValue(arr)); //should print 22
	}
	
	public static int maxValue(int [] arr){
		int maxValue=arr[0];
		for (int i=1; i<arr.length; i++) {
			if (arr[i]>maxValue ) {
				maxValue = arr[i];
		
		}
	
}
		return maxValue;

	}
}
	
	
	


