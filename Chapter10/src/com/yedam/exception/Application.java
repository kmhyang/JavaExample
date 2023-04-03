package com.yedam.exception;

import java.sql.SQLException;

public class Application {
	public static void main(String[] args) {
		String data1 = null;
		String data2 = null;
		
		
		try {
			//예외가 발생할 것 같은 실행코드
//			data1 = args[0];
//			data2 = args[1];
			
//			double avg = 1/0;
			
//			String str = "자바";
//			int a = Integer.parseInt(str);
			
			Class clazz = Class.forName("java.lang.String2");
			
//		}catch(ArrayIndexOutOfBoundsException e) {
//			//예외 발생 후 처리하는 코드
//			System.out.println("실행 매개값 수가 부족합니다.");
//		}catch(ArithmeticException e) { //----------1번째 catch 실행 후 아니면 2번째 catch문 실행
//			//예외 발생 후 처리하는 코드
//			System.out.println("0으로 나눌 수 없습니다.");
//		}catch(NumberFormatException e) { //----------2번째 catch 실행 후 아니면 3번째 catch문 실행
//			//예외 발생 후 처리하는 코드
//			System.out.println("문자열 변환 에러");
//		}catch(ClassNotFoundException e) { //----------3번째 catch 실행 후 아니면 4번째 catch문 실행
//			//예외 발생 후 처리하는 코드
//			System.out.println("클래스를 찾을 수 없습니다.");
//		}
		}catch(Exception e) { //----------모든 예외처리 못하면 처리하는 구문
			//예외 발생 후 처리하는 코드
			System.out.println("위에서 처리 못하면 내가 처리한다");
			//-- 특별한 구문을 가지고 있는 예외처리? 코드?는 구분할 수 없음.
		}finally {
			//옵션
			//try, catch문 실행 후 !!!무.조.건!!! 실행해야 하는 코드
			System.out.println("finally 항상 실행");
		}
	}
}
