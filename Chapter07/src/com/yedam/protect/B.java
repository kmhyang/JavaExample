package com.yedam.protect;

public class B {
	public void method() {
		A a = new A();
		a.field = "접근가능";
		a.method();
		// protected 접근제한자 : 같은 패키지에서 사용 가능
		//->다른패키지에서는 상속을 받아야 사용 가능.
	}
}
