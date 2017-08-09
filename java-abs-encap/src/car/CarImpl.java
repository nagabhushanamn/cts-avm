package car;

import wheel.Wheel;

//dependent ----> HAS-A ---> dependency

public class CarImpl {

	private Wheel wheel;

	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}

	public void move() {
		wheel.rotate();
		System.out.println("Car Moving....");

	}

}
