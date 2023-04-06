package com.yedam.exe;
import java.util.Scanner;

import com.yedam.department.DptImpl;
import com.yedam.employees.EmpImpl;

public class HumanResource {
	
	EmpImpl ei = new EmpImpl();
	DptImpl di = new DptImpl();
	Scanner sc = new Scanner(System.in);
	
	
	public HumanResource(){
		run();
	}
	
	private void run() {
		// 메뉴 - 기능
		// 1) 로그인
		// 2) 회원가입
		// 3) 등급관리
		while (true) {
			System.out.println("1. 사원 관리 | 2. 부서 관리 | 3. 종료");
			System.out.println("메뉴>");
			int menu = Integer.parseInt(sc.nextLine());

			// 2. HumanResource에서 정리
			if (menu == 1) {
				// 메소드
				employees();
			} else if (menu == 2) {
				departments();
			} else if (menu == 3) {
				System.out.println("프로그램 종료");
				break;
			}
		}

	}

		private void departments() {
			boolean flag = true;
			while (flag) {
				System.out.println("1. 전체 조회 | 2. 관리자 수정 | 3. 종료");
				System.out.println("메뉴>");
				String menu = sc.nextLine();

				switch (menu) {
				case "1":
					di.getDepartmensList();
					break;
				case "2":
					di.depUpdate();
					break;
				case "3":
					System.out.println("부서 관리 종료");
					flag = false;
					break;

				}

			}
		}
		
		
//		while(true) {
//			System.out.println("1. 전체조회 | 2. 사번 조회 | 3. 사원 등록 | 4. 급여 수정 | 5. 정보 삭제 | 99. 종료");
//			System.out.println("메뉴>");
//			int menu = Integer.parseInt(sc.nextLine());
//			if(menu == 1) {
//				ei.getEmployeesList();
//				
//			}else if(menu == 2) {
//				ei.getEmployee();
//			}else if(menu == 3) {
//				ei.empAdd();
//			}else if(menu == 4) {
//				ei.empUpdate();
//			}else if(menu == 5) {
//				ei.empDelete();
//			}else if(menu == 99) {
//				System.out.println("end of prog");
//				break;
//			}
//		}
//	}
	

	private void employees() {
		int menu = 0;
		while (menu != 99) {
			System.out.println("1. 전체 조회 | 2. 사번 조회 | " + "3. 사원 등록 | 4. 급여 수정 | 5. 사원 삭제 | 99. 종료");
			System.out.println("메뉴>");
			menu = Integer.parseInt(sc.nextLine());
			if (menu == 1) {
				ei.getEmployeesList();
			} else if (menu == 2) {
				ei.getEmployee();
			} else if (menu == 3) {
				ei.empAdd();
			} else if (menu == 4) {
				ei.empUpdate();
			} else if (menu == 5) {
				ei.empDelete();
			} else if (menu == 99) {
				System.out.println("사원 관리 종료");
			}
		}

	}
}
//	-->run을 실행할 main문 클래스 생성 : ExeApp

	