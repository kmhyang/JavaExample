package com.yedam.hwEmp;

public class Human {
	protected String name;
	protected int height;
	protected int weight;
	
	public Human(String name, int height, int weight) {
		this.name=name;
		this.height=height;
		this.weight=weight;
	}
	
	public void getInfomation() {
		System.out.println("이름 : "+this.name);
		System.out.println("키 : "+this.height);
		System.out.println("몸무게 : "+this.weight);
	}
	
}
