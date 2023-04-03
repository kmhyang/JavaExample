package com.yedam.Inter2;

public class Application {
	public static void main(String[] args) {
		A a = new B();
		a.info();
		a = new C();  //손자 -> B에 정의된 info를 상속받아 실행함.
		a.info();
	}
}
