package com.yedam.array;

public class Ex10_oldnew {
	public static void main(String[] args) {
		//참조 배열
		String[] strArray = new String[3];
		strArray[0] = "yedam";
		strArray[1] = "yedam";
		strArray[2] = new String("yedam");
		
		System.out.println(strArray[1] == strArray[2]); //주소가 다름 false
		System.out.println(strArray[0] == strArray[1]); //주소가 같음 true
		System.out.println(strArray[0].equals(strArray[2])); //true
		
		//배열 복사
		int[] oldArray = {1,2,3};
		
		int[] newArray = new int[5];
		for(int i=0; i<oldArray.length; i++) {
			newArray[i] = oldArray[i];
		}
		
		for(int i=0; i<newArray.length; i++) {
			System.out.println(newArray[i]);
			//복사한 값 출력
		}
		System.out.println("------------------------");
		int[] oldArray2 = {1,2,3,4,5,6,7,8};
		int[] newArray2 = new int[10];
		
		System.arraycopy(oldArray2, 0, newArray2, 0, oldArray2.length);
		//(					원본, 복사할 위치, 복사될 배열, 복사될 위치, 복사할 길이)
		
		for(int i=0; i<newArray2.length; i++) {
			System.out.println(newArray2[i]);
		}
		
		//향상된 for문 (for of)
		System.out.println("------------------------");
		//배열 값을 변수에 복사
		//배열과 같은 데이터 타입을 맞춰줘야 함.
		for(int temp : newArray2) {
			System.out.println(temp+"\t");
		}
	}
}
