package com;
//

//class X {
//
//	public synchronized static void write() {
//		String name = Thread.currentThread().getName();
//		System.out.println(name + " in write()");
//		System.out.println("write()-start");
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		System.out.println("write()-end");
//	}
//
//	public synchronized static void read() {
//		String name = Thread.currentThread().getName();
//		System.out.println(name + " in read()");
//		System.out.println("read()-start");
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		System.out.println("read()-end");
//	}
//
//}

//------------------------------------------
//
//class Y {
//
//	public synchronized void write() {
//		String name = Thread.currentThread().getName();
//		System.out.println(name + " in write()");
//		System.out.println("write()-start");
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		System.out.println("write()-end");
//	}
//
//	public synchronized void read() {
//		String name = Thread.currentThread().getName();
//		System.out.println(name + " in read()");
//		System.out.println("read()-start");
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		System.out.println("read()-end");
//	}
//
//}

//--------------------------------------------------

class Z {

	static Object key = new Object();

	public void write() {
		synchronized (key) {
			String name = Thread.currentThread().getName();
			System.out.println(name + " in write()");
			System.out.println("write()-start");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("write()-end");
		}

	}

	public void read() {
		synchronized (key) {
			String name = Thread.currentThread().getName();
			System.out.println(name + " in read()");
			System.out.println("read()-start");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("read()-end");
		}
	}

}

public class Thread_Sync_Ex2 {

	public static void main(String[] args) {
		//
		// Y y1 = new Y();
		// Y y2 = new Y();

		Z z1 = new Z();
		Z z2 = new Z();

		Runnable r1 = new Runnable() {
			@Override
			public void run() {
				// y1.write();
				z1.write();
			}
		};
		Runnable r2 = new Runnable() {
			@Override
			public void run() {
				// y2.read();
				z2.read();
			}
		};

		Thread thread1 = new Thread(r1, "A");
		Thread thread2 = new Thread(r1, "B");
		Thread thread3 = new Thread(r2, "C");

		thread1.start();
		thread2.start();
		thread3.start();
	}

}
