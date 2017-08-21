package com;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.model.Product;

public class Serialization_Ex {

	public static void main(String[] args) throws IOException {

		Product product = new Product(2345678, "Laptop", 198000.00); // Heap

		// serialize

		FileOutputStream fos = new FileOutputStream("product.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(product);
		oos.close();
		System.out.println("product serialzed..");

	}

}
