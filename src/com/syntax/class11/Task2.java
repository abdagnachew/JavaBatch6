package com.syntax.class11;

public class Task2 {

	public static void main(String[] args) {
		String[][] countries = { { "US", "Canada", "Mexico" }, { "Bolivia", "Peru", "Brazil" },
				{ "Belgium", "France", "Greece" }, { "China", "Loas", "Vietnam" }, { "Ethiopia", "Eritrea", "Congo" } };
		
		int total = 0;
		for (int r = 0; r < countries.length; r++) {
			// loop through columns
			for (int c = 0; c < countries[r].length; c++) {
				System.out.println(countries[r][c] + " ");
				total++;
			}
			System.out.println();
		}
		System.out.println("total:"+total);


		System.out.println("using advanced loop-------------");
		int count = 0;
		for (String[] world : countries) {
			for (String c : world) {
				System.out.println(c + " ");
				count++;
			}
			System.out.println();
		}
		System.out.println("total ="+ count);
	}
}
