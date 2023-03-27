package com.yedam.variable;

public class JavaVariable {
	public static void mait(String[] args) {
		//vi 변수 생성 후 15 값을 초기화
		int v1 = 15;
		
		if(v1>10) {
			int v2 = v1 - 10;
		}
//		int v3 = v1 + v2;
		//v2는 if절에서만 사용 가능 -> 오류
		
//		int v4;
// 		v1 = v1+v4;
//		v4 : 초기값X -> 오류 발생
	}
//	v1 = 10;
	//v1은 main에 종속된 변수이기 때문에 중괄호 벗어나면 사용X
}
