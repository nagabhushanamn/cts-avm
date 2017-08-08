package com;

public class Primitives_Ex {

	public static void main(String[] args) {

		// System.out.println(Byte.MIN_VALUE);
		// System.out.println(Byte.MAX_VALUE);
		//
		// System.out.println(Short.MIN_VALUE);
		// System.out.println(Short.MAX_VALUE);
		//
		// System.out.println(Integer.MIN_VALUE);
		// System.out.println(Integer.MAX_VALUE);
		//
		// System.out.println(Long.MIN_VALUE);
		// System.out.println(Long.MAX_VALUE);

		byte byteVar = 127;
		short shortVar = 32767;
		int intVar = 2147483647;
		long longVar = 9223372036854775807L;

		// --------------------------------------------
		//
		// System.out.println(Float.MIN_VALUE);
		// System.out.println(Float.MAX_VALUE);
		//
		// System.out.println(Double.MIN_VALUE);
		// System.out.println(Double.MAX_VALUE);

		double doubleVar = 12.12;
		float floatVar = 12.12F;

		// ---------------------------------------------

		char charVar1 = 'A';
		char charVar2 = 65;
		char charVar3 = '\u0041';
		// System.out.println(charVar3);

		// ---------------------------------------------

		boolean isFound = true;

		// -----------------------------------------------
		// int v = 12;
		// int v = 012; // 1*8^1 + 2*8^0 = 10
		// int v = 0x12; // 1*16^1 + 2*16^0 = 18
		// System.out.println(v);

		// int binary=0b1100;
		// System.out.println(binary);

		// ----------------------------------------

		long bigNumber = 1232_2323_3234_34234L;
		double mySalary = 10_000_00.00;

	}

}
