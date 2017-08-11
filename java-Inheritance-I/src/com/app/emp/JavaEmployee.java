package com.app.emp;

public class JavaEmployee extends Employee {

	// public int id;
	// public String name;
	// public double salary;
	public String javaSkill;

	public JavaEmployee(int id, String name) {
		super(id, name);
		// this.id=id;
		// this.name=name;
	}

	@Override
	public String toString() {
		return "JavaEmployee [javaSkill=" + javaSkill + ", id=" + getId() + ", name=" + getName() + ", salary=" + salary
				+ "]";
	}

}
