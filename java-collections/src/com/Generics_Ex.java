package com;

class Subject {
}

class Java extends Subject {
}

class JS extends Subject {
}

class Trainer<T extends Subject> {

	T subject;

	public Trainer(T subject) {
		super();
		this.subject = subject;
	}

	public T getSubject() {
		return subject;
	}

}

public class Generics_Ex {

	public static void main(String[] args) {

		Trainer<Java> javaTrainer = new Trainer<Java>(new Java());
		Trainer<JS> jsTrainer = new Trainer<JS>(new JS());

		// ----------------------------------------

		// javaTrainer.subject = new JS();
		// jsTrainer.subject = new Java();

		// ----------------------------------------

		// in java class-room

		Java java = javaTrainer.getSubject();
		System.out.println("Happy learning...java");

		// in JS class-room
		JS js = jsTrainer.getSubject();
		System.out.println("Happy learning...js");

		// Trainer<String> trainer = new Trainer<String>("string");

	}

}
