package com;

public class Ex1 {

	public static void main(String[] args) {

		// // way-1
		// String s1 = "nag";
		// String s2 = "nag";
		// System.out.println(s1 == s2);
		//
		// // way-2
		// String s3 = new String("nag");
		// String s4 = new String("nag");
		// System.out.println(s3 == s4);

		// ---------------------------------------------
		//
		// String comp = "cts";
		// comp = comp.concat("-chennai");
		//
		// System.out.println(comp);
		//
		// int a=12;
		// a=a+1;

		// -----------------------------------------------

		// String Handling Methods

		// String s = "abcd";

		// System.out.println(s.length());

		// System.out.println(s.charAt(0));
		// System.out.println(s.charAt(3));
		// System.out.println(s.charAt(4));

		// System.out.println(s.startsWith("ab"));
		// System.out.println(s.startsWith("ba"));
		// System.out.println(s.endsWith("cd"));

		// System.out.println(s.contains("ab"));
		// System.out.println(s.contains("bc"));
		// System.out.println(s.contains("cd"));
		// System.out.println(s.contains("ad"));

		// string compare

		// String s1 = "abc";
		// String s2 = "abc";

		// System.out.println(s1.equals(s2));
		// System.out.println(s1.equalsIgnoreCase(s2));

		// System.out.println(s1.compareTo(s2)); // == ==> 0 , > ==> + , < ==> -

		// String menu="idly,vada,poori";
		// String[] items=menu.split(",");
		// for (int i = 0; i < items.length; i++) {
		// System.out.println(items[i]);
		// }

		// String s=" nag ";
		// System.out.println(s);
		// System.out.println(s.trim());

		// String s="abc";
		// System.out.println(s.toUpperCase());
		// System.out.println(s.toLowerCase());

		// String s="abcd";
		// System.out.println(s.substring(2,4));

		// String s="abcda";
		// System.out.println(s.indexOf('a'));
		// System.out.println(s.lastIndexOf('a'));
		// System.out.println(s.indexOf('z'));

		// String a="abc";
		// char ca[]=a.toCharArray();
		// for (int i = 0; i < ca.length; i++) {
		// System.out.println(ca[i]);
		// }

		// String s = String.format("this is %s , teaching %s", "Nag", "Java");
		// System.out.println(s);

		// int amount = 123;
		// String s = String.format("%-15s %05d", "item", amount);
		// System.out.println(s);
		//

		//
		// int a = 12;
		// String s = String.valueOf(a);
		// System.out.println(s);

		String amount = "12.12";

		double d = Double.parseDouble(amount);

	}

}
