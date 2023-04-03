package com.yedam.poly;

public class KumhoTire extends Tire{
	public KumhoTire (String location, int maxRotation) {
		super(location, maxRotation);
	}

	@Override
	public boolean roll() {
		++accumulatedRotation; //누적 회전수
		if(accumulatedRotation<maxRotation) { //최대 회전수
		System.out.println(location+"KumhoTire 수명:"+(maxRotation-accumulatedRotation)+"회");
		return true;
		}else {
			System.out.println("***"+location+"KumhoTire 펑크"+"***");
			return false;
		}
		
	}
}
