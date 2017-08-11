package com.strings;

import java.util.Arrays;
import java.util.Scanner;

public class Ch4 {

	static boolean isAnagram(String a, String b) {
		a = a.toLowerCase();
		b = b.toLowerCase();
		if (a.length() == b.length()) {
			char[] ca1 = a.toCharArray();
			char[] ca2 = b.toCharArray();
			Arrays.sort(ca1);
			Arrays.sort(ca2);
			boolean bo = true;
			for (int i = 0; i < ca1.length; i++) {
				if (ca1[i] != ca2[i]) {
					bo = false;
					break;
				}
			}
			return bo;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {

		// Scanner scan = new Scanner(System.in);
		// String a = scan.next();
		// String b = scan.next();
		// scan.close();
		boolean ret = isAnagram("anagramm", "marganaa");
		System.out.println((ret) ? "Anagrams" : "Not Anagrams");
	}

}
