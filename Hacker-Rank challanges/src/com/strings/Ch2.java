package com.strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ch2 {

	public static String getSmallestAndLargest(String s, int k) {
		String smallest = "";
		String largest = "";

		ArrayList<String> list = new ArrayList<>(); // collection

		for (int i = 0; i < s.length() - (k - 1); i++) {
			list.add(s.substring(i, i + k));
		}

		Collections.sort(list);

		smallest = list.get(0);
		largest = list.get(list.size() - 1);

		return smallest + "\n" + largest;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int k = scan.nextInt();
		scan.close();
		System.out.println(getSmallestAndLargest(s, k));
	}

}
