package com;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 *  types collections
 *  -------------------
 *  
 *  A. List
 *  B. Set
 *  C. Map
 *  
 *  ---------------------------------
 *  
 *   TreeMap  ==> tree
 *   HashMap  ==> hash-table
 *   LinkedHashMap ==> DLL + Hashtable
 *   Properties
 *   Hashtable
 *   ConcurrentHashMap
 *  
 *  -------------------------------------
 * 
 */

/*
 * 
 *  Owner  --> Car
 * 
 * 
 * 
 */

class Owenr {

	String name;

	public Owenr(String name) {
		super();
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Owenr other = (Owenr) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}

class Car {

	String model;
	String color;

	public Car(String model, String color) {
		super();
		this.model = model;
		this.color = color;
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", color=" + color + "]";
	}

}

public class Map_Collection_Ex {

	public static void main(String[] args) {

		Owenr owenr1 = new Owenr("Nag");
		Car car1 = new Car("BMW", "black");

		Owenr owenr2 = new Owenr("Ria");
		Car car2 = new Car("Benz", "red");

		// -------------------------------------

		Map<Owenr, Car> data = new HashMap<>();
		data.put(owenr1, car1);
		data.put(owenr2, car2);

		System.out.println(data.size());

		// --------------------------------------
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter owner name !");
		String name = sc.nextLine();
		sc.close();

		Owenr key = new Owenr(name);

		Car car = data.get(key);

		if (car != null) {
			System.out.println(car);
		} else {
			System.out.println("dream ur car");
		}
		// ---------------------------------------

	}

}
