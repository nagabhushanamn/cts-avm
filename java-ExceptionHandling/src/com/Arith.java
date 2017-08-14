package com;

import java.util.Scanner;

public class Arith {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Num1");
		int num1 = sc.nextInt();

		System.out.println("Enter Num2");
		int num2 = sc.nextInt();

		sc.close();

		// -------------------------------

		// 1.Add
		System.out.println(num1 + num2);

		// 2. Sub
		System.out.println(num1 - num2);

		// 3. Div
		System.out.println(num1 / num2);

		// 4. Mul
		System.out.println(num1 * num2);

		System.out.println("i am happy with arith");

	}

}
