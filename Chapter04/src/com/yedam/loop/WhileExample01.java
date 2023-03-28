package com.yedam.loop;

import java.util.Scanner;

public class WhileExample01 {
	public static void main(String[] args) {
		//1~100사이에서 2의 배수만 출력
		int i = 1;
		while(i<=100) {
			if(i%2 ==0) {
				System.out.println(i);
			}
			i++;
		}
		
		
		
//		
		Scanner sc = new Scanner(System.in);
//		
//		int menuNo=0;
//		while(menuNo != 4) {
//			System.out.println("1. 덧셈 | 2. 뺄셈 | 3. 곱셉 | 4. 종료");
//			System.out.println("메뉴선택>");
//			menuNo = sc.nextInt();
//			switch(menuNo) {
//			case 1:
//				System.out.println("덧셈 실행");
//				break;
//			case 2:
//				System.out.println("뺄셈 실행");
//				break;
//			case 3:
//				System.out.println("곱셉 실행");
//				break;
//			case 4:
//				System.out.println("프로그램 종료");
//				break;
//			}
//		}
//		
		//오락실
		int money;
		int menu = 0;
		System.out.println("===Insert Coin===;");
		money = sc.nextInt();
		//1)게임 1회 실생 시 금액 500원 차감
		//2)투입한 금액만큼만 반복분을 실행. 
		//3번 종료 + 게임을 할 수 없는 금액이면 반복문 종료
		//게임 몇번 남았는지 표시 ( 1500원 -> 3번의 기회가 남아있습니다.

//		while(menu != 3) {
		
		while(money/500>0) {
			System.out.println((money/500) + "번 기회가 남았습니다.");
			
			System.out.println("1. 가위바위보 | 2. 앞뒤 맞추기 | 3. 종료");
			System.out.println("입력하세요");
			menu = sc.nextInt();
			
			if(menu == 1) {
				System.out.println("가위바위보");
				money -= 500;
			}else if(menu == 2) {
				System.out.println("앞뒤맞추기");
				money -= 500;
			}else if(menu == 3) {
				System.out.println("종료");
				break;
			}else{
				System.out.println("없는 메뉴입니다.");
			}
		}
		
		
		int month;
		do {
			System.out.println("올바른 월을 입력하세요[1~12]");
			month = sc.nextInt();
		}while(month<1 || month>12);
		
		
		
		//break, continue
		//무한 루프 -> 항상 true => 반복문 계속 실행
		while(true) {
			int num = (int)(Math.random()*6)+1;
			if(num == 6) {
				System.out.println("while종료");
				break;
			}
		}
		
		//중첩 for 안에서 break;
		//break가 있는 반복문을 멈추는 것.
		for(int j=0; j<=10; j++) {
			for(int k=0; k<=10; k++) {
				if(j+k ==4) {
					System.out.println("j + k= " + (j+k));
					break;
				}
			}
		}
		//밖에 있는 중첩문 break, ex)라벨 붙이기
		Outter : for(char upper = 'A'; upper <= 'Z'; upper++) {
			for(char lower = 'a'; lower <= 'z'; lower++) {
				System.out.println(upper + "-" + lower);
				if(lower == 'g') {
					break Outter;
				}
			}
		}
		
		//continue
		//continue를 기준으로 반복문 재 실행
		//홀수만 출력
		for(int j = 0; j<=10; j++) {
			if(j%2 == 0) {
				continue;
			}
			System.out.println(j);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
