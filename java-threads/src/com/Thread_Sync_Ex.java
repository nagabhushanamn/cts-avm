package com;

class PlayWork implements Runnable {

	public static void doPlay() {
		String name = Thread.currentThread().getName();
		System.out.println(name + "- start");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(name + "- end");
	}

	@Override
	public void run() {
		doPlay();
	}

}

public class Thread_Sync_Ex {

	public static void main(String[] args) {

		PlayWork work = new PlayWork();

		Thread thread1 = new Thread(work, "A");
		Thread thread2 = new Thread(work, "B");

		thread1.start();
		thread2.start();

	}

}
