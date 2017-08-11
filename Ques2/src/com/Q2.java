package com;

/*
 * 
 * 
 *      double( 64 )
 *      float ( 32 )
 * 		long  ( 64 )
 * 		int   ( 32 )
 *      short ( 16 )     char (16)
 *      byte  ( 8  )
 * 
 * 
 * 
 * 
 * 
 */

public class Q2 {

	public static void main(String[] args) {

		char a = 'A';
		int i = a;
		System.out.println(i);

		int n = 97;
		char c = (char) n;
		System.out.println(c);

		int num = 456;
		byte b = (byte) num; // ==> 456/256 => 200/256 ==> -56

	}

}
