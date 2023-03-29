package com.yedam.array;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		//배열 크기 
		Scanner sc = new Scanner(System.in);
		int[] ary;
		int no;
		
//		ary = new int[10];
//		System.out.println(ary.length);
		
		System.out.println("배열의 크기 입력>");
		no = sc.nextInt();
		
		//입력받은 값을 배열의 크기로 사용
		ary = new int[no];
		System.out.println("배열의 크기 : " + ary.length);
		//ary.length 배열의 크기만큼 반복문 실행
		for(int i= 0; i<ary.length; i++) {
			System.out.println("입력>");
			ary[i] = sc.nextInt();
		}

		for(int i=0; i<ary.length; i++) {
			System.out.println("arr["+i+"] :" + ary[i]);
		}
	}
}
