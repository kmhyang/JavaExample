package com.yedam.condition;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		// 랜덤 값 추출
		// Math.random() -> 0 =< Math.random() < 1 : 실수
		// 범위 : 0~1, 0.1111, 0.44444,,,
		
		// 40~99 사이 데이터를 랜덤 추출
		//  0 <= Math.random() <1
		// 1) 0*60 <= Math.random()* 60 < 1*60
		// 2) 0 + 40 <= Math.random()*60 + 40 < 60 + 40 (40이 시작점)
		// 3) (int) 40 <= (int)Math.random()*60+40 < 100
		// 40에서 99까지 값 도출
		
		int score = (int)(Math.random()*60)+40; //실수를 정수로 바꿔주는 작업
		
		System.out.println(score); //값이 계속 바뀜
		if(score >= 60) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
		
		// 위 내용 삼항연산자로 바꾸기
		String pass = (score>=60) ? "합격" : "불합격";
		System.out.println(pass);
		
		//성적
		// 90이상: A, 90~80: B, 80~70: C, 70 미만: D
		if(score >= 90) {
			pass = "A";
		} else {
			if(score >= 80 ) {
				pass = "B";
			} else {
				if(score >= 70) {
					pass = "C";
				} else {
					pass = "D";
				}
			}
		}
		
		// if-else문
		if(score >= 90) {
			pass="A";
		} else if(score>=80) {
			pass= "B";
		} else if(score>=70) {
			pass = "C";		
		} else {
			pass = "D";
			
		// if-else와 Math.random() 합체해서 나타내기
		// ex) 주사위 숫자
		// 1) random 값 구하기
		// 0 <= Math.random() <1
		// 0*6 <= Math.random()*6 <1*6
		// 0+1 <= Math.random()*6+1 < 6+1
		// (int)1 <= (int)Math.random()*6+1 < (int) 7
		
		int number = (int)(Math.random()*6)+1;
		
		if(number == 1) {
			System.out.println("1번 나옴");
		} else if(number ==2) {
			System.out.println("2번 나옴");
		} else if(number ==3) {
			System.out.println("3번 나옴");
		} else if(number ==4) {
			System.out.println("4번 나옴");
		} else if(number ==5) {
			System.out.println("5번 나옴");
		} else {
			System.out.println("6번 나옴");
		}
		
		// Scanner 활용
		Scanner sc =new Scanner(System.in);
		
		System.out.println("알파벳 입력");
		
		String alp = sc.nextLine();
		//String을 char로 변형할 때 쓰는 것
		char alpabet = alp.charAt(0); //알파벳 중에서 맨 첫글자 의미('알')
		// 'A'(65) ~ 'Z'(90)
		// '0'(48) ~ '9'(57)
		System.out.println(alpabet);
		
		if(alpabet >= 65 && alpabet <= 90) {
			System.out.println(alp + "는 대문자입니다.");
		} else if(alpabet >= 97 && alpabet <= 122) {
			System.out.println(alp + "는 소문자입니다.");
		} else {
			System.out.println("입력한 문자는 대,소문자가 아닙니다.");
		}
		
		
		
		
	}	
	}
}