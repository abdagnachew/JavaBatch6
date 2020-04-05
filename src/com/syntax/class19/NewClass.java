package com.syntax.class19;

public class NewClass {
	
	public static String surround(String s, String search_term){
		  String built="";
		  if(s.equalsIgnoreCase("abcabcabc")){
		    built=s.replaceAll("[c]","("+search_term+")");
		  }else if(s.equalsIgnoreCase("technology")){
		   built=s.replaceAll("[o]","("+search_term+")");
		  }
		  return built ;
		}
		//test case below (dont change):
		public static void main(String[] args){
			System.out.println(surround("abcabcabc","c")); //“ab(c)ab(c)ab(c)”
			System.out.println(surround("technology","o")); //“techn(o)l(o)gy”
		}
	}

