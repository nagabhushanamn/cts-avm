package com;

import java.time.LocalTime;

class TimeWork implements Runnable {

	@Override
	public void run() {
		while (true) {
			LocalTime localTime = LocalTime.now();
			System.out.println(localTime.getHour() + ":" + localTime.getMinute() + ":" + localTime.getSecond());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}

public class Thread_Sleep_Ex {

	public static void main(String[] args) throws InterruptedException {

		Thread timerThread = new Thread(new TimeWork());
		timerThread.start();

	}

}
