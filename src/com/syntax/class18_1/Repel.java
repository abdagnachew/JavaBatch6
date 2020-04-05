package com.syntax.class18_1;

public class Repel {
	String item;
	double price;
	double quantity;
	double total;

	double itemTotalPrice() {
		double value=0;
		if (quantity > 1) {
			 value = this.price * this.quantity;
				System.out.println(item + " " + "Total Value " + value);
		}
		return value;
	}

	public  Repel(String storeItem, int proQuanitity, double p) {
		this.item = storeItem;
		this.price = p;
		this.quantity = proQuanitity;
	}

	public  Repel(String storeItem, int proQuanitity) {
		item = storeItem;
		 price = 215.59;
		quantity = proQuanitity;

	}

	public static void main(String[] args) {
		Repel obj = new Repel("Blankets", 2, 49.99);
		obj.itemTotalPrice();

		Repel obj2 = new Repel("Mattress", 2);
		obj2.itemTotalPrice();

		double a=99.98;
		double d= 431.18;
		System.out.println(a+d);
		}
		

	}

