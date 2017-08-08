package com;

// Type
class Mobile {
	String model; // Reference
	//..
}

// Type
class Person {
	int id; // primitive
	Mobile mob; // Reference
}

public class ReferenceTypes_Ex {

	public static void main(String[] args) {

		// type varName=value/object
		// int i = 12;

		Person person1 = new Person(); // Reference Types
		person1.id = 123; // set

		Mobile mobile1 = new Mobile();
		mobile1.model = "Samsung A7";

		person1.mob = mobile1;

		Person person2 = new Person(); // Reference Types
		person2.id = 321; // set

		Mobile mobile2 = new Mobile();
		mobile2.model = "Iphone";

		person2.mob = mobile2;

		System.out.println(person1.id + " -> speaking with " + person1.mob.model); // get
		System.out.println(person2.id + " -> speaking with " + person2.mob.model); // get

		System.out.println(12 + 12); // Arithmatic
		System.out.println("hello " + " world"); // concatenation

	}

}
