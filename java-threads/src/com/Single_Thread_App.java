package com;

import java.util.Scanner;

/*
 * App / Process 
 * 
 *  a. task-1 : get Name from user & greet him
 *  b. task-2 : print numbers from 1-100
 * 
 * 
 */

class Task1 {
	public void doTask1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ur Name");
		String name = sc.nextLine();
		System.out.println("Hello  " + name);
		sc.close();
	}
}

class Task2 {
	public void doTask2() {
		for (int i = 1; i <= 100; i++) {
			System.out.println("num - " + i);
		}
	}
}

public class Single_Thread_App {

	public static void main(String[] args) {

		System.out.println(Thread.currentThread().getName() + " start..");

		// step-1
		System.out.println(Thread.currentThread().getName() + " step-1..");
		Task1 task1 = new Task1();
		task1.doTask1();

		// step-2
		System.out.println(Thread.currentThread().getName() + " step2");
		Task2 task2 = new Task2();
		task2.doTask2();

		// step-3

		
		// .....
		System.out.println(Thread.currentThread().getName() + " other steps..");

	}

}
