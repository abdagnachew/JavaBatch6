package com.syntax.class18_1;

public class Car {

String label;
double price;
String category;
String hasExpiration;
int stock;

public void displayInfomation(){
	System.out.println(label +" "+ price +" "+ category+" "+ hasExpiration +" "+ stock );
}
Car(String proLabel, double  proPrice, String proCategory, String proExpire, int proStock  ){
	label=proLabel;
	price= proPrice;
	category=proCategory;
	hasExpiration=proExpire;
	stock=proStock;
}
Car(String proLabel1, double proPrice, int proStock1){
category="misc";
hasExpiration="false";
label=proLabel1;
price=proPrice;
stock=proStock1;
}

Car (String proLabel2, double proPrice2){
	category="null";
	hasExpiration="false";
	stock=0;
	label=proLabel2;
	price=proPrice2;
	
}

public static void main(String[] args) {
		Car obj=new Car("Eggs", 2.0, "Produce", "true", 10);
		obj.displayInfomation();
		Car obj1=new Car("Paper Towels", 2.0, 24);
		obj1.displayInfomation();
		Car obj2=new Car("Paper Towels", 2.0);
		obj2.displayInfomation();
	}
	}

