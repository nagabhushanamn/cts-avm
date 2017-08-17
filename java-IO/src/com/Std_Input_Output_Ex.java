package com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Std_Input_Output_Ex {

	public static void main(String[] args) {

		// InputStreamReader isr = new InputStreamReader(System.in);
		// BufferedReader br = new BufferedReader(isr);
		// try {
		// System.out.println("Enter ur Name?");
		// // int uc = isr.read();
		// // System.out.println((char) uc);
		// String name = br.readLine();
		//
		// System.out.println("Enter ur Age?");
		// String ageString = br.readLine();
		// int age = Integer.parseInt(ageString);
		//
		// System.out.println(name + "\t" + age);
		//
		// } catch (IOException e) {
		// e.printStackTrace();
		// }

		// From JDK 1.5 , using Scanner

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ur Name?");
		String name = sc.nextLine();
		System.out.println("Enter ur Age?");
		int age = sc.nextInt();

		System.out.println(name + "\t" + age);

	}

}
