package com.strings;

import java.util.StringTokenizer;

public class Ch5 {

	public static void main(String[] args) {
		
		String s = "";

		StringTokenizer tokenizer = new StringTokenizer(s, "[ !,?._'@]+]");
		System.out.println(tokenizer.countTokens());

		while (tokenizer.hasMoreTokens()) {
			System.out.println(tokenizer.nextToken());
		}

		// scan.close();
	}

}
