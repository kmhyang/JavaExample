package com.yedam.Student;

import java.util.List;
import java.util.Scanner;

public class StudentService {
	Scanner sc = new Scanner(System.in);
	
	//전체조회
	public void getStudentList() {
		List<Student>list = StudentDAO.getInstance().getStudentList();
		int sum = 0;
		double avt = 0;
		for(int i=0; i<list.size(); i++) {
			System.out.println("학번 : " + list.get(i).getStudentId());
			System.out.println("이름 : "+list.get(i).getStudentName());
			System.out.println("전공 : "+list.get(i).getMajor());
			System.out.println("점수 : "+list.get(i).getStudentScore());
			sum+= list.get(i).getStudentScore();
		}
		System.out.println("총 점 : "+sum);
		System.out.println("평 균 : "+(double)(sum/list.size()));
			
	}
	
	
	//학생 등록
	public void StdAdd() {
		Student std = new Student();
		
		System.out.println("학번>");
		int studnetId = Integer.parseInt(sc.nextLine());
		System.out.println("학생 이름>");
		String studentName = sc.nextLine();
		System.out.println("전공>");
		String major = sc.nextLine();
		System.out.println("점수> ");
		int score =  Integer.parseInt(sc.nextLine());
		
		std.setStudentId(studnetId);
		std.setStudentName(studentName);
		std.setMajor(major);
		std.setStudentScore(score);
		
		int result = StudentDAO.getInstance().stdAdd(std);
		
		if(result == 1) {
			System.out.println("학생 등록 완료");
		} else {
			System.out.println("학생 등록 실패");
		}
		
	
	}
	
	public void stdDel() {
		System.out.println("삭제할 학번");
		int stdId = Integer.parseInt(sc.nextLine());
		
		int result = StudentDAO.getInstance().stdDel(stdId);
		
		if(result > 0) {
			System.out.println("삭제 성공");
		} else {
			System.out.println("삭제 실패");
		}
	}
	
	
	
	
	//수정
		public void stdUpdate() {
			Student std = new Student();
			System.out.println("학번 입력>");
			int stdId = Integer.parseInt(sc.nextLine());
			
			System.out.println("수정할 전공 입력>");
			String stdMajor = sc.nextLine();
			
			std.setMajor(stdMajor);
			std.setStudentId(stdId);
			
			int result = StudentDAO.getInstance().stdUpdate(std);
			
			if(result > 0) {
				System.out.println("전공 수정 완료");
			}else {
				System.out.println("전공 수정 실패");
			}
		}
	
	
}
