package com.yin.beans;

public class Robot extends Vehicle {

	public Robot() {
		drivable = new Drivable();
		flyable = new Flyable();
	}
	public void drive() {
		drivable.drive();
	}
	
	public void fly() {
		flyable.fly();
	}
	@Override
	public void honk() {
		System.out.println("Robot honk");
	}

}
