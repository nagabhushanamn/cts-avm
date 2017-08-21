package com.pattern.singleton;

import java.io.Serializable;

public final class Boss implements Serializable {

	// private static Boss boss = new Boss(); // simple & Eager-Instantiation
	private static Boss boss = null;

	private Boss() {
		System.out.println("New Boss-Instance created..");
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}

	public Object readResolve() {
		System.out.println("Executing readResolve");
		return Boss.getInstance();
	}

	public static Boss getInstance() {
		String name = Thread.currentThread().getName();
		// System.out.println(name + " getting boss instance..");
		if (boss == null) {
			synchronized (Boss.class) {
				// System.out.println(name + " in sync block");
				if (boss == null) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					// System.out.println(name + " creating instance");
					boss = new Boss(); // Lazy..
				}
			}
		}
		return boss;
	}

}
