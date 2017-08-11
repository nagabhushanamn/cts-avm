package com.bike;

import com.wheel.Wheel;

public class Bike {

	private Wheel wheel;

	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}

	public void move() {
		wheel.rotate();
		System.out.println("Bike Moving...");
	}

}
