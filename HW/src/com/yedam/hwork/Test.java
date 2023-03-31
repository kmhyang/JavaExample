package com.yedam.hwork;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		
//	1.	
		int a = 10;
		double b = 2.0;
		
		System.out.println((int)(a-b));
		System.out.println((int)(a+b));
		System.out.println((int)(a*b));
		System.out.println((int)(a/b));
		System.out.println((int)(a%b));
		
		System.out.println();
		System.out.println("===2번===");
//		2. (1)false (2)true (3)false
		int size1 = 10;
		int size2 = 20;
		boolean result;
		
		result = ((size1 > 10) && (size2 >10));
		System.out.println(result);
		result = ((size1 > 10) || (size2 >10));
		System.out.println(result);
		System.out.println(!result);
		
		System.out.println();
		System.out.println("===3번===");
//		3.
		int[] coinUnit = {500, 100, 50, 10};
		int money = 2680;
		System.out.println("money=" + money);
		for(int i=0; i<coinUnit.length; i++) {
			System.out.print(coinUnit[i]+"원:"+money/coinUnit[i]+"개  ");
			money = money % coinUnit[i];
		}
		
		System.out.println();
		System.out.println("===4번===");
//		4.
		Scanner sc = new Scanner(System.in);
		System.out.println("x 입력> ");
		int x = sc.nextInt();
		System.out.println("y 입력> ");
		int y = sc.nextInt();
		
		for(int i=2; i<x+1; i++) {
			for(int j=1; j<y+1; j++) {
				if(x >= y) {}
				System.out.println(i+" * "+j+" = "+(i*j));
			}
		}
		
		
		System.out.println();
		System.out.println("===5번===");
		
//		5.
		boolean run = true;
		int size = 5;
		int dice[] = null;
		while(run) {
			System.out.println("=== 1.주사위 크기 | 2.주사위 굴리기 | 3.결과 보기 | 4.가장 많이 나온 수 | 5.종료 ===");
			System.out.print("메뉴> ");
			int selectNo = sc.nextInt();
			
			switch(selectNo) {
			case 1:
				System.out.println("주사위 크기>");
				size = sc.nextInt();
				dice = new int[size];
			case 2:
				int count = 0;
				while(run) {
					int play = (int) (Math.random() * size +1);
					if(play == 5) {
						dice[play-1] += 1;
						System.out.println("5가 나올때까지 주사위를 "+ (count+1)+"번 굴렸습니다.");
						break;
					}else {
						dice[play] += 1;
						count += 1;
					}
				}
				break;
			case 3:
				for(int i=0; i<size; i++) {
					System.out.printf("%d은 %d번 나왔습니다.\n", i+1, dice[i]);
				}
				break;
			case 4:
				int max =dice[0];
				int index = 0;
				for(int i=0; i<size; i++) {
					if(max< dice[i]) {
						max = dice[i];
						index = i;
					}
				}
				System.out.println("가장 많이 나온 수는"+(index+1)+"입니다.");
				break;
			case 5:
				System.out.println("프로그램 종료");
				run = false;
				break;
			}


		}
	}
}
