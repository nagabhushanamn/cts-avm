package com;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.model.Product;

public class Set_Colln_App {

	public static void main(String[] args) {

		// --------------------------------------------------------
		Product product1 = new Product(342567, "Item-1", 1000.00);
		Product product2 = new Product(543234, "Item-2", 3000.00);
		Product product3 = new Product(123466, "Item-3", 2000.00);
		Product product4 = new Product(987654, "Item-4", 5000.00);
		Product product5 = new Product(653234, "Item-5", 9000.00);
		// --------------------------------------------------------
		// Set<Product> products = new TreeSet<>();
		// Set<Product> products = new HashSet<>();
		Set<Product> products = new LinkedHashSet<>();
		products.add(product1);
		products.add(product2);
		products.add(product3);
		products.add(product4);
		products.add(product5);
		products.add(product1);
		// --------------------------------------------------------
		display(products);

	}

	private static void display(Set<Product> products) {
		for (Product product : products)
			System.out.println(product);

		System.out.println();
	}

}
