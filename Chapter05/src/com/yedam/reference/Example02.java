package com.yedam.reference;

import java.util.Scanner;

public class Example02 {
	public static void main(String[] args) {
		//String -> 변종
		String strVal1 = "yedam";
		String strVal2 = "yedam";
		
		//참조 타임의 ==는 데이터를 비교하는게 아니고 데이터가 참조하고 있는 주소, 객체 비교
		
		//String 주소 비교
		if(strVal1 == strVal2) {
			System.out.println("strVal1과 srtVal2는 메모리 주소 동일");
		}else {
			System.out.println("strVal1과 srtVal2는 메모리 주소 다름");
		}
		
		//문자열 간의 데이터 비교
		if(strVal1.equals(strVal2)) {
			System.out.println("strVal1과 srtVal2는 데이터 동일");
		}else {
			System.out.println("strVal1과 srtVal2는 데이터 다름");
		}
		
		//new 연산자를 활용해서 같은 주소, 객체인지 +데이터가 같은지 비교
		String strVal3 = new String("yedam");
		String strVal4 = new String("yedam");
		Scanner sc = new Scanner(System.in);
		
		if(strVal3 == strVal4) {
			System.out.println("strVal3과 srtVal4는 메모리 주소 동일");
		}else {
			System.out.println("strVal3과 srtVal4는 메모리 주소 다름");
		}
		
		if(strVal3.equals(strVal4)) {
			System.out.println("strVal3과 srtVal4는 데이터 동일");
		}else {
			System.out.println("strVal3과 srtVal4는 데이터 다름");
		}
		
		if(strVal2 == strVal3) {
			System.out.println("strVal1과 srtVal3는 메모리 주소 동일");
		}else {
			System.out.println("strVal1과 srtVal3는 메모리 주소 다름");
		}
		
		
		
		
		
		
		
		
		
	}
}
