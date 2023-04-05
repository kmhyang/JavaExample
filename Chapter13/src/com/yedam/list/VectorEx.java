package com.yedam.list;

import java.util.List;
import java.util.Vector;

public class VectorEx {
	public static void main(String[] args) {
		List<Board> list = new Vector<>();
		
		
		//1)
		Board board = new Board("제목1", "내용1", "글쓴이1");
		list.add(board);
		//2)
		list.add(new Board("제목2", "내용2", "글쓴이2"));
		list.add(new Board("제목3", "내용3", "글쓴이3"));
		list.add(new Board("제목4", "내용4", "글쓴이4"));
		list.add(new Board("제목5", "내용5", "글쓴이5"));
		
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));  //저장된 객체의 주소 값이 출력됨(해시코드)
			
			//값 출력
			//1))
//			System.out.println(list.get(i).subject+"\t"+list.get(i).content+"\t"+list.get(i).writer);
						
		}
		System.out.println("-----------------");
		//2))향상된 for문 활용
		for(Board board2 : list) {
			System.out.println(board2.subject+"\t"+board2.content+"\t"+board2.writer);
		}
		
		list.remove(2);
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));  //저장된 객체의 주소 값이 출력됨(해시코드)
			System.out.println(list.get(i).subject+"\t"+list.get(i).content+"\t"+list.get(i).writer);
						
		}
	}
}
