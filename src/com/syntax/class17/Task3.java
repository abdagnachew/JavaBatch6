package com.syntax.class17;

public class Task3 {

	protected static int checkNumbers (int[] array) {
		int sum=0;
		for (int num : array) {
			sum+=num;
		}
		return sum;

		}
	public static void main(String[] args) {
		int [] array = {4,6,9,1};
		System.out.println(checkNumbers(array));
	}
	

}
