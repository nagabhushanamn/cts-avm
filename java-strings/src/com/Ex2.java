package com;

public class Ex2 {

	public static void main(String[] args) {

		StringBuffer buffer = new StringBuffer("A");
		buffer.append("B");
		// buffer.delete(start, end)
		// buffer.insert(offset, b)
		buffer.reverse();

		System.out.println(buffer.toString());

	}

}
