package com.yedam.oop;

public class Student {
	//학생이름, 학번, 국영수 점수 가지는 학생
	//기본 생성자와 모든 데이터를 초기화 할 수 있다.
	//학생의 정보를 출력하는 getInfo()
	//1)총점
	//2)평균
//	getInfo 출력결과
//	----------------
//	이름 : 김또치
//	학번 : 20230330
//	총점 : 200
//	평균 : 
	
//	필드
	String stdName;
	int id;
	int kor;
	int eng;
	int math;
	
//	생성자
	public Student() {
		
	}
	
	public Student(String stdName, int id, int kor, int eng, int math) {
		//this.객체이름 = 변수이름
		this.stdName = stdName;
		this.id = id;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
//	메소드
	
	void getInfo() {
		System.out.println("-----------------------");
		System.out.println("이름 : "+stdName);
		System.out.println("학번 : "+id);
		System.out.println("총점 : "+sum());
		System.out.println("평균 : "+avg());
	}
	
	int sum() {
		return kor+eng+math;
	}
	
	double avg() {
		return (double) sum()/3;
	}
	
	
	
	
	
}
