package com.yedam.Inter2;

public class InterEx {
	public static void main(String[] args) {
		InterfaceC ic = new Implements();
		ic.methodA();
		ic.methodB();
		ic.methodC();
		//3개 메소드 모두 실행 가능
		System.out.println("==================");
		
		
		InterfaceB ib = new Implements();
		ic.methodB();
		
		System.out.println("==================");
		InterfaceA ia = new Implements();
		ic.methodA();
		
		
	}
}
