package com.yedam.API;

import java.util.HashMap;

public class ObjectEx {
	public static void main(String[] args) {
		Member member = new Member("123");
		Member member2 = new Member("123");
		Member member3 = new Member("321");
		
		System.out.println(member.equals(member2));  //member1 vs member2 비교 ---true
		System.out.println(member.equals(member3));  //member1 vs member3 비교 ---false
		System.out.println(member2.equals(member3));  //member2 vs member3 비교 ---false
		
		
		System.out.println("===============");
		//Hashcode 예제
		HashMap<Key, String> hashMap = new HashMap<>();
		
		hashMap.put(new Key(1), "홍길동");
		
		String value = hashMap.get(new Key(1));
		
		System.out.println(value);
		//--
		//Key 클래스에서 해시코드 재정의하면 원래는 다른 주소에 저장되어 있지만 
		//new Key(1) 문자열이 같아서 해시코드가 같아짐 ===> 값이 같아져서 실행됨

		
		
		System.out.println("===============");
		HashMap<Member, String> hashMap2 = new HashMap<>();
		
		hashMap2.put(new Member("열쇠"), "또치");
		
		String value2 = hashMap2.get(new Member("열쇠"));
		System.out.println(value2);
		//new Member("열쇠") : "열쇠" 문자가 같아서 같은 해시코드를 가지게 됨 -> value = "또치"가 됨
		
		
	}
}
