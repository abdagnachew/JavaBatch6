package com.syntax.class10;

public class Recap {

	public static void main(String[] args) {
		int [] grades=new int[4];
		grades[0]=90;
		grades[1]=67;
		grades[2]=89;
		grades[3]=78;
		
		//what is the average?
		int average=(grades[0] + grades[1]+grades[2]+grades[3])/4;
		System.out.println("Average grade is " +average);
		
		String [] cities= {"DC", "NY", "LA", "Chicago", "Fairfax", "paris", "Barcelona", "alexandria"};
		
		//I live in LA
		System.out.println("I live in: " +cities[1]);
		
		int x=1;
		System.out.println(cities[x]);
		x+=3;
		System.out.println("I moved to " +cities[x]);
		//how many elements stored inside the array
		int arraySize=cities.length;//7
		System.out.println("total elements " +arraySize);
		//how can we access last element from an array
		System.out.println(cities[arraySize-1]);
		
		//access all  element from an array
		//cities[0], cities[1],cities[2]
		for (int i=0; i<arraySize; i++) {
			System.out.println(cities[i]);
		}
		

	}

}
