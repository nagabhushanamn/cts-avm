package com;

/*
 *   How to implement MT in java ?
 *   
 *   --> by implementing 'Runnable' interface
 *   --> by extending 'Thread' class
 *   
 * 
 */

class Work implements Runnable {

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		System.out.println(name + " working...");
	}

}

public class Multi_Thread_App {

	public static void main(String[] args) {

		String name = Thread.currentThread().getName();
		System.out.println(name + " start");

		Work target = new Work();
		Thread thread = new Thread(target,"T1");
		thread.start();

		System.out.println(name + "cont....");

	}

}
