package com.yedam.variable;

public class Example02 {
	public static void main(String[] args) {
		//자동 타입 변환
		char charVal = 'A' + 1;
		System.out.println(charVal); //B
		int iVar = charVal;
		System.out.println(iVar); // = A 유니코드 값 = 65 + 1 = 66 출력
		double dVar = iVar;
		System.out.println(dVar); //66.0
		System.out.println();
		
		//강제 타입 변환
		iVar = (int)dVar;
		System.out.println(iVar); // 66.0 -> 66
		charVal = (char)iVar; 
		System.out.println(charVal); //'B' 
		System.out.println();
		
		double dVar2 = 3.144444;
		int iVar2 = (int)dVar2;
		System.out.println(iVar2); //3
		
		//자동 타입 변환을 활용한 연산
		byte result = 10 + 20;
		System.out.println(result);
		
		byte x = 10;
		byte y = 20;
//		byte result2 = x + y; //결과값 int로 변환되서 byte타입 result2에 넣을 수 없음
		int result2 = x+y;
		
		//강제 타입 변환
		byte result3 = (byte) (x+y);
		
		//데이터 타입 크기에 따른 연산
		//long + int = long
		//byte + int = int
		//double + int= double
		byte bVar = 10;
		int iVar1 = 100;
		long lVar = 1000;
		long result4 = bVar+iVar1+lVar;
		System.out.println();
		System.out.println(result4); 
		
		int iVal2 = 1;
//		double dVal3 = iVal2/2; //int 연산의 나눗셈이기 때문에 0.?? 이면 0으로 저장됨 //0으로 저장된 후 double로 타입변환되기 때문에 0.0 출력
		double dVal3 = (double) iVal2/2; //0.5 출력
		System.out.println(dVal3);
		
	}
}
