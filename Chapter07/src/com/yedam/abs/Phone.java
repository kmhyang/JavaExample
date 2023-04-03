package com.yedam.abs;

public abstract class Phone {
	//필드
	public String owner;
	
	//생성자
	public Phone(String owner) {
		this.owner = owner;
	}
	
	//매소드
	public void turnOn() {
		System.out.println("폰 전원을 켭니다.");
	}
	
	
	//추상메소드 : 상속받은 실체클래스(자식클래스) 에서 반드시!!! 구현해야하는 기능
	public abstract void turnOff();
	
}
