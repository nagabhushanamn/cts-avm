package com.car;

import com.wheel.Wheel;

public class Car {

	Wheel wheel;

	public void setWheel(Wheel w) {
		this.wheel = w;
	}

	public void move() {
		wheel.rotate();
		System.out.println("Car Moving..");
	}

}
