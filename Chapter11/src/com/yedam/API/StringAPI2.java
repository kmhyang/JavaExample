package com.yedam.API;

import java.util.Scanner;

public class StringAPI2 {
	public static void main(String[] args) {
		
		//문제 1] 문자열 뒤집기
		//입력 > "12345678"
		//출력 > "87654321"
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열 입력> ");
		String s1 = sc.nextLine();
		String s2="";
		for(int i=s1.length()-1; i>=0; i--) {
			char temp = s1.charAt(i);
			s2 += temp;
		}
		System.out.println(s2);
		

		//문제 2] 문자열 개수 세기
		// 입력되는 문자열을 뒤집어 출력하라
		// 알파벳, 숫자, 공백의 갯수
		int num = 0;
		int alp = 0;
		int spa = 0;
		System.out.println("문자열 입력> ");
		String s3 = sc.nextLine();
		for(int i=0; i<s3.length(); i++) {
			char temp = s3.charAt(i);
			if(temp == ' ') {
				spa++;
			}else if(temp >= 'a' && temp <='z') {
				alp++;
			}else if(temp >= '0' && temp <='9') {
				num++;
			}
		}
		System.out.println("알파벳 : "+alp+" 숫자 : "+num+" 공백 : "+spa);
		
		
		//문제 4] 생년월일 입력 후 나이 출력하기(220101 -> 2022년생, 230202 -> 1923년생)
		//        (단, 오늘 날짜 기준으로 생일이 지났으면 +1살, 안 지났으면 +0로 한다.)
		//        (올해 기준 +- 100살까지만 구한다.)
		//     예시) 
		//          입력> 950101 
		//          출력> 29
		//          입력> 001013
		//          출력> 23
		
		//1. 계산식(하드코딩)
		//1-1) 2000년 이후 2023년 이전 출생 : (23-태어난 년도)+1
		//1-2) 1922년 이후 2000년 이전 출생 : (123-태어난년도)
		
		
		
		
		//문제 5] 중복 문자 갯수 세기
		//입력> aaabbccceedddd
		//출력> a 3개, b 2개, c 3개, e 2개, d 4개
		
		//데이터를 입력 -> 중복 문자가 몇개~~?
		//a~z : 26개
		//배열 인덱스 -> 0~25개의 크기를 가지는 배열
		// 0 : a,, 1 : b,, 2 : c.... 25 : z

		//아스키 코드
		//a = 97
		//b = 98
		//b - 97 = 1
		//1 => 인덱스
		//a- 97 = 0
		//0 => 인덱스
		//문자열 입력
		System.out.println("문자열 입력> ");
		String s6 = sc.nextLine();
		int alpAry[] = new int[26];
		
		for(int i=0; i<s6.length(); i++) {
			char temp1 = s6.charAt(i);
			alpAry[temp1 - 'a']++;
		}
		for(int i=0; i<alpAry.length; i++) {
			if(alpAry[i] != 0 ) {
				System.out.println((char)(97+i) + " " + alpAry[i]+"개");
			}
		}
		
	}
}
