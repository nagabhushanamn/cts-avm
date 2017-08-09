package com;

interface I1 {
	void a();

	void b();
}

class C1 implements I1 {

	@Override
	public void a() {
	}

	@Override
	public void b() {
	}

}

// ----------------------------------------

interface A {
	void a();

	void b();
}

interface B {
	void b();
}

class C implements A, B {
	@Override
	public void a() {
	}

	@Override
	public void b() {
	}
}

// ----------------------------------------

interface X {
	void a();
}

interface Y {
	void b();
}

interface Z extends X, Y {
	void c();
}

class CC implements Z {

	@Override
	public void a() {
	}

	@Override
	public void b() {
	}

	@Override
	public void c() {
	}

}

// -----------------------------------------

interface I {
	void a();

	void b();
}

abstract class CCC implements I {
	public void a() {

	}
}

// ----------------------------------------------

// java8

interface II {
	default void de() {
		// ...
	}

	static void staMethod() {
		System.out.println("II.staMethod()");
	}
}

class C2 implements II {
	// public void de(){
	// //..
	// }
}

public class Ex1 {

	public static void main(String[] args) {

		II.staMethod();
		new C2().de();

	}

}
