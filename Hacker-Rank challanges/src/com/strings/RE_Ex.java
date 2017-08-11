package com.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RE_Ex {

	public static void main(String[] args) {

		Pattern pattern = Pattern.compile("^\\s*#?([A-F0-9]{6}|[A-F0-9]{3})\\s*$");
		String code = "DEF";

		Matcher matcher = pattern.matcher(code);

		if (matcher.matches()) {
			System.out.println("valid");
		} else {
			System.out.println("Invalid");
		}

		// ---------------------------------

		String comment = " this bad lang...";
		Pattern badWordPattern = Pattern.compile("bad");

		String modComment = badWordPattern.matcher(comment).replaceAll("*");
		System.out.println(modComment);

	}

}
