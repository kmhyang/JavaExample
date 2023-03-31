package com.yedam.practice;

import java.util.Scanner;

public class p02 {
	public static void main(String[] args) {
		
		//주어진 배열을 이용하여 다음 내용을 구현하세요.
		int[] arr1 = { 10, 20, 30, 50, 3, 60, -3 };
		
		//문제1. 주어진 배열 중에서 값이 60인 곳의 인덱스를 출력해보자.
		for(int i=0; i<arr1.length; i++) {
			if(arr1[i] == 60) {
				System.out.println(i);
			}
		}

		
		//문제2. 주어진 배열의 인덱스가 3인 곳은 출력하지 말고, 나머지만 출력해보자.
		for(int i=0; i<arr1.length; i++) {
			if(i != 3) {
				System.out.print(arr1[i]+ " ");
			}
		}
		System.out.println();

		
		//문제3. 주어진 배열 안의 변경하고 싶은 값의 인덱스 번호를 입력받아, 그 값을 1000으로 변경해보자.
  		//   입력) 인덱스: 3 ->   {10, 20, 30, 1000, 3, 60, -3}
		Scanner sc = new Scanner(System.in);
		System.out.println("변경할 인덱스 입력> ");
		int cdIndex = sc.nextInt();
		arr1[cdIndex-1] = 1000;
		for(int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i] + " ");
			if(i == (cdIndex)){
				continue;
			}
		}System.out.println();

		
		//문제4. 주어진 배열의 요소에서 최대값과 최소값을 구해보자.
		int max = arr1[0];
		int min = arr1[0];
		for(int i =0; i<arr1.length; i++) {
			if(max < arr1[i]) {
				max = arr1[i];
			}
		}
		for(int i =0; i<arr1.length; i++) {
			if(min > arr1[i]) {
				min = arr1[i];
			}
		}
		
		//문제5. 별도의 배열을 선언하여 양의 정수 10개를 입력받아 배열에 저장하고, 배열에 있는 정수 중에서 3의 배수만 출력해보자.
		
		int arr2[] = new int[10];
		System.out.println("10개 값 입력> ");
		for(int i=0; i<arr2.length; i++) {
			arr2[i] = sc.nextInt();
		}
		for(int i=0; i<arr2.length; i++) {
			if(arr2[i] %3 == 0) {
				System.out.print(arr2[i]+", ");
			}
		}System.out.println();
		System.out.println("-----------------------");
		
		//문제6.
		//아래의 내용을 확인하요 채워 넣으세요.
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] copyArray = new int[3];
		for (int i = 0; i < array.length; i++) {
			int j = (int) (Math.random() * array.length);
			int tmp = 0;
			tmp = array[i];
			array[i] = array[j];
			array[j] = tmp;
			/*
			 * (1) . 알맞은 코드를 넣어 완성하시오
			 * 배열 array의 임의의 값 j를 활용하여 현재위치와 j의 위치를 바꾼다.
			 */
		}
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
		System.out.println("-----------");
		
		
		
//		/* (2) */
//		// array->copyArray 배열 복사하는데, 0번째부터 2번째까지 총 3개만 복사
		System.arraycopy(array, 0, copyArray, 0, 3);
		for (int i = 0; i < copyArray.length; i++) {
			System.out.print(copyArray[i]+" ");
		}
		System.out.println();
		System.out.println("-----------");
		
		
		
//		//문제7.
//		//알파벳 'A'-'Z'까지 반복문을 활용하여 배열에 입력하고, 하나의 문자를 입력 받아
//		//그 문자가 어느위치에 있는지 출력하시오.
		char[] arr3 = new char[26];
		for(int i=0; i<arr3.length; i++) {
			arr3[i] = (char)('A'+i);
		}
		for(int i=0; i<arr3.length; i++) {
			System.out.print(arr3[i]+" ");
		}
		System.out.println();
		System.out.println("-----------");

	}
}


