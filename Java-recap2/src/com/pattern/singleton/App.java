package com.pattern.singleton;

public class App {

	public static void main(String[] args) {

		// ---------------------------------------
		// in mod-1
		// Boss boss1 = new Boss();

		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				Boss boss = Boss.getInstance();
			}
		}, "T1");
		thread1.start();

		// ---------------------------------------

		// ---------------------------------------
		// in mod-2
		// Boss boss2 = new Boss();
		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				Boss boss = Boss.getInstance();
			}
		}, "T2");
		thread2.start();

		// ---------------------------------------

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// ---------------------------------------
		// in mod-3
		// Boss boss2 = new Boss();
		Thread thread3 = new Thread(new Runnable() {
			@Override
			public void run() {
				Boss boss = Boss.getInstance();
			}
		}, "T3");
		thread3.start();

		// ---------------------------------------

	}

}
