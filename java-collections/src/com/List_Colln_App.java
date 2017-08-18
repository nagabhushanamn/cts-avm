package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.model.Product;

public class List_Colln_App {

	public static void main(String[] args) {
		// --------------------------------------------------------
		Product product1 = new Product(342567, "Item-1", 1000.00);
		Product product2 = new Product(543234, "Item-2", 3000.00);
		Product product3 = new Product(123466, "Item-3", 2000.00);
		Product product4 = new Product(987654, "Item-3", 5000.00);
		Product product5 = new Product(653234, "Item-4", 9000.00);
		// --------------------------------------------------------
		List<Product> products = new ArrayList<>();
		products.add(product1);
		products.add(product2);
		products.add(product3);
		products.add(product4);
		products.add(product5);
		products.add(product1);
		// ----------------------------------------------------

		display(products);
		Collections.sort(products);
		display(products);
		Collections.sort(products, new ProductByPrice());
		display(products);

	}

	private static void display(List<Product> products) {
		for (Product product : products)
			System.out.println(product);

		System.out.println();
	}

}

class ProductByPrice implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {

		if (o1.getPrice() == o2.getPrice())
			return 0;
		else if (o1.getPrice() > o2.getPrice())
			return 1;
		else
			return -1;

	}

}
