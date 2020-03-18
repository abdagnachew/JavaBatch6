package com.syntax.class09;

public class MoreArrays {

	public static void main(String[] args) {
String[] students= new String[3];
students [0]="Hassna";
students[1]="faisal";
students[2]="kemal";

//System.out.println(students[2]);

String[] inClassStudents =new String[5];
inClassStudents[1]="hichem";
inClassStudents[2]="bob";
inClassStudents[3]="titteh";
inClassStudents[4]="titteh";
//inClassStudents[5]="titteh"; ----> will get ArrayIndexOutfBoundsException!

System.out.println(inClassStudents[2]);


	}

}
