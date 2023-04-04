package com.yedam.API;

public class ClassExd {
	public static void main(String[] args) throws ClassNotFoundException {
		
		//클래스에서 정보 얻기
		Class clazz = Member.class;
		System.out.println("Member Class 정보 : "+clazz);
		
		//class 경로 입력해서 정보 얻기
		clazz = Class.forName("com.yedam.API.Member");
		System.out.println(clazz);
		
		//객체를 통한 정보 얻기
		Member member = new Member("또치");
		clazz = member.getClass();
		System.out.println(clazz);
		System.out.println("===========");
		System.out.println(clazz.getName());
		System.out.println(clazz.getSimpleName());
		System.out.println(clazz.getPackageName());
		System.out.println(clazz.getPackage().getName());
		
		//사진 경로 읽기
		//clazz : Member를 가르킴
		//Member와 같은 위치에 있는 사진 경로를 가져옴
		System.out.println("==========사진경로=====");
		String photo1Path = clazz.getResource("img1.jpg").getPath();
		System.out.println(photo1Path);
		
		
	}
}
