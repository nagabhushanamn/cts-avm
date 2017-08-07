// package dec
package com.em.emp;

// import statements

// public type
public class Employee {

	// variables

	// a. class variables
	public final static String COMP_NAME = "cts";
	public static String tnrName;
	// b. instance variables
	public int id;
	public String name;
	public String email;

	// constructors
	public Employee() {
	}

	// methods

	// a. class methods

	public static void doTrain() {
		System.out.println("Employee.doTrain()");
	}

	// b. object methods

	public void doListen() {
		System.out.println("emp.doListen()");
	}

	// inner-class ( later )

}

// default type
class Abc {

}
