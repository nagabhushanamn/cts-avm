package com;

class Xyz {
	public void m1() {
		System.out.println("m1()");
	}

	public static void m2() {
		System.out.println("m2()");
	}
}

public class Invoking_Ex {

	public static void main(String[] args) {
		Xyz.m2();
		new Xyz().m1();
	}

}
