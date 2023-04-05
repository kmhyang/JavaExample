package com.yedam.hwEmp;

public class StandardWeightInfo  extends Human {
	
	public StandardWeightInfo(String name, int height, int weight) {
		super(name, height, weight);
	}
	
	@Override
	public void getInfomation() {
		super.getInfomation();
		System.out.println("표준체중 : "+getStandardWeight());
	}
	
	public double getStandardWeight() {
		return (double)(this.height - 100)*0.9;
	}
}
