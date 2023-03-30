package com.yedam.oop;

public class Application3 {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		//메소드 호출
		cal.sum(10,20);
		
		//매개변수 모를때 메소드 호출
		int result = cal.sum3(new int[] {1,2,3,4,5,6,7,8,9,10});
		System.out.println("sum3 : " + result);
		
		result = cal.sum4(1,2,3,4,5);
		System.out.println("sum4 : " + result);
		
		//리턴문 사용
		Bycle bycle = new Bycle();
		bycle.setGas(5);//메서드 이용해서 값 입력
		//외부 메서드 호출해서 사용
		
		boolean gasState = bycle.isLeftGas();
		if(gasState) {
			System.out.println("출발");
			bycle.run();
		}
		
		if(bycle.isLeftGas()) {
			System.out.println("gas 주입 필요 없음");
		}else {
			System.out.println("gas 주입 필요");			
		}
		
		//객체 외부에서 메서드 실행
		double result2 = cal.avg();
		System.out.println(result2);
		//메서드 실행 후 출력
		
		//오버로딩 실행
		double result3 = cal.areaRectangle(10);
		double result4 = cal.areaRectangle(10,20);
		System.out.println("정사각형 넓이 : "+result3);
		System.out.println("직사각형 넓이 : "+result4);
	
	}
}
