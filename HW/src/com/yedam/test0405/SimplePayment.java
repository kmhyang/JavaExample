package com.yedam.test0405;

public class SimplePayment implements Payment{

	double simplePaymentRatio;
	
	public SimplePayment(double simplePaymentRatio) {
		this.simplePaymentRatio = simplePaymentRatio;
	}
	
	@Override
	public double online(double price) {
		double a1 = (double)(1-this.simplePaymentRatio-ONLINE_PAYMENT_RATIO)*price;
		return a1;
	}
	
	@Override
	public double offline(double price) {
		double b1 = (double)(1-this.simplePaymentRatio-OFFLINE_PAYMENT_RATIO)*price;
		return b1;
	}

	@Override
	public void showInfo() {
		System.out.println("*** 간편결제 시 할인 정보");
		System.out.println("온라인 결제시 총 할인율 : "+(Payment.ONLINE_PAYMENT_RATIO+this.simplePaymentRatio));
		System.out.println("오프라인 결제시 총 할인율 : "+(Payment.OFFLINE_PAYMENT_RATIO+this.simplePaymentRatio));
	}

}
