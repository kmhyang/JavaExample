package com.yedam.oop;

public class Product {
	String name;
	int price;
	
	public Product() {
		
	}
	
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	void list() {
		System.out.println(name+" : "+price);
	}

	int sum() {
		return price += price;
	}
}
