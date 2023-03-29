package com.yedam.array;

public class Ex05 {
	public static void main(String[] args) {
		//최대값의 인덱스 구하기
		int[] array = {10,50,70,20,30,80,40};
		int max = array[0];
		int maxno = 0;
		
		for(int i=0; i<array.length; i++) {
			if(max < array[i]) {
				max = array[i];
				maxno = i;
			}
		}
		System.out.println("최대값 : " + max + " 최대값 index : " + maxno);
	}
}
