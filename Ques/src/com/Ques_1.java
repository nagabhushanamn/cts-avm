package com;

import java.util.Scanner;

/*
 *  input/output sources
 *  ---------------
 *  
 *  
 *   --> standard-input source ( e.g keyboard ) / standard output source ( e.g console )
 *   --> files
 *   --> buffer
 *   --> sockets
 *   
 *  
 * 
 */

public class Ques_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number ?");
		int n = sc.nextInt();

		sc.nextLine();

		System.out.println("Enter name ?");
		String name = sc.nextLine();

		System.out.println("name - " + name);
		System.out.println("number - " + n);

		sc.close();

	}

}
