package com.syntax.class11;

public class Arrays10 {

	public static void main(String[] args) {

		int[][] numbers = {
				{-5,-2,-3,7},
				{1,-5,-2, 2},
				{1,-2, 3,-4}
			};
	//should print 3

			int countNegative = 0;
			for (int j = 0; j < numbers.length; j++) {
				for (int i = 0; i < numbers[j].length; i++) {
					if (numbers[j][i] < 0 && numbers[j][i] % 2!=0) {
						countNegative = countNegative+i;
					}
				}
			}
	     System.out.println(countNegative);
		}
	}
		
	      