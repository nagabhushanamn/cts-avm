package com;

import car.CarImpl;
import wheel.Wheel;
import wheel.ceat.CEATWheel;
import wheel.mrf.MRFWheelImpl;

public class DriveApp {

	public static void main(String[] args) {

		Wheel mrfWheel = new MRFWheelImpl();
		Wheel ceatWheel = new CEATWheel();

		CarImpl car1 = new CarImpl();
		
		car1.setWheel(mrfWheel);
		car1.move();
		
		car1.setWheel(ceatWheel);
		car1.move();
	}

}
