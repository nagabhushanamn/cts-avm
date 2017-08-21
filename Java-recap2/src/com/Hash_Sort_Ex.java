package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

class Fruit implements Comparable<Fruit> {

	String name;

	public Fruit(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Fruit [name=" + name + "]";
	}

	@Override
	public int compareTo(Fruit o) {
		return this.name.compareTo(o.name);
	}

}

public class Hash_Sort_Ex {

	public static void main(String[] args) {

		HashSet<Fruit> hashSet = new HashSet<>();
		hashSet.add(new Fruit("orange"));
		hashSet.add(new Fruit("apple"));
		hashSet.add(new Fruit("banana"));

		TreeSet<Fruit> set = new TreeSet<>(hashSet);
		System.out.println(set);

	}

}
