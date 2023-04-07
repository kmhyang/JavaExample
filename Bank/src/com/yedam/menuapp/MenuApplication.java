package com.yedam.menuapp;

import java.util.Scanner;

import com.yedam.menu.MenuService;

public class MenuApplication {
	MenuService ms = new MenuService();
	Scanner sc = new Scanner(System.in);

	public MenuApplication(){
		run();
	}
	
	private void run() {
		while(true) {
			System.out.println("1. 메뉴조회 | 2. 메뉴 상세 조회 | 3. 메뉴 등록 | 4. 판매 | 5. 메뉴삭제 | 6. 매출 | 7. 종료");
			System.out.println("메뉴>");
			int num = Integer.parseInt(sc.nextLine());
			
			if(num == 1) {
				ms.getMenuList();
			}else if(num == 2) {
				ms.getMenu();
			}else if(num == 3) {
				ms.menuAdd();
			}else if(num == 4) {
				ms.menuSales();
			}else if(num == 5) {
				ms.menuDelete();
			}else if(num == 6) {
				ms.getSaleList();
			}else if(num == 7) {
				System.out.println("end of prog");
				break;
			}
			
			
		}
	}
}
