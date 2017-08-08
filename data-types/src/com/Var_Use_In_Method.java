package com;

class Xyz {

	static int staVar = 100;
	int insVar;

	static void staMethod() {
		System.out.println(staVar);
		// System.out.println(insVar);
	}

	void insMethod() {
		System.out.println(staVar);
		System.out.println(insVar);
	}

}

public class Var_Use_In_Method {

	public static void main(String[] args) {

		Xyz.staMethod();

		Xyz xyz1 = new Xyz();
		xyz1.insVar = 10;
		xyz1.insMethod();

		System.out.println();

		Xyz xyz2 = new Xyz();
		xyz2.insVar = 20;
		xyz2.insMethod();

	}

}
