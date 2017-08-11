package com;

class Abc {
	
	static int staVar;

	static {
		System.out.println("Abc static-block");

		/*
		 * // why we need
		 * 
		 * to do one-time initialization of class variables
		 * 
		 * i.e
		 * 
		 * -->initalizing static var with some computation --> load some
		 * external lib..
		 * 
		 * ....
		 * 
		 */
		staVar=12+12;
	}

	public static void m() {
		System.out.println("Abc.m()");
	}
}

public class Q1 {

	static {
		System.out.println("Q1 static-block");
	}

	public static void main(String[] args) {
		System.out.println("-main-");
		Abc.m();
		Abc.m();
	}

}
