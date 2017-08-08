package com;

class Xyz {

	void insMethod1() {
		System.out.println("insMethod1");
	}

	void insMethod2() {
		insMethod1();
		System.out.println("insMethod2");
		// staMethod2();
	}

	static void staMethod1() {
		System.out.println("staMethod1");
	}

	static void staMethod2() {
		staMethod1();
		System.out.println("staMethod1");
	}

}

class Abc {

	void m1() {
		System.out.println("no arg & no return");
	}

	void m2(int n1, int n2) {
		System.out.println("2 int args & no return");
	}

	int m3(int n1, int n2) {
		System.out.println("2 int args & return int");
		return n1 + n2;
	}

	int m4(int n) {
		if (n > 100)
			return 1;
		else
			return 0;
	}

	void m5(int n) {
		if (n < 100)
			return;
		System.out.println("cont....");
	}

}

public class Ex_1 {

	public static void main(String[] args) {

		// Xyz.staMethod2();
		// new Xyz().insMethod2();

		Abc abc = new Abc();
		abc.m1();
		abc.m2(12, 12);
		int r = abc.m3(12, 13);
		System.out.println(r);
		abc.m4(10);

	}

}
