package com.yedam.app;
import java.util.Scanner;

import com.yedam.Student.StudentService;

public class StdApplication {
	
	StudentService ss = new StudentService();
	Scanner sc = new Scanner(System.in);
	
	public StdApplication() {
		run();
	}
	
	
	private void run() {
		int menu = 0;
		System.out.println("1.학생 조회 | 2. 학생 등록 | 3. 정보 삭제 | 4. 전공 변경 | 5. 종료");
		System.out.println("메뉴> ");
			menu = Integer.parseInt(sc.nextLine());
			
			if(menu == 1) {
				ss.getStudentList();
			}else if(menu == 2){
				ss.StdAdd();
			}else if(menu == 3) {
				ss.stdDel();
			}else if(menu == 4) {
				ss.stdUpdate();
			}else if(menu == 5) {
				System.out.println("종료");
			}
		}
		
	}
