package com.yedam.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExStu {
	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<>();
		
		map.put(new Student(1, "김또치"),95);
		map.put(new Student(1, "김또치"),95);
		//new : 새로운 공간에 생성함 ---> 주소가 다름(HastCode가 다름)
		//Student클래스에서 hashcode 재정의 -> 데이터가 같으면 주소가 같아짐
		//->동등한, 같은 객체가 됨 -> 중복 다중 저장 안됨 //1개만 저장
		
		System.out.println("총 Entry 수 : "+map.size());
		
		
	}
}
