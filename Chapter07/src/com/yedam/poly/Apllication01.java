package com.yedam.poly;

public class Apllication01 {
	public static void main(String[] args) {
//		Child child = new Child();
		
		//자동타입변환
//		Parent parent = child;
		
		Parent parent = new Child();
		
		parent.field = "A";
		parent.method1();
		parent.method2();
		
		System.out.println("--------------");
		//child02 클래스 생성 후
		//하나의 객체로 다양한 형태로 만듦
		//자식2번 메소드 재정의
		parent = new Child02();
		parent.method1(); //자식2 메소드 출력
		parent.method2(); //자식1 메소드 출력
		
		
//		*다형성
//		부모클래스에 있는 내용을 사용하되, 자식클래스에 부모 메소드가 재정의(오버라이딩)되어 있으면 !!자식클래스!! 메소드를 사용
//		-> 자동타입변환을 활용해서 하나의 타입(부모)으로 다양한 형태, 객체의 모습을 만든다.
//		-> 많은 자식이 있다면 그 숫자만큼 다양한 형태, 객체의 모습을 만들 수가 있다.
//		===> 다형성
		
		
	}
}
