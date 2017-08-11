package com;

//-----------------------------------------------------------------------
interface Training {
	void logIn();

	void doLearn();
}
// -----------------------------------------------------------------------

abstract class AbstractTraining implements Training {
	@Override
	public void logIn() {
		System.out.println("log-in");
	}

}
// -----------------------------------------------------------------------

class JavaTraining extends AbstractTraining {

	@Override
	public void doLearn() {
		System.out.println("learn-java");
	}

}

class JSTraining extends AbstractTraining {

	@Override
	public void doLearn() {
		System.out.println("learn-JS");
	}
}

// -----------------------------------------------------------------------

public class Ex {

	public static void main(String[] args) {

		Training training = new JavaTraining();
		training.logIn();
		training.doLearn();

		training = new JSTraining();
		training.logIn();
		training.doLearn();

	}

}
