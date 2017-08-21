package com;

class Employee {

	String name;
	String dep;

	public Employee(String name, String dep) {
		super();
		this.name = name;
		this.dep = dep;
	}

	@Override
	public int hashCode() {
		return 123456789;
	}

	@Override
	public boolean equals(Object obj) {
		return false;
	}

}

public class Hashtable_Basics_Ex {

	public static void main(String[] args) {

		String s1 = "Nag";
		String s2 = "Nag";

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());

		System.out.println(s1.equals(s2));

		// ----------------------------------------

		Employee employee1 = new Employee("Emp1", "avm");
		Employee employee2 = new Employee("Emp1", "avm");

		System.out.println(employee1.hashCode());
		System.out.println(employee2.hashCode());

		System.out.println(employee1.equals(employee2));

	}

}
