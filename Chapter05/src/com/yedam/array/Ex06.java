package com.yedam.array;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner sc = new Scanner(System.in);
		
		while(run){
			System.out.println("---------------------------");
			System.out.println("1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료");
			System.out.println("---------------------------");
			System.out.println("선택> ");
			
			int selectNo = Integer.parseInt(sc.nextLine());
			
			if(selectNo==1) {
				System.out.println("학생수 입력하세요");
				studentNum = Integer.parseInt(sc.nextLine());
				scores = new int[studentNum];
				System.out.println("학생수> "+ scores.length);
				
			}else if(selectNo==2) {
				for(int i=0; i<scores.length; i++) {
					System.out.println("점수 입력하세요");
					scores[i] = Integer.parseInt(sc.nextLine());
					System.out.println("scores["+i+"]"+"> "+ scores[i]);
				}
			}else if(selectNo==3) {
				for(int i=0; i<scores.length; i++) {
					System.out.println("scores["+i+"]"+"> "+ scores[i]);
				}
			}else if(selectNo==4) {
				int sum = 0;
				int avg = 0;
				int max = scores[0];
				for(int i=0; i<scores.length; i++) {
					sum += scores[i];
				}
				avg = sum/scores.length;
				for(int i=0; i<scores.length; i++) {
					if(max < scores[i]) {
						max = scores[i];
				}
				System.out.println("최고점수: " + max);
				System.out.println("평균점수: " + (double) avg);
				}
			}else if(selectNo==5) {
				System.out.println("프로그램 종료");
				break;
			}
		}
	}
}
