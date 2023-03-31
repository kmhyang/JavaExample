package com.yedam.oop;

import java.util.Scanner;

public class Appli_Stu {
	public static void main(String[] args) {		
//	클래스 + 배열 => Student[] ary = new Student[10] -> 10개 공간에 학생 객체를 저장
//	int + 배열 -> int[] ary = new int[10]; 10공간에 정수
	
//	1. 학생들 수 | 2. 학생들 정보 입력 | 3. 학생들 총점, 평균 | 4. 종료
//	클래스 S 객체로 만들기
//	s1 ~ s10 : 학생 -> 배열
//	Student 객체 배열 -> 학생 5명
		
	Scanner sc = new Scanner(System.in);
	int stdCount = 0;
	Student[] stdAry = null;
	
	while(true) {
		System.out.println("1. 학생들 수 | 2. 학생들 정보 입력 | 3. 학생들 총점, 평균 | 4. 종료");
		System.out.println("메뉴를 입력하세요");
		String num = sc.nextLine();
		
		if(num.equals("1")) {
			System.out.println("학생수를 입력하세요");
			stdCount = Integer.parseInt(sc.nextLine());
			
		}else if(num.equals("2")){
			stdAry = new Student[stdCount];
			for(int i=0; i<stdAry.length; i++) {
				stdAry[i] = new Student();
				
				System.out.println("학생이름을 입력하세요");
				String name = sc.nextLine();
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
			
		}else if(num.equals("3")){
			for(int i=0; i<stdAry.length; i++) {
				System.out.println("총 점 : "+stdAry[i].sum());
				System.out.println("총 점 : "+stdAry[i].avg());
			}
			
		}else if(num.equals("4")){
			System.out.println("프로그램 종료");
			
		}else{
			System.out.println("숫자를 다시 입력하세요");
		}
	}
	}
}
