package com.yedam.test0405;

public interface Payment {
	public static final double ONLINE_PAYMENT_RATIO= 0.05;
	public static final double OFFLINE_PAYMENT_RATIO= 0.03;
	
	public double online(double price);
	public double offline(double price);
	public void showInfo();
	
}
