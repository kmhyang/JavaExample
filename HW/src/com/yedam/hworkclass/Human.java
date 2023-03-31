package com.yedam.hworkclass;

public class Human {
	String name;
	int height;
	int kg;
	
	public void Human(String name, int height, int kg) {
		this.name = name;
		this.height=height;
		this.kg=kg;
	}
	
	public void getInformation() {
		System.out.println(name);
		System.out.println(height);
		System.out.println(kg);
	}
}
