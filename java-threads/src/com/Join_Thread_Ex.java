package com;

class TeachWork implements Runnable {

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		System.out.println(name + " working in stud doubt...");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(name + " this is ans for your doubt");
	}

}

class LearnWork implements Runnable {

	@Override
	public void run() {

		String name = Thread.currentThread().getName();

		System.out.println(name + " learning....");
		System.out.println(name + " got doubt, joining tnr");

		Thread tnrThread = new Thread(new TeachWork(), "Nag");
		tnrThread.start();

		try {
			tnrThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(name + " hey thanks tnr , for ans..");

	}

}

public class Join_Thread_Ex {

	public static void main(String[] args) {

		Thread studThread = new Thread(new LearnWork(), "Jasdeep");
		studThread.start();

	}

}
