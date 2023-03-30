package com.yedam.access;

public class Access {
//	필드, 메소드, 클래스 인터페이스 접근 가능 여부 -> 접근 제한자
//	public : 어디서든 누구나 다 접근 가능
//	protected : 상속 관계 - 부모의 필드, 메소드 -> 자식이 사용할 수 있게 해줌(패키지가 달라도 사용 가능). 같은 패키지 내에서만 사용 가능, 상속관계만 상관 없음
//	default : 같은 패키지에서만 접근 가능
//	private : 내가 속한 클래스에서만 사용 가능
	
	//필드
	public String free;
	protected String parent;
	String basic;
	private String privacy;
	
	//생성자에 접근 제한자 -> 객체를 생성하는 "범위"를 조절
	public Access() {
		//어디서든 객체를 생성할 수 있다.
	}
	
	protected Access(int a) {
		//같은 패킺, 자식클래스에서 사용할 수 있다.
	}
	
	Access(String s){
		//같은 패키지에서만 객체 생성할 수 있다.
	}
	
	private Access(double e) {
		//객체 생성 금지.
	}
	
	//메소드
	public void instead() {
		info(); //info 기능을 대신 실행시켜줌(껍데기만 보여주고 sysout 코드는 안 보여줌)
	}
	
	//캡슐화, 정보은닉을 위해서 private 사용 필요
	private void info() {
		System.out.println("private 메소드");
	}
	
	protected void parend() {
		System.out.println("protected 메소드");
	}
	
	void basic() {
		System.out.println("default 메소드");
	}
	
	
}
