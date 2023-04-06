package com.yedam.exe;
import java.util.Scanner;
import com.yedam.department.DptImpl;


public class HRDep {
	DptImpl di = new DptImpl();
	Scanner sc = new Scanner(System.in);
	
	public HRDep() {
		run();
	}
	
	private void run() {
		while(true) {
			System.out.println("1. 전체조회 | 2. 부서 번호 조회 | 3. 부서 생성 | 4. 관리자 번호 수정 | 5. 부서 삭제 | 99. 종료");
			System.out.println("메뉴> ");
			int menu = Integer.parseInt(sc.nextLine());
			
			if(menu ==1) {
				di.getDepartmensList();
			}else if(menu == 2) {
				di.getDepartment();
			}else if(menu == 3) {
				di.depAdd();
			}else if(menu == 4) {
				di.depUpdate();
			}else if(menu == 5) {
				di.depDel();
			}else if(menu == 99) {
				 System.out.println("end of prog");
				 break;
			}
			
		}
		
		
		
		
		
	}
	
}
