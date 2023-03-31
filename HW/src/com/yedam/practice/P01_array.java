package com.yedam.practice;

import java.util.Scanner;

public class P01_array {
	public static void main(String[] args) {
	int score = (int)(Math.random()*60)+40;
	System.out.println(score);
	
	if(score > 60) {
		System.out.println("합격");
	}else {
		System.out.println("불합격");
	}
	
	//=>삼항연산자로
	String sam = (score > 60) ? "합격" : "불합격";
	System.out.println(sam);
	
	int value = 123;
	String name = "상품";
	double price=1000.00;
	
	System.out.println("%d\n"+value);
	System.out.println("%s\n"+name);
	System.out.println("%f\n"+price);
	
	value = 11;
	System.out.printf("%d\n", value); //11
	System.out.printf("%6d\n", value); //    11
	System.out.printf("%-6d\n", value); //11
	System.out.printf("%06d\n", value); //000011
	
	price = 321.4567;
	System.out.printf("%f\n", price); //321.456700
	System.out.printf("%10.2f\n", price); //    321.45
	System.out.printf("%-10.2f\n", price);//321.46
	System.out.printf("%010.2f\n", price); //0000321.46
	
	int var1 = 0b1011; //2진수(0b)
	int var2 = 0206; //8진수(0)
	int var3 = 365;  //10진수
	int var4 = 0xB3; //16진수(0x)
	
//	byte bVal = -128;
//	byte bVal2 = 0;
//	byte bVal3 = 127;
	int bVal4 = 500;
	
	long lVal3 = 1000000000L;
	
	
	float fVal = 3.14f;
	//double
	double dVal = 3.14;
	
	char charVal = 'A' + 1;
	System.out.println(charVal); //B
	int iVar = charVal;
	System.out.println(iVar); // = A 유니코드 값 = 65 + 1 = 66 출력
	double dVar = iVar;
	System.out.println(dVar); //66.0
	System.out.println();
	
	byte x = 10;
	byte y = 20;
//	byte result2 = x + y; //결과값 int로 변환되서 byte타입 result2에 넣을 수 없음
	int result2 = x+y;
	
	

	}
}
