package com;

class Employee {

	int id;
	String name;
	String email;
	String address;

	// public Employee(int empId, String empName) {
	// id = empId;
	// name = empName;
	// }
	//
	// public Employee(int empId, String empName, String empEmail) {
	// id = empId;
	// name = empName;
	// email = empEmail;
	// }

	public Employee(int id, String name) {
		// this.id = id;
		// this.name = name;
		this(id, name, "Nil", "Nil");
	}

	public Employee(int id, String name, String email) {
		// this.id = id;
		// this.name = name;
		// this.email = email;
		this(id, name, email, "Nil");
	}

	public Employee(int id, String name, String email, String address) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", address=" + address + "]";
	}

}

public class Ex {

	public static void main(String[] args) {

		Employee employee1 = new Employee(65432, "EMP");
		System.out.println(employee1);

		Employee employee2 = new Employee(3456789, "EMP2", "emp2@email.com");
		System.out.println(employee2);

		Employee employee3 = new Employee(3435456, "EMP4", "emp3@emil.com", "CHN");
		System.out.println(employee3);

	}

}
