package com.yedam.inheri;

public class Exam extends OverrideExam{

	//자식클래스
	@Override
	public void method1() {
		System.out.println("자식클래스 메소드1");
		super.method1();
//		super.method2();
	}
	
}
