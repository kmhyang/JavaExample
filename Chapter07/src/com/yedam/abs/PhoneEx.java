package com.yedam.abs;

public class PhoneEx {
	public static void main(String[] args) {
		
		//생성자 틀대로 변수 입력해줘야 함.
		Phone p1 = new SmartPhone("박또치");
		
		System.out.println(p1.owner);
		p1.turnOn();
		p1.turnOff();
	}
}
