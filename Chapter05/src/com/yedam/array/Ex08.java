package com.yedam.array;

public class Ex08 {
	public static void main(String[] args) {
		if(args.length>0) {
			for(int i=0; i<args.length; i++) {
				System.out.println(args[i]);
				//우클릭 -> run as -> argument -> 10,20,30,40 입력하면 실행됨
			}
		}
	}
}
