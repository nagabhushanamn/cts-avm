package com;

class Employee {

	String name;

	public Employee(String name) {
		super();
		this.name = name;
	}

	public static void doTeach() {
		synchronized (Employee.class) {
			String name = Thread.currentThread().getName();
			System.out.println(name + " Teaching....start");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name + " Teaching...end");
		}

	}

	private static Object key1 = new Object();
	private static Object key2 = new Object();

	public void doListenJava() {
		synchronized (key1) {
			System.out.println(name + " Listening Java....start");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name + " Listening Java...end");
		}
	}

	public void doListenJS() {
		synchronized (key2) {
			System.out.println(name + " Listening JS....start");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name + " Listening JS...end");
		}
	}
}

public class Thread_Sync_Ex3 {

	public static void main(String[] args) {

		//
		//
		// Runnable teachRunnable = new Runnable() {
		// @Override
		// public void run() {
		// Employee.doTeach();
		// }
		// };
		//
		// Thread thread1 = new Thread(teachRunnable, "Tnr1");
		// thread1.start();
		//
		// Thread thread2 = new Thread(teachRunnable, "Tnr2");
		// thread2.start();

		// -----------------------------------------------

		Employee employee1 = new Employee("Emp1");
		Employee employee2 = new Employee("Emp2");

		Runnable listenJavaRunnable = new Runnable() {
			@Override
			public void run() {
				employee1.doListenJava();
			}
		};

		Runnable listenJSRunnable = new Runnable() {
			@Override
			public void run() {
				employee2.doListenJS();
			}
		};

		Thread thread1 = new Thread(listenJavaRunnable);
		thread1.start();

		Thread thread2 = new Thread(listenJavaRunnable);
		thread2.start();

		Thread thread3 = new Thread(listenJSRunnable);
		thread3.start();

	}

}
