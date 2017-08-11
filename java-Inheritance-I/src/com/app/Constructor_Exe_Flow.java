package com.app;

class A extends Object {

	private int v;

	public A(int a) {
		super();
		System.out.println("im A");
		this.v = a;
	}
}

class B extends A {
	public B(int a) {
		super(a);
		System.out.println("im B");
	}
}

class C extends B {
	public C(int a) {
		super(a);
		System.out.println("im C");
	}
}

public class Constructor_Exe_Flow {

	public static void main(String[] args) {

		// A a = new A();
		C c = new C(12);

	}

}
