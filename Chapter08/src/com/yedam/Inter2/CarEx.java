package com.yedam.Inter2;

public class CarEx {
	public static void main(String[] args) {
		Car mycar = new Car();
		
		mycar.run();
		
		System.out.println("=========================");
		mycar.frontLeftTire = new KumhooTire();
		mycar.frontRightTire = new KumhooTire();
	
		mycar.run();
		
	}
}
