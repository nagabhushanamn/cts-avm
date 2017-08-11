package com;

import com.bike.Bike;
import com.car.Car;
import com.wheel.MRFFourWheelImpl;
import com.wheel.MRFTwoWheelImpl;

public class App {

	public static void main(String[] args) {

		Bike bike = new Bike();
		bike.setWheel(new MRFTwoWheelImpl());
		bike.move();

		Car car = new Car();
		car.setWheel(new MRFFourWheelImpl());
		car.move();

	}

}
