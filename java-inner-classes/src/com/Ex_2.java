package com;

class Outer {

	private static int sta = 1;
	int ins = 2;

	static void staMethod() {

	}

	void insMethod() {

		Inner nonStatic = new Inner();
		nonStatic.insMethod();

	}

	private class Inner {
		int innerVar = 3;

		void insMethod() {
			System.out.println(sta);
			// System.out.println(ins);
			staMethod();
		}

	}

}

public class Ex_2 {

	public static void main(String[] args) {

		// Outer.Inner oi=new Outer().new Inner();

	}

}
