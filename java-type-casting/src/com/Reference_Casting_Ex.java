package com;

class Vehicle {}
class Car extends Vehicle{}
class Bike extends Vehicle{}

public class Reference_Casting_Ex {

	public static void main(String[] args) {

//		Car car=new Car();
//		Bike bike=new Bike();
//		
//		int a=12;
		
//		Vehicle vehicle=new Car(); // implicit reference casting
//		vehicle=new Bike();
		
		
		Vehicle vehicle=new Bike();
		
		if(vehicle instanceof Car){
			Car car=(Car)vehicle;
			System.out.println("Happy driving....");
		}else{
			System.out.println("No Drive");
		}
		
		
		
	}

}
