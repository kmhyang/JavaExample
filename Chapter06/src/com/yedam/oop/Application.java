package com.yedam.oop;

public class Application {
	//실행용도
	public static void main(String[] args) {
		//heap에 s1 = 클래스 SmartPhone에 저장된 모든 값 사용 가능
		SmartPhone s1 = new SmartPhone();
		
		//"""객체가 생성되면서 실행"""
		
		//s1 객체 정보 대입
		s1.name = "아이폰";
		s1.maker = "애플";
		s1.price = 12000;
		
		
		//s1 객체 메소드 사용
		//"""나는 getInfo의 메소드다"""
		s1.getInfo();
		
		System.out.println(s1.name);
		System.out.println(s1.maker);
		System.out.println(s1.price);
		
		System.out.println("------------------");
		SmartPhone s2 = new SmartPhone();
		System.out.println(s2.name); //String 초기값 : null
		System.out.println(s2.maker); //String 초기값 : null
		System.out.println(s2.price); //Int 초기값 : 0 
	}
}
