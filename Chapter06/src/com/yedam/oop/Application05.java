package com.yedam.oop;

import java.util.Scanner;

public class Application05 {
	public static void main(String[] args) {
//		클래스 + 배열 => Student[] ary = new Student[10] -> 10개 공간에 학생 객체를 저장
//		int + 배열 -> int[] ary = new int[10]; 10공간에 정수
		
//		1. 학생들 수 | 2. 학생들 정보 입력 | 3. 학생들 총점, 평균 | 4. 종료
//		클래스 S 객체로 만들기
//		s1 ~ s10 : 학생 -> 배열
//		Student 객체 배열 -> 학생 5명
		
		Scanner sc = new Scanner(System.in);
		int stdCount = 0;
		Student[] stdAry = null;
		
		while(true) {
			System.out.println("1. 학생 수 | 2. 학생들 정보 입력 | 3. 학생들 총점, 평균 | 4. 종료");
			System.out.println("메뉴입력> ");
			String selectNo = sc.nextLine();
			
			if(selectNo.equals("1")) {
				System.out.println("학생수 입력> ");
				stdCount = Integer.parseInt(sc.nextLine());
			}else if(selectNo.equals("2")) {
				//입력받은 학생 수 만큼 배열 생성
				stdAry = new Student[stdCount];
				for(int i=0; i<stdAry.length; i++) {
					stdAry[i] = new Student();
					
					//학생들의 정보를 입력하는 공간
					//객체를 생성하고 객체를 정보에 저장한 다음 -> 배열에 보관
					System.out.println("학생 이름> ");
					String name = sc.nextLine();
					//stdAry[0] = s1
					//= s1.stdName
					stdAry[i].stdName = name;
					
					System.out.println("국어 성적> ");
					int kor = Integer.parseInt(sc.nextLine());
					stdAry[i].kor = kor;
					
					System.out.println("수학 성적> ");
					int math = Integer.parseInt(sc.nextLine());
					stdAry[i].math = math;
					
					System.out.println("영어 성적> ");
					int eng = Integer.parseInt(sc.nextLine());
					stdAry[i].eng = eng;
				}
				
			}else if(selectNo.equals("3")) {
				for(int i=0; i<stdAry.length; i++) {
					System.out.println(stdAry[i].stdName+"의 학생 성적");
					//System.out.println(stdAry[i].kor + stdAry[i].eng + stdAry[i].math);
					System.out.println("총 점 : "+ stdAry[i].sum());
					System.out.println("평균  : "+ stdAry[i].avg());
				}
				
			}else if(selectNo.equals("4")) {
				System.out.println("프로그램 종료");
				break;
			}else {
				System.out.println("없는 메뉴입니다. 다시 입력하세요.");
			}
		}
	}
}

