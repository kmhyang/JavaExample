package com.yedam.Inter2;

public class DriverEx {
	public static void main(String[] args) {
		Driver driver = new Driver();
		Bus bus = new Bus();
		Taxi taxi  = new Taxi();
		
		driver.drive(bus);  //자동 타입 변환
		//Vehicle vehicle = bus;
		driver.drive(taxi);  //자동 타입 변환
		//instanceof -> taxi는 상속하지 않음 -> 출력X
	}
}
