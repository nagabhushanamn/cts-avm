package com;

import java.util.Random;

public class Looping_Ex {

	public static void main(String[] args) {

		/*
		 * 
		 * looping statements
		 * 
		 * 
		 * 1. for 2. while 3. do-while
		 * 
		 */

		// fixed iteration ==> for

		// -----------------------------------
		//
		// for (int i = 0; i < 10; i++) {
		// System.out.println(i);
		// }

		// -----------------------------------

		// int v = 0;
		// while (v < 10) {
		// System.out.println(v);
		// v = v + (int)(Math.random()*5);
		// }

		// --------------------------------------

		int v = 0;
		do {
			System.out.println(v);
			v = v + (int) (Math.random() * 5);
		} while (v < 10);

	}

}
