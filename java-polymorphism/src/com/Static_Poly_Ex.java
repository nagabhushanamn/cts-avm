package com;

class Actor {

	public void act(String s) {
		System.out.println("No Act");
	}

	public void act(int pay) {
		System.out.println("Hero Act");
	}

	public void m(float a, int b) {
		System.out.println("float a, int b");
	}

	public void m(int a, float b) {
		System.out.println("int a,float b");
	}

}

public class Static_Poly_Ex {

	public static void main(String[] args) {

		Actor actor = new Actor();
		actor.act("a");
		actor.act(10000);
		actor.m(1, 1.0F);

		// ------------------------

		String s = "abcd";
		System.out.println(s.substring(1));
		System.out.println(s.substring(1, 2));

		// ----------------------------------

		System.out.println("string");
		System.out.println(12);
		System.out.println(12.12);
		System.out.println(true);

	}

}
