package com.yedam.inter;

public class MyClassEx {
	public static void main(String[] args) {
		System.out.println("1)--------------------");
		//클래스 내부에 인터페이스를 활용해서 필드로 선언
		MyClass myClass1 = new MyClass();
		
		myClass1.rc.turnOn();
		myClass1.rc.turnOff();
		
		
		System.out.println("2)--------------------");
		
		MyClass myClass2 = new MyClass(new Audio());
		//new Audio() 라는 매개변수를 넣어서 생성자 통해서 실행할 수 있음
		
		System.out.println("3)--------------------");
		
		MyClass myClass3 = new MyClass();
		myClass3.methodA();
		
	
		System.out.println("4)--------------------");
		MyClass myClass4 = new MyClass();
		myClass4.methodB(new Television());
		myClass4.methodB(new Audio());
		
		
	}
}
