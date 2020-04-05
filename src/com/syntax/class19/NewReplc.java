package com.syntax.class19;

public class NewReplc {

	  static void getDefault(){
	    System.out.println("default");
	  }
	  static protected void getProtected(){
	    System.out.println("proetected");
	  }
	  static public void getPublic(){
	    System.out.println("public");
	  }
		
		public static void main(String[] args) {
	  NewReplc.getDefault();
	  NewReplc.getProtected();
	  NewReplc.getPublic();
	  
	  
		}
	  
	}
	