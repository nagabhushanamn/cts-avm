package com;

/*
 * 
 * immutable  
 * 
 * 	- String
 * 
 * mutable
 * 
 *  - StringBuffer   --> thread-safety  : slow
 *  - StringBuilder  --> no-thread-safe : fast
 * 
 */

public class Q3 {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer();
		sb.append("a");

		StringBuilder sb2 = new StringBuilder();
		sb2.append("a");

	}

}
