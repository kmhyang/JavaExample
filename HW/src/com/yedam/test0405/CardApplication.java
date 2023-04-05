package com.yedam.test0405;

public class CardApplication {
	public static void main(String[] args) {
		
		System.out.println("1)-----------");
		Card card = new Card("5432-4567-9534-3657", 20251203, 253);
		card.showCardInfo();
		
		
		System.out.println("2)-----------");
		Card a = new TossCard("5432-4567-9534-3657", 20251203, 253, "신빛용");
		a.showCardInfo();
		
		System.out.println("3)-----------");
		Card b = new DGBCard("5432-4567-9534-3657", 20251203, 253, "신빛용");
		b.showCardInfo();
		
		
	}
}
