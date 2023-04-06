package com.yedam.exe;

import java.util.Scanner;

import com.yedam.member.MemberService;

public class ExeApp {
	
	int menu = 0;
	MemberService ms = new MemberService();
	Scanner sc = new Scanner(System.in);
	
	public void run() {
		exe();
	}
	
	private void exe() {
//		menu();
		boolean run = true;
		String menu = "";
		while(run) {
			//로그인 한 경우
			if(MemberService.memberInfo != null) {
				System.out.println("1. 회원 조회 | 2. 회원 등록 | 3. 회원 탈퇴 | 4. 회원 수정 | 5. 로그아웃");
				System.out.println("메뉴> ");
				menu = sc.nextLine();
				switch (menu) {
				case "1":
					ms.getMemberList();
					break;
				case "2":
					ms.memAdd();
					break;
				case "3":
					ms.memDel();
					break;
				case "4":
					ms.memUpdate();
					break;
				case "5":
					ms.logout();
					break;
				}
				
				}else if(MemberService.memberInfo == null){
				//로그인 안 한 경우
				System.out.println("1. 로그인 | 2. 종료 ");
				System.out.println("메뉴> ");
				menu = sc.nextLine();
				if(menu.equals("1")) {
					ms.login();
				}else{
					System.out.println("종료");
				}
			}
			
		}
		
	}
	
	private void menu() {
		
	}
		
	
	private void login() {
		ms.login();
	}
	
	
	
	
}
