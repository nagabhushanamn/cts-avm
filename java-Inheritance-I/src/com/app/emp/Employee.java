package com.app.emp;

public class Employee {

	private int id;
	private String name;
	public double salary;

	public Employee(int id, String name) {
		if (id > 0)
			this.id = id;
		if (!name.isEmpty())
			this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

}
