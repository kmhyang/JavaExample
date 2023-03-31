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
			
			int num = Integer.parseInt(sc.nextLine());
			
			while(run) {
				if(num == 1) {
					studentNum = num;
					scores = new int[studentNum];
				}else if(num == 2) {
					for(int i=0; i<scores.length; i++) {
						System.out.println("점수를 입력하세요");
						scores[i] = Integer.parseInt(sc.nextLine());
						System.out.println(scores[i]);
					}
				}else if(num == 3) {
					for(int i=0; i<scores.length; i++) {
						System.out.println(scores[i]);
					}
				}else if(num == 4) {
					int sum=0;
					int avg=0;
					int max = scores[0];
					for(int i=0; i<scores.length; i++) {
						sum += scores[i];
					}
					avg = sum/scores.length;
					for(int i=0; i<scores.length; i++) {
						if(scores[i] < max) {
							max = scores[i];
						}
					}
					System.out.println((double) avg);
					System.out.println(max);
					
				}else if(num == 5) {
					System.out.println("종료");
					break;
				}
			}
			
		}
	}
}
