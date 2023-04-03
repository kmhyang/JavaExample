package com.yedam.Inter2;

public class Bus implements Vehicle{
	@Override
	public void run() {
		System.out.println("버스");
	}

	public void checkFare() {
		System.out.println("버스 요금");
	}

}
