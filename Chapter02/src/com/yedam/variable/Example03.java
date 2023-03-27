package com.yedam.variable;

public class Example03 {

	public static void main(String[] args) {
		//문자열 + 연산(자동타입변환)
		int value = 10+2+8;
		System.out.println("value : " + value);
				
		String str1 = 10+2+"8";
		System.out.println("str1 : " + str1);
		String str2 = 10 + "2" + 8;
		System.out.println("str2 : " + str2);
		String str3 = "10" + (2+8);
		System.out.println("str3 : " + str3);
		
		//문자열 강제 타입 변환
		String iNo = "10";
		String bNo = "8";
		String dNo = "3.322";
		
		int sNo = Integer.parseInt(iNo);
		int sNo2 = Byte.parseByte(bNo);
		double sNo3 = Double.parseDouble(dNo);
		
		System.out.println("int 변환 : " + iNo + "\nbyte 변환 : " + bNo + "\ndouble 변환 : " + dNo);
		
		String str5 = String.valueOf(sNo);
		String str6 = String.valueOf(sNo2);
		String str7 = String.valueOf(sNo3);
		System.out.println(str5 + str6 + str7); // 문자열로 변환되어서 문자를 합친 값을 출력
		
	}

}
