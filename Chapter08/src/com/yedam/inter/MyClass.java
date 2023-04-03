package com.yedam.inter;

import java.rmi.Remote;

public class MyClass {
	//인터페이스를 사용하는 위치
	
	//1. 필드
	RemoteControl rc = new Television();
	
	//2. 생성자
	public MyClass() {
		
	}
	
	public MyClass(RemoteControl rc) {
		//ex) rc = new Audio(),,, rc = new Television()
		this.rc = rc;
		this.rc.turnOn();
		this.rc.turnOff();
	}
	
	
	//3. 메소드
	public void methodA() {
		//메소드가 실행되면서 자동타입변환
		RemoteControl rc = new Audio();
		rc.turnOff();
		rc.turnOn();
	}
	
	public void methodB(RemoteControl rc) {
		//매개변수로 받아와서 바로 실행
		rc.turnOff();
		rc.turnOn();
	}
	
	
	
	
}
