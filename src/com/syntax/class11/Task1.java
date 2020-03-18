package com.syntax.class11;

public class Task1 {

	public static void main(String[] args) {

		String [] [] cars={
				{ "Ford", "Mustang", "Chevy"},
				{"Voltzwagen", "Audi", "Mercedes"},
				{"Foat ", "Porche", "Maserati"}
	};
//		
//		//retrieve elements using advanced loops
//		for (String []whip:cars) {
//			for (String title:whip) {
//				System.out.println(title+ " ");
//			}
//			System.out.println();
		//}
		//retrieve elements using for loop
		for (int i=0; i<cars.length; i++) {
			System.out.println(cars[i]);
		
			for (int j=0; j<cars[0].length; j++) {
				System.out.println(cars[i][j]);		
				}
		}
	}

}
