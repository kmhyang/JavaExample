package com.yedam.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {
	public static void main(String[] args) {
		//String 문자열을 넣을 수 있는 ArrayList
		List<String> list = new ArrayList<String>();
		
		//list 데이터 추가
		list.add("Java");  //인덱스 0 객체 추가
		list.add("JDBC");  //인덱스 1 객체 추가
		list.add("Servlet/JSP");  //인덱스 2 객체 추가
		
		list.add(2,"DataBase"); //->인덱스 2에 추가되고 JSP는 한칸 뒤로 밀려서 인덱스 3이 됨
		list.add("iBatis");
		
		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);  //해당 인덱스 데이터를 리턴해줌 -> str에 넣어줌
			System.out.println(i+" : "+str);
		}System.out.println("===============");
		
		//향상된 for
		for(String str : list) {
			System.out.println(str);
		}
		
		System.out.println("===============");
		list.remove(2);
		for(String str : list) {
			System.out.println(str);
		}
		
		System.out.println("==========저장된 객체로 삭제");
		//저장된 객체로 삭제
		list.remove("JDBC");
		for(String str : list) {
			System.out.println(str);
		}
		
		
		System.out.println("=========clear=====");
		list.clear();
		System.out.println("list 사이즈 : "+list.size());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
