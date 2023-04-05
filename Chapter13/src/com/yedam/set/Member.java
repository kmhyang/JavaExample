package com.yedam.set;

public class Member {
	String name;
	int age;
	
	public Member(String name, int age) {
		this.age=age;
		this.name=name;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member) obj;
			//강제타입변환 (자식 Member 정보 사용할 수 있도록)
			
			//1) name, age 모두 같아야 같은 객체로 비교한다는 조건
//			if(member.name.equals(name) && member.age == age) {
//				return true;
//			}
			
			//2)이름만 같으면 같은 객체로 본다고 조건 설정
			if(member.name.equals(name)) {
				return true;
			}
		}
		return false;
	}
	
	
	@Override
	public int hashCode() {
		
		return name.hashCode();
//		return name.hashCode()+age;
		//name.hashCode : 데이터가 같으면 주소가 같아짐.
	}

	
	
	
	
	
	
	
}
