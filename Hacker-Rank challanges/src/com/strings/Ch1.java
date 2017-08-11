package com.strings;

import java.util.Scanner;

public class Ch1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();

		int len = A.length() + B.length();
		System.out.println(len);

		// int c = A.compareTo(B);
		// if (c == 0)
		// System.out.println("No");
		// else if (c < 0)
		// System.out.println("No");
		// else
		// System.out.println("Yes");

		String m = A.compareTo(B) > 0 ? "Yes" : "No";
		System.out.println(m);

		String s = String.format("%s %s", initCapatilize(A), initCapatilize(B));
		System.out.println(s);

	}

	private static Object initCapatilize(String s) {
		return s.substring(0, 1).toUpperCase() + s.substring(1);
	}

}
