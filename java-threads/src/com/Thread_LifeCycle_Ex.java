package com;

class CountWork implements Runnable {
	
	// ==> RUNNING
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		for (int i = 0; i < 500; i++) {
			System.out.println(name + "-->" + i);  // ( RUNNING ==> NOT-READY-TO-RUN (sleep,wait,blocked)) can't predict
		}
		
		// ==> DEAD
	}
}

public class Thread_LifeCycle_Ex {

	public static void main(String[] args) {

		CountWork cw = new CountWork();

		Thread thread1 = new Thread(cw,"A");  // NEW
		Thread thread2 = new Thread(cw,"B");

		thread1.start();  // NEW ===> READY-TO-RUN ( Runnable )
		thread2.start();

		String name = Thread.currentThread().getName();
		for (int i = 0; i < 500; i++) {
			System.out.println(name + "-->" + i);
		}

	}

}
