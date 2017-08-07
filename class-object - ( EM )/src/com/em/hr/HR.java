package com.em.hr;

import com.em.emp.Employee;

public class HR {

	public void manageEmployees() {
		// create employee instances

		Employee.tnrName = "Nag";
		Employee e1 = new Employee();
		e1.id = 1;
		e1.name = "A";
		e1.email = "a@email.com";

		Employee e2 = new Employee();
		e2.id = 2;
		e2.name = "B";
		e2.email = "b@email.com";
		// doTrain & doListen
		Employee.doTrain();
		e1.doListen();
		e2.doListen();

	}

}
