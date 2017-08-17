package com;

class CountBox {
	private long count = 0;

	public synchronized void incCount() {
		this.count = this.count + 1; // read --> inc --> write
	}

	public long getCount() {
		return count;
	}
}

public class Thread_RaceCondition_Ex {

	public static void main(String[] args) throws InterruptedException {

		CountBox countBox = new CountBox();

		Runnable r = new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 10000; i++) {
					countBox.incCount();
				}
			}
		};

		Thread[] threads = new Thread[1000];

		for (int i = 0; i < 1000; i++) {
			threads[i] = new Thread(r);
			threads[i].start();
		}

		for (int i = 0; i < 1000; i++) {
			threads[i].join();
		}

		System.out.println(countBox.getCount()); // 10000 * 10000 ==> 100000000

	}

}
