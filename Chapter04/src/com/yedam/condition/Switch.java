package com.yedam.condition;

import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		int number = (int)(Math.random()*6)+1;
		System.out.println(number);
		
		// ex) number =5
		switch(number) {
			case 1:
				System.out.println("1번 나옴");
				break;
			case 2:
				System.out.println("2번 나옴");
				break;
			case 3:
				System.out.println("3번 나옴");
				break;
			case 4:
				System.out.println("4번 나옴");
				break;
			case 5:
				System.out.println("5번 나옴");
				break;
			default:
				System.out.println("6번 나옴");
				break;
		}
		
		// 성적 확인
		char grade= 'B';
		
		switch(grade) {
		case 'A':
			System.out.println("A학점 취득");
			break;
		case 'B':
			System.out.println("B학점 취득");
			break;
		case 'C':
			System.out.println("C학점 취득");
			break;
		case 'D':
			System.out.println("D학점 취득");
			break;
		}
		
		// 문자열 활용한 switch문
		String position = "과장";
		switch(position) {
		case "부장":
			System.out.println("성과금 : 1000만원");
			break;
		case "차장":
			System.out.println("성과금 : 500만원");
			break;
		case "과장":
			System.out.println("성과금 : 300만원");
			break;
		default:
			System.out.println("성과금 : 100만원");
			break;
		}
		
		//입력한 성적을 등급으로 환산
		Scanner sc = new Scanner(System.in);
		System.out.println("성적입력>");
		int score = sc.nextInt(); //입력값 정수로 변환
		//100점
		//90점 이상 A
		//80~89 B
		//70~79 C
		//60~69 D
		//switch문만 활용		
		
		switch(score/10) {
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8: 
			System.out.println("B");
			break;
		case 7: 
			System.out.println("C");
			break;
		case 6: 
			System.out.println("D");
			break;
		default: 
			System.out.println("F");
		}
		
		
	}
}