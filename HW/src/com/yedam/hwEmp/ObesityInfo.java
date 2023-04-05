package com.yedam.hwEmp;

public class ObesityInfo extends StandardWeightInfo {
	public ObesityInfo(String name, int height, int weight) {
		super(name, height, weight);
	}

	@Override
	public void getInfomation() {
		super.getInfomation();
		System.out.println("비만도 : " +this.getObesity());
	}
	
	public String getObesity() {
		double bmi = (this.weight - this.getStandardWeight())/this.getStandardWeight() * 100 ;
		String obesity = null;
		if(bmi <= 18.5) {
			obesity = "저체중";
		}else if(bmi <= 22.9) {
			obesity = "정상";
		}else if(bmi <= 24.9) {
			obesity = "과체중";
		}else {
			obesity = "비만";
		}
		return obesity;
	}
}
