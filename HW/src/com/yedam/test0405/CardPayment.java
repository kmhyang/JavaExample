package com.yedam.test0405;

public class CardPayment implements Payment{
	double cardRatio;

	public CardPayment(double cardRatio) {
		this.cardRatio = cardRatio;
	}
	
	
	@Override
	public double online(double price) {
		double a1 = (double)(1-this.cardRatio-ONLINE_PAYMENT_RATIO)*price;
		return a1;
	}
	
	@Override
	public double offline(double price) {
		double b1 = (double)(1-this.cardRatio-OFFLINE_PAYMENT_RATIO)*price;
		return b1;
	}
	
	@Override
	public void showInfo() {
		System.out.println("***카드로 결제 시 할인정보");
		System.out.println("온라인 결제시 총 할인율 : "+(CardPayment.ONLINE_PAYMENT_RATIO+this.cardRatio));
		System.out.println("오프라인 결제시 총 할인율 : "+(CardPayment.OFFLINE_PAYMENT_RATIO+this.cardRatio));
	}


	
	
	
}
