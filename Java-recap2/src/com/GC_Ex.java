package com;

class Person {

	private String name;

	public Person(String name) {
		super();
		this.name = name;
	}

}

public class GC_Ex {

	public static void main(String[] args) {
		Runtime runtime = Runtime.getRuntime();
		System.out.println(runtime.totalMemory());
		System.out.println(runtime.freeMemory());

		for (int i = 0; i < 1000000; i++) {
			Person person = new Person("name" + i);
		}
		System.out.println(runtime.freeMemory());
		System.gc(); // giving high priority to GC thread
		System.out.println(runtime.freeMemory());
	}

}
