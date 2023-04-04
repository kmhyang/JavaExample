package com.yedam.hw230403;

public class KeypadEx {
	public static void main(String[] args) {
		//자식 클래스가 바뀔때마다 바로 부모 인터페이스에 적용될 수 있도록 해야 함.
		Keypad game = new RPGgame();
		
		game.leftUpButton();
		game.rightUpButton();
		game.changeMode();
		game.rightUpButton();
		game.rightDownButton();
		game.leftDownButton();
		game.changeMode();
		game.rightDownButton();
		
		System.out.println("===================");
		
		game = new ArcadeGame();
		game.leftUpButton();
		game.rightUpButton();
		game.leftDownButton();
		game.changeMode();
		game.rightUpButton();
		game.leftUpButton();
		game.rightDownButton();
	}
}
