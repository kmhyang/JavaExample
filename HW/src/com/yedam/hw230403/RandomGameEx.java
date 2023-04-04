package com.yedam.hw230403;

import java.util.Scanner;

public class RandomGameEx {
	
	//다형성을 활용해서 Keypad 인터페이스 활용 
	//-> Random값에 따라 게임 모드가 바뀌기 때문에
	//자주 쓰는 기능 함수로 꺼내서 사용
	public static Keypad getRandomGame() {
		Keypad game = null;
		
//		1) 프로그램을 실행할 경우 50% 확률로 두 개의 게임 중 하나가 셋팅된다.
//		   ( RPGgame or ArcadeGame )
		int random = (int) (Math.random() * 2 + 1);
		switch(random) {
		case 1:
			game = new RPGgame();
			break;
		case 2:
			game = new ArcadeGame();
			break;
		}
		return game;
		//Keypad 반환
	}

	public static void main(String[] args) {

		boolean run = true;
		Scanner sc = new Scanner(System.in);

		Keypad game = getRandomGame();
		//랜덤값이 1일때 2일때 모드 선택마다 출력값이 달라짐

		while (run) {
			System.out.println(
					"============================================================================================");
			System.out.println(
					"<< 1.LeftUP | 2.LeftDown | 3.RightUp | 4.RightDown | 5.ModeChange | 0.GameChange | 9.EXIT >>");
			System.out.println(
					"============================================================================================");
			System.out.print("choice>>");
			int menuNo = Integer.parseInt(sc.nextLine());
			
			switch (menuNo) {
			case 1:
				game.leftUpButton();
				break;
			case 2:
				game.leftDownButton();
				break;
			case 3:
				game.rightUpButton();
				break;
			case 4:
				game.rightDownButton();
				break;
			case 5:
				game.changeMode();
				break;
			case 0:
				game = getRandomGame();
//				if(game instanceof RPGgame) {
//					game = new ArcadeGame();
//				}else if(game instanceof ArcadeGame) {
//					game = new RPGgame();
//				}
				//랜덤으로 실행하지 않을 경우. 모드 전환
				break;
			case 9:
				System.out.println("EXIT");
				run = false;
				break;
				//예외처리
			default:
				System.out.println("메뉴를 잘못 선택하였습니다.");
			}
		}
	}
}
