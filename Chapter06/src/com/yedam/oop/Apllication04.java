package com.yedam.oop;

public class Apllication04 {
	
	//int a = 1; 
	//으로 정의하면 main문에서 a 출력할 수 없음
	//(메소드 필드 먼저 실행하는데 인스턴스 메소드는 아직 실행 전이라서 출력할 수 없음)
	//static으로 바꿔야지 선언해서 사용할 수 있음
	static int a = 1;
	
	static void info() {
		System.out.println("info 출력");
	}
	int field1;
	
	
	
	
	//메소드 영역에 포함되어 있는 정적 메소드, main문
	public static void main(String[] args) {
		System.out.println(a);
		info();
		
		Apllication04 temp = new Apllication04();
		temp.field1 = 1;
		System.out.println(StaticCal.PI);
		System.out.println(StaticCal.EARTH_RADIUS);
		//공유해서 사용 가능
		
		int result = StaticCal.plus(10,20);
		
		StaticCal cal = new StaticCal();
		//cal.PI; -> 인스턴스 필드가 아님, static 필드임
		
		//StaticCal.PI = 10; -> main 힙 영역에서 메소드에는 접근 못함
		
	}
}
