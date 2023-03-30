package com.yedam.oop;

public class Book {
	 //book이라는 클래스는 아래의 정보를 가집니다.
	//책이름,책종류, 가격, 도서번호, 출판사
	//필드
	String name;
	String type;
	int price;
	String isbn;
	String company;
	
	//생성자 3개 생성
	//1) 기본 생성자
	public Book() {
		
	}
	//2) 모든 데이터를 초기화 할 수 있는 생성자 = 모든 매게변수 받아옴★
	public Book(String name,String type,int price,	String isbn,String company) {
		this.name = name;
		this.type = type;
		this.price = price;
		this.isbn = isbn;
		this.company = company;
		
	}
	//3) 책이름, 책가격, 도서번호를 받아오는 생성자
		
	public Book(String name, int price, String isbn) {
		this.name = name;
		this.price = price;
		this.isbn = isbn;
		
	}
	
	//메소드 getInfo() 메소드 가짐.
	//getInfo : 메소드를 클래스 외부에서 실행하였을 때, 다음과 같은 출력물이 나오도록 구현
	//객체.getInfo()

	void getInfo() {
		System.out.println("책이름 : " + name);
		System.out.println("종류 : " + type);
		System.out.println("넘버 : " + isbn);
		System.out.println("가격 : " + price);
		System.out.println("출판사 : " + company);
	}
	
	//책이름 : 혼자 공부하는 자바
	// 내용
	//1) 종류 :  학습서
	//2) 가격 : 24000
	//3) 출판사 : 한빛미디어
	//4) 도서번호 : yedam001
	
	//책이름 : HTML
	// 내용
	//1) 종류 :  학습서
	//2) 가격 : 15000
	//3) 출판사 : 길벗
	//4) 도서번호 : yedam002
	
	//책이름 : JavaScript
	// 내용
	//1) 종류 :  학습서
	//2) 가격 : 20000
	//3) 출판사 : 길벗
	//4) 도서번호 : yedam003
	
}
