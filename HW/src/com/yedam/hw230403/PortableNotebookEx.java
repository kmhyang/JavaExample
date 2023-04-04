package com.yedam.hw230403;

public class PortableNotebookEx {
	public static void main(String[] args) {
		//클래스에 메소드 재정의 O -> 인터페이스랑 상관없이 클래스 자체를 객체로 만들어서 사용
		//자동타입변환 사용X, 다형성X
		PortableNotebook pn = new PortableNotebook("한글2020", "크롬", "영화", "안드로이드앱");
		pn.writeDocumentation();
		pn.watchVideo();
		pn.useApp();
		pn.searchInternet();
			
	}
}
