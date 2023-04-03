package com.yedam.inter;

public class RemoteEx {
	public static void main(String[] args) {
		RemoteControl rc;  // 인터페이스활용
		rc = new Audio();
		rc = new Television();
		System.out.println("------------");
		
		rc.turnOn();  //RemoteControl 인터페이스로 연결되어 있음
		rc.setVolume(5);
		rc.setVolume(12);
		rc.setVolume(-5);
		//-5 : 최소 볼륨이 0이기 때문에 0으로 출력 ->데이터 무결성을 지켜줌
		rc.turnOff();
		
		System.out.println("------------");
		SmartTv tv = new SmartTv();
		
		//2개의 인터페이스를 상속 = tv
		RemoteControl rc2 = tv;

		rc2.turnOn();
		rc2.setVolume(4);
		rc2.turnOff();
		//rc2.search("naver");
		System.out.println("------------");
		
		Searchable search = tv;  //자동타입변환
		
		search.search("www.naver.com");
		search.turnOff();
		search.setVolume(8);
		search.turnOn();
	}
}
