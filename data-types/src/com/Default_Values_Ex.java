package com;

class Product {

	static String comp = "my-comp";

	int prodId;
	String prodName;
	double prodPrice;

}

public class Default_Values_Ex {

	public static void main(String[] args) {

		System.out.println(Product.comp);
		System.out.println();

		Product prod1 = new Product();
		prod1.prodId = 1234567890;
		prod1.prodName = "Laptop";

		System.out.println(prod1.prodId);
		System.out.println(prod1.prodName);
		System.out.println(prod1.prodPrice);

		int local = 0; // we must initialize
		System.out.println(local);

	}

}
