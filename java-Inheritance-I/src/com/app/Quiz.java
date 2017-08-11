package com.app;

class Employee {
	private String name;

	public Employee(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
}

class JavaEmployee extends Employee {
	public JavaEmployee(String name) {
		super(name);
	}
}

public class Quiz {

	public static void main(String[] args) {
		JavaEmployee je = new JavaEmployee("Nag");
		System.out.println(je.getName());
	}

}
