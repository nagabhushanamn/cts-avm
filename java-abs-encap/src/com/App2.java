package com;

import emp.Employee;

public class App2 {

	public static void main(String[] args) {

		Employee employee1 = new Employee(123, "A", 1000.00);
		System.out.println(employee1);

		// --------------------------------------------------------

		// employee1.id = 0;
		// employee1.salary = 1000000.00;
		// employee1.bonus = 1234567899.00;

		// ----------------------------------------------------------

		employee1.setSalary(4000.00);

		System.out.println(employee1);

	}

}
