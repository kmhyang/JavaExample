package com.yedam.API;

import java.io.UnsupportedEncodingException;

public class StringAPIEx {
	public static void main(String[] args) {
		//byte[] -> String 변환
		byte[] bytes = {72,101,108,108,111,32,74,97,118,97};
		
		String str1 = new String(bytes);
		System.out.println(str1);
		
		
		//원하는 위치선정(6), 갯수만큼(4) 추출
		String str2 = new String(bytes,6,4);
		System.out.println(str2);
		
		System.out.println();
		//charAt()
		//인덱스 값(문자위치) 입력해서 해당 위치에 있는 문자를 가져올 때 사용
		String ssn = "010645-156843";
		char gender = ssn.charAt(7);
		System.out.println(gender);
		

		switch (gender) {
		case '1':
		case '3':
			System.out.println("남자");
			break;
		case '2':
		case '4':
			System.out.println("여자");
			break;
		}
		
		System.out.println();
		
		//문자열 비교
		String str3 = "kim";
		String str4 = "kim";
		String str5 = new String("kim");
		
		if(str3.equals(str4)) {
			System.out.println("같은 문자열");
		}else {
			System.out.println("다른 문자열");
		}
		if(str3.equals(str5)) {
			System.out.println("같은 문자열");
		}else {
			System.out.println("다른 문자열");
		}
		
		//스트링 -> 바이트 변환
		System.out.println("===========");
		String str6 = "helloworld";
		byte[] byte1 = str6.getBytes();
		for(byte temp : byte1) {
			System.out.println(temp);
		}
		
		//byte -> String
		String str7 = new String(byte1);
		System.out.println(str7);
		
		
		System.out.println();
		//byte <->String + encoding type
		//UTF-8, MS949...	
		try {
			//String -> byte + EUC-KR
			byte[] byte2 = str6.getBytes("EUC-KR");
			System.out.println("byte2 length : "+byte2.length);
			
			for(byte temp : byte2) {
				System.out.println(temp);
			}
		//byte -> String
			String str8 = new String(byte2, "EUC-KR");
			System.out.println(str8);
			
			
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		
		System.out.println();
		//문자열 찾기
		//indexof
		String subject = "자바 프로그래밍";
		int index = subject.indexOf("그래밍");
		int index1 = subject.indexOf("그래미");
		System.out.println(index);
		System.out.println(index1);

		
	
		System.out.println();
		//String 길이
		System.out.println(subject.length());
		
		String ssn2 = "000011-391935";
		if(ssn2.length() == 14) {
			System.out.println("주민번호 자리 수 맞음");
		}else {
			System.out.println("주민번호 자리 수 틀림");
		}
		
		
		System.out.println();
		//문자열 대치(바꾸기)
		String oldStr = "자바 프로그래밍";
		String newStr = oldStr.replace("자바", "Java");
		System.out.println(newStr);

		
		
		
		System.out.println();
		//문자열 자르기
		//매개변수에 따라서 자르는 방법이 다름
		//1) 매개변수 한개일 때 -> 해당 위치로부터 뒤로 다 자름
		String ssn3 = "123456-1234567";
		String firstnum = ssn3.substring(7);
		System.out.println(firstnum);
		
		//2) 매개변수 2개 일 때 -> 시작위치~ 끝나는 위치-1까지 자름
		String secondNum = ssn.substring(0,6);
		System.out.println(secondNum);
		
		//대문자 -> 소문자
		String dae = "ABCDEF";
		System.out.println(dae.toLowerCase());
		
		String so = "abcdef";
		System.out.println(so.toUpperCase());
		
		
		//양쪽 공백 제거 trim
		String name = "  kim   ";
		System.out.println(name.trim());
		
		//기본타입 -> 문자열 변환
		String temp = String.valueOf(123);
		temp = String.valueOf(true);
		System.out.println(temp);
		
		//문자열 분리하기
		//split()
		String value = "1,2,3,4,5,6,7,8,9";
		String[] ary = value.split(",");
		
		for(String data : ary) {
			System.out.print(data);
		}System.out.println();
		
		//contains -> 포함하고 있는 문자열 확인
		String var = "또치";
		if(var.contains("또")) {
			System.out.println("또 포함됨");
		}else {
		System.out.println("또 포함X");
		}
		
		System.out.println();
		//isEmpty
		String empty = "";
		if(empty.isEmpty()) {
			System.out.println("공백O");
		}else {
			System.out.println("공백X");
		}

		
		
		System.out.println();
		//String 단점을 보완해줄 수 있는 API
		//Stringbuffer
		//StringBilder
		StringBuilder sb = new StringBuilder();
		sb.append("ye");
		sb.append("dam");
		System.out.println(sb);
		
		
	}
}
