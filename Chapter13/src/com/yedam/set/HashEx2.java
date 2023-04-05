package com.yedam.set;

import java.util.HashSet;
import java.util.Set;

public class HashEx2 {
	public static void main(String[] args) {
		Set<Member> set = new HashSet<>();
		
		set.add(new Member("또치",10));
		set.add(new Member("또치",1000));
		//new : 새로운 공간에 생성함 ---> 주소가 다름(HastCode가 다름)
		//Member클래스에서 hashcode 재정의 -> 데이터가 같으면 주소가 같아짐
		//->동등한, 같은 객체가 됨 -> 중복 다중 저장 안됨 //1개만 저장
		
		//이름만 객체비교 할 경우 나이는 달라도 같은 객체로 봄
		
		System.out.println("총 객체 수 : "+set.size());
		
		
		
	}
}
