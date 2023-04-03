package com.yedam.exception;

public class Application2 {
	public static void main(String[] args) {
		try {
			findClass(); //메소드 실행
		}catch(ClassNotFoundException e) { //예외 발견
			e.printStackTrace(); //발생 오류 콘솔창으로 알려줌
			System.out.println("클래스가 존재하지 않습니다.");
		}
	}
	
	public static void findClass() throws ClassNotFoundException {
		Class clazz = Class.forName("java.lang.String2");
	}
}
