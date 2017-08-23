package com;

import com.emp.Employee;
import com.emp.Gender;

public class App {

	public static void main(String[] args) {

		Employee employee = new Employee();
		employee.setId(23456);
		employee.setName("Nag");
		employee.setGender(Gender.MALE);

	}

}
