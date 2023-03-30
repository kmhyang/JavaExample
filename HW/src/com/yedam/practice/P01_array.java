package com.yedam.practice;

import java.util.Scanner;

public class P01_array {
	public static void main(String[] args) {
	int score = (int)(Math.random()*60)+40;
	System.out.println(score);
	
	if(score > 60) {
		System.out.println("합격");
	}else {
		System.out.println("불합격");
	}
	
	//=>삼항연산자로
	String sam = (score > 60) ? "합격" : "불합격";
	System.out.println(sam);

	}
}
