package com.yedam.oop;

public class Car {
	//필드 -> 객체의 정보

	String name;
	int price;
	String company = "현대자동차";
	
	
	//생성자
	//클래스 선언하면 자동으로 기본 생성자 추가해줌.
	//단, 생성자가 하나도 없을 경우에 자동 생성됨.
	
	//기본 생성자
	//public Car();
	
	//매개변수를 가지는 생성자
	//this : 자기 자신 - 클래스 Car에 있는 name
	public Car(String name) {
		//this.name = name;
		this(name,1000,"기아자동차"); //5번째 생성자가 실행됨 (생성자가 다른 생성자를 호출)
	}
	public Car(int price) {
		this.price = price;
	}
	public Car(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public Car(int price, String name) {
		this.name = name;
		this.price = price;
	}
	
	public Car(String name, int price, String company) {
		this.name = name;
		this.price = price;
		this.company = company;
	}
	
	
	
	//생성자 오버로딩
	// : 똑같은 이름(Car)을 가진 생성자를 여러개 만들 수 있다
	// : 매개변수를 다르게 해서 구분함 (타입, 개수, 순서)
	
	//메소드
}
