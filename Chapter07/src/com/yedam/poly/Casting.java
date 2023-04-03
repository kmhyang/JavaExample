package com.yedam.poly;

public class Casting {
	
	//method(매개변수를 활용한 다형성
	public static void method1(Parent parent) {
		//p1이 Parnet로 만들어졌는지 확인
		if(parent instanceof Child) {
			Child child = (Child)parent;
			System.out.println("캐스팅 성공");
		}else {
			
			System.out.println("캐스팅 실패");
		}
	}
	
	
	
	
	public static void main(String[] args) {
		Parent p1 = new Child();   //자동타입변환
		
		Child child = (Child)p1;   //강제타입변환
		

		//강제타입변환 한 p1이 위 메소드에 매개변수 대입해서 instanceof 실행
		method1(p1);
		
		
	
	}
}
