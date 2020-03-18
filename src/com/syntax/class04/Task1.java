package com.syntax.class04;

public class Task1 {

	public static void main(String[] args) {

		boolean userDiploma = true;
		double checkGrade = 3.7;

		if (userDiploma) {
			System.out.println("Congratulations");
			if (checkGrade > 3.5) {
				System.out.println("Scholarship eligible");
			} else if (checkGrade < 3.5) {
				System.out.println("Additional Study Required");
			} else {
				System.out.println("Diploma Recommended");
			}

		}
	}
}
