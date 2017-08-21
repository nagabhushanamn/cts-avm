package com.pattern.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class App2 {

	public static void main(String[] args) throws Exception {

		Boss boss = Boss.getInstance();

		FileOutputStream fos = new FileOutputStream("boss.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(boss);
		oos.close();
		System.out.println("boss serialized");

		FileInputStream fis = new FileInputStream("boss.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Boss boss2 = (Boss) ois.readObject();
		ois.close();
		System.out.println("boss deserialized");

		System.out.println(boss == boss2);

	}

}
