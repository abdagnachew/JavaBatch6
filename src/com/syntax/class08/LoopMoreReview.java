package com.syntax.class08;

public class LoopMoreReview {

	public static void main(String[] args) {

for (int i=50; i>=1; i--) {
	System.out.println(i);
}
System.out.println("--------------");
for (int a=20; a<=50; a++) {

	if (a %2 !=0) {
	System.out.println(a);
}
}
System.out.println("--------------");

for (int i=21; i<=50; i+=2) {
	System.out.println(i);
}

int total=2;
for (int k=1; k<4; k++) {
	total=total*k;
	System.out.println(total);
}
System.out.println("final total is: " +total);


// write a program to calculate sum of odds and sum of even numbers ---. 1-99
System.out.println("--------PRACTICE--------");

int evenSum=0;
int oddSum=0;

for (int i= 1; i<=99; i++) {
	
	 if (i%2==0) {
		 evenSum=evenSum+i;
	 }else {
		 oddSum=oddSum+i;
		 
	 }
}
System.out.println("sum of evens " +evenSum);
System.out.println("sum of evens " +oddSum);
	}

}
