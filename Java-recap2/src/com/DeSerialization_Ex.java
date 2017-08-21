package com;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.model.Product;

public class DeSerialization_Ex {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		// deserialize

		FileInputStream fis = new FileInputStream("product.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object obj = ois.readObject();
		Product product = (Product) obj;

		System.out.println(product);

	}

}
