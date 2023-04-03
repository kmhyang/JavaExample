package com.yedam.inter;

public interface Searchable extends RemoteControl {
	//Searchable extends RemoteControl : audio, television, turn, 모두 사용 가능할 수 있도록 만들어줌
	//=>★★인터페이스 다중 상속★★
	
	void search(String url);
	
}
