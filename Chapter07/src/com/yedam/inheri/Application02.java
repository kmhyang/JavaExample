package com.yedam.inheri;

public class Application02 {
	public static void main(String[] args) {
		DmbCellPhone dmb = new DmbCellPhone(1, "white", "애플");
		DmbCellPhone dmb2 = new DmbCellPhone(2, "black", "삼성");
		
		System.out.println(dmb.model);
		System.out.println(dmb2.model);
		
		//부모클래스 메소드 사용
		dmb.powerOn();
		dmb.powerOff();
		dmb.bell();
		dmb.hangUp();
		
		//자식클래스 메소드 사용
		dmb.turnOnDmb();
		dmb.turnOffDmb();
		
		
		//오버라이딩 메소드 재정의
		System.out.println();
		Compute com = new Compute();
		com.areaCircle(10.1);
		
		Exam exam = new Exam();
		exam.method1();
		exam.method2();
		System.out.println();
		
		
		//AirPlane
		SuperSonicAirPlane sa = new SuperSonicAirPlane();
		//sa -> flyMode가 normal인 상태로 객체 생성
		
		sa.takeoff();
		
		sa.fly();
		
		sa.flyMode = SuperSonicAirPlane.SUPERSONIC;
		
		sa.fly();
		
		sa.flyMode = SuperSonicAirPlane.NORMAL;
		
		sa.fly();
		
		sa.land();
		
		
		
		
		
		
		
		
	}
}
