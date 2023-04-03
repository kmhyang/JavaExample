package com.yedam.inheri;

public class DmbCellPhone extends CellPhone{
	//필드
	int channel;
	
	//생성자
	public DmbCellPhone(int channel, String color, String model) {
		//부모 생성자 실행 -> 부모 객체 생성 -> 자식 사용 O
		//부모클래스에 있는 생성자를 사용하는 키워드, super() : 매개변수가 있을 경우
		super(model, color);
		this.channel = channel;
	}
	//nethod
	public void turnOnDmb() {
		System.out.println("채널" +channel+"번 DMB 방송 수신");
	}

	public void turnOffDmb() {
		System.out.println("방송수신을 멈춥니다.");
	}
}
