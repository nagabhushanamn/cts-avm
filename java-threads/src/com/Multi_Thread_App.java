package com;

class Work implements Runnable {

	public void doWork() {
		String name = Thread.currentThread().getName();
		System.out.println(name + " working...");
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + "+ start");
		doWork();
	}
}

public class Multi_Thread_App {

	public static void main(String[] args) {

		System.out.println(Thread.currentThread().getName() + "- start");

		Work work = new Work();
		Thread thread = new Thread(work, "mythread");
		thread.start(); // new-stack..
		System.out.println(Thread.currentThread().getName() + "- created new-thread");

		System.out.println(Thread.currentThread().getName() + " - cont with other work");

	}

}
