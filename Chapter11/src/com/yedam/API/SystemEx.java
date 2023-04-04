package com.yedam.API;

public class SystemEx {
	public static void main(String[] args) {
		
		//System class
		
//		for(int i=0; i<=10; i++) {
//			System.out.println(i);
//			if(i==5) {
//				System.exit(0);
//				//5까지만 출력하고 강제종료 됨
//				//exit : static으로 지정됨 -> 모든 전역에서 사용 가능
//				//최대한 쓰지말라
//			}
//		}
//		System.out.println("마무리코드");
		
		
		
		//현재 시간 읽기
		long time1 = System.nanoTime();
		int sum=0;
		for(int i=0; i<=1000000; i++) {
			sum += i ;
		}
		long time2 = System.nanoTime();
		
		System.out.println(time1);
		System.out.println(time2);
		System.out.println("1~1000000까지의 합 : " + sum);
		System.out.println("계산에 "+(time2-time1)+"나노초가 소요되었습니다.");
		
		System.out.println(System.currentTimeMillis());
		
		
	}

}
