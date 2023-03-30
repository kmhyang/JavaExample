package com.yedam.oop;

public class BookApp {
	public static void main(String[] args) {
		Book book = new Book("혼자공부하는자바", 24000, "한빛미디어");
		book.getInfo();
		
		//클래스 객체(힙 주소값이 저장되어 있음) = 인스턴스 생성
		Student student = new Student();
		student.getInfo();

	}
}
