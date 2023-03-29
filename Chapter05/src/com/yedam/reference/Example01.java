package com.yedam.reference;

public class Example01 {
	public static void main(String[] args) {
		//stack 영역에 intVal 생성되어 10이라는 데이터가 저장
		int intVal = 10;
		
		//참조타입 -> 힙 주소값이 저장됨
		//스택 영역에 array 생성 (참조 : [I@4493d195)되고 다음과 같은 주소가 저장되어 있다.
		int[] array = {1,2,3,4,5,6};
		int[] array2 = {1,2,3,4,5,6};
		int[] array3 = null;
		
		System.out.println(array);
		System.out.println(array2);
		System.out.println(array == array2); //false : 저장된 메모리 주소값이 다름
//		System.out.println(array3); //초기화 되지 않아서 오류 뜸(int[] array3;)
//		System.out.println(array3.length); //null 값 넣은 후// nullpointer~
		
		
		
		
		
		
		
	}
}
