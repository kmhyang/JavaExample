package com.yedam.poly;

public class HankookTire extends Tire{

		public HankookTire (String location, int maxRotation) {
			super(location, maxRotation);
		}

		@Override
		public boolean roll() {
			++accumulatedRotation; //누적 회전수
			if(accumulatedRotation<maxRotation) { //최대 회전수
			System.out.println(location+"HankookTire 수명:"+(maxRotation-accumulatedRotation)+"회");
			return true;
			}else {
				System.out.println("***"+location+"HankookTire 펑크"+"***");
				return false;
			}
			
		}
		
		
	
}
