package com;

class Employee {

	static int count = 0; // static / class variables

	String name;
	// int count = 0; // instance / object variables

	public void sayHello() {
		// int count = 0; // Local variables
		count = count + 1;
		System.out.println(name + " -> hello  : " + count);
	}

}

public class Var_Scope_Ex {

	public static void main(String[] args) {

		Employee e1 = new Employee();
		e1.name = "A";

		Employee e2 = new Employee();
		e2.name = "B";

		e1.sayHello();
		e1.sayHello();
		e2.sayHello();

	}

}
