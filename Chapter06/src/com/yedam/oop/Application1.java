package com.yedam.oop;

public class Application1 {
	public static void main(String[] args) {
		//Car:타입 sonata:객체 = new Car:() :생성자, 어떤 일을 수행할 객체
		Car sonata = new Car("소나타", 10000);
		//-> 클래스 선언 후 생성자 생성하지 않았을 때 기본생성자 활용해서 만든 생성자
		// 매개변수 생성자 만들면 자동생성된 기본생성자가 아닌 매개변수 생성자를 이용하기 때문에 오류가 남.

		System.out.println(sonata.company);
		System.out.println(sonata.name);
		System.out.println(sonata.price);
		System.out.println();
		
		Car k5 = new Car("k5", 9000, "기아자동차");
		System.out.println(k5.company);
		System.out.println(k5.name);
		System.out.println(k5.price);
		System.out.println();
		
		//Car 정보 대입
		//초기값 null null 0
/*		sonata.name = "소나타";
		sonata.price = 10000;
		System.out.println("");
		System.out.println(sonata.company);
		System.out.println(sonata.name);
		System.out.println(sonata.price);
		
		sonata.company = "기아자동차";
		System.out.println("");
		System.out.println(sonata.company);
		System.out.println(sonata.name);
		System.out.println(sonata.price);
		//Car 클래스 내에서 정보를 지정할 수도 있고, 필드(객체 정보)로 불러와서 수정할 수도 있음
		
		
		Car kona = new Car();
		System.out.println("==코나==");
		System.out.println(kona.company);
		System.out.println(kona.name);
		System.out.println(kona.price);
		
		kona.name = "코나";
		kona.price = 100;
		System.out.println("");
		System.out.println(kona.company);
		System.out.println(kona.name);
		System.out.println(kona.price);
*/
		
	}
}
