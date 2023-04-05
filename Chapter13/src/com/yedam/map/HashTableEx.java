package com.yedam.map;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashTableEx {
	public static void main(String[] args) {
		Map<String, String> map = new Hashtable<>();
		
		Scanner sc = new Scanner(System.in);
		
		//임의 아이디/비밀번호
		map.put("String", "12");
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12345");
		
		while(true) {
			System.out.println("아이디 입력>");
			String id = sc.nextLine();
			System.out.println("비밀번호 입력> ");
			String pw = sc.nextLine();
			
			if(map.containsKey(id)) {
				if(map.get(id).equals(pw)) { //key 값: id에 있는 데이터를 가져와서 비교함
					System.out.println("로그인 성공");
					break;
				}else {
					System.out.println("비밀번호 불일치");
				}
			}else {
				System.out.println("아이디 불일치");
			}
			
		}
		
		
		
		
		
		
		
		
	}
}
