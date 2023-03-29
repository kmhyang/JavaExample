package com.yedam.arrange;

import java.util.Calendar;

//패키지 생성 - enum? 새로운 타입 
public class Ex01_week {
	public static void main(String[] args) {
		Week today = null;
		
		//요일을 숫자로 바꿈
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		//숫자를 요일로 바꿈
		switch(week) {
		case 1:
			today = Week.SUNDAY;
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUESDAY;
			break;
		case 4:
			today = Week.WEDNESDAY;
			break;
		case 5:
			today = Week.THURSDAY;
			break;
		case 6:
			today = Week.FRIDAY;
			break;
		case 7:
			today = Week.SATURDAY;
			break;
		}
		System.out.println("오늘 요일 :" + week);
		
	}
}
