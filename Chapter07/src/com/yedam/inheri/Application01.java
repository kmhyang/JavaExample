package com.yedam.inheri;

public class Application01 {
	public static void main(String[] args) {
		Child child = new Child();
		
		child.lastName = "이";
		child.getInfo();
		//부모가 가지고 있는 필드, 메소드 모두 사용 가능
//		child.money=1000; money는 private 접근제한자로 상속을 제외함
	}
}
