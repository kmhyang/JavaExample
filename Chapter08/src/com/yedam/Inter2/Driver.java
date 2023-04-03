package com.yedam.Inter2;

public class Driver {
	public void drive(Vehicle vehicle) {
		if(vehicle instanceof Bus) {
			Bus bus = (Bus) vehicle;
			//vehicle.run();
			bus.run();
			bus.checkFare();
		}
	}
}
