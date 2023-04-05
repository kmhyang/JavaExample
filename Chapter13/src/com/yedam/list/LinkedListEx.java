package com.yedam.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new LinkedList<>();
		
		long startTime;
		long endTime;
		
		//list1 = Arraylist 처리 속도
		startTime = System.nanoTime();
		for(int i=0; i<100000; i++) {
			list1.add(0,String.valueOf(i));
			//0번째 인덱스에 데이터 추가해줌
			//모든 인덱스 이동.
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList 걸리는 시간 : "+(endTime-startTime)+ "ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100000; i++) {
			list2.add(0,String.valueOf(i));
			//0번째 인덱스에 데이터 추가해줌
			//모든 인덱스 이동.
		}
		System.out.println("LinkedList 걸리는 시간 : "+(endTime-startTime)+ "ns");
		
		
		//추가 삭제 수정이 많을경우 LinkedList 속도가 훨씬 빠름
	}
}
