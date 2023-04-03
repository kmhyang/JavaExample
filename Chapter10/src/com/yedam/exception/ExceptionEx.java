package com.yedam.exception;

public class ExceptionEx {
	public static void main(String[] args) {
		//NullPointException
//		String data = null;
//		System.out.println(data.toString());
		
//		Example example = null;
//		System.out.println(example.toString());
		
		//ArrayIndexOutOfBoundsException
		int[] intAry = new int[3];
		
		intAry[2] = 3;
//		intAry[4] = 2;
//		
//		for(int i=0; i<intAry.length; i++) {
//			System.out.println(intAry[i]);
//		}
		
		
		
		//NumberFormatException
		String str = "123";
		int val = Integer.parseInt(str);
		System.out.println(val);  // 
		
		
//		String str2 = "자바";
//		val = Integer.parseInt(str2);
//		System.out.println(val);
		
		
		
		//ClassCastException
		//자동타입변환 된 객체를 강제타입 변환할 때 발생
//		Example exam = new Ex();
//		Ex exam02 = (Ex) exam;
		
		//예외케이스
//		Example ex2 = new Ex();
//		Ex02 exam03 = (Ex02) ex2;
		
		
		
		
		//classNotFound Exception -> class 파일 찾지 못할 때
		//실행메소드(main) 못 찾을때 자주 발생
		//오른쪽 클릭 ->run as ->run as configuration
		
		
		
		
		//ArithmeticException -> 분모가 0일때
		//double a = 1/0;
		
		
		
		
		//반복문을 종료하지 못하고 무한 루프 등
		//OutofMemberError-> 메모리가 부족할 때
		//메모리 누수, memory leak
		
		
		
		
		//IOException->입출력 오류
		//file reading/write
		
		
		
		
		//FileNotFoundException
		//Java -> file reading ->경로가 안 맞아서 파일을 못 참음. 
		
		
		
		
		
	}
}
