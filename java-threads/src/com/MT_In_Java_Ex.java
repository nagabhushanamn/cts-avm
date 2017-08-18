package com;

// way-1
class Worker extends Thread {

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		System.out.println(name + " working..");
	}

}

// way-2
class Workk implements Runnable {

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		System.out.println(name + " working..");
	}

}

public class MT_In_Java_Ex {

	public static void main(String[] args) {

		Worker worker1 = new Worker();
		worker1.start();

		Worker worker2 = new Worker();
		worker2.start();

		// -----------------------------

		// Worker worker3 = new Worker(); // Runnable + Thread object
		Workk work = new Workk(); // Runnable

		Thread thread1 = new Thread(work);
		thread1.start();

	}

}
