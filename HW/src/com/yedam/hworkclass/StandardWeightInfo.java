package com.yedam.hworkclass;

public class StandardWeightInfo extends Human {
		
	double std;
	
	public void StandardWeightInfo(String name, int height, int kg, double std) {
		this.name = name;
		this.height=height;
		this.kg=kg;
		this.std=std;
	}

	public double getStandardWeight() {
		return std=(height -100)*0.9;
	}
	
	
	@Override
	public void getInformation() {
		System.out.println(name);
		System.out.println(height);
		System.out.println(kg);
		System.out.printf("%.2f",std);
	}
	
}
