package com.yedam.abs;

public class AnimalEx {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		dog.sound();
		cat.sound();
		System.out.println("---------------");
		
		//추상클래스를 다형성을 활용해서 표현
		
//		Animal animal = new Dog();  //자동타입변환, 재정의한 메소드 실행
//		animal.sound();
//		//자식클래스가 강제로 재정의하게 만들어서 실행
//				System.out.println("---------------");
//		animal = new Cat();
//		animal.sound();
		
		animalSound(new Dog());
		animalSound(dog);  //↑ 같은 의미
		animalSound(new Cat());
	}
	
	//매개변수의 다형성을 활용한 추상클래스 사용 (생성자X)
	
	public static void animalSound(Animal animal) {
		animal.sound();
		//dog 재정의된 sound 메소드 실행
	}
}
