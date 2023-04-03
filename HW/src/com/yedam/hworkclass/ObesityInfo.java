package com.yedam.hworkclass;

public class ObesityInfo extends StandardWeightInfo {
	double obesity;
	
	public void StandardWeightInfo(String name, int height, int kg, double std, double obesity) {
		this.name = name;
		this.height=height;
		this.kg=kg;
		this.std=std;
		this.obesity=obesity;
	}
	
	public double fat() {
		return obesity=((kg-std)/std*100);
	}
	
	public void getObesity() {
		if(obesity <=18.5) {
			System.out.println("저체중");
		}else if(obesity >=18.5 && obesity <= 22.9) {
			System.out.println("wjdtkd");
		}else if(obesity >=23.0 && obesity <= 24.9) {
			System.out.println("과제충");
		}else if(obesity >=25.0) {
			System.out.println("비만");
		}
	}

	@Override
	public void getInformation() {
		System.out.println(name);
		System.out.println(height);
		System.out.println(kg);
		System.out.printf("%.2f",std);
		getObesity();
	}
	
	
}
