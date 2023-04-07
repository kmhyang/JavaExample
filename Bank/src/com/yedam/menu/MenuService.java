package com.yedam.menu;

import java.util.List;
import java.util.Scanner;


public class MenuService {
	Scanner sc = new Scanner(System.in);
	public static Menu menuInfo = null;
	
	//전체조회
	public void getMenuList() {
		List<Menu>list = MenuDAO.getInstance().getMenuList();
		
		for(int i=0; i<list.size();i++) {
			System.out.println("메뉴 : "+list.get(i).getCoffeeMenu()+"가격 : "+list.get(i).getCoffeePrice());
		}
	}
	
	public void getMenu() {
		System.out.println("메뉴 입력");
		String menus = sc.nextLine();
		Menu menu = MenuDAO.getInstance().getMenu(menus);
		
		if(menu == null) {
			System.out.println("해당 메뉴는 존재하지 않습니다.");
		}else {
			System.out.println("메뉴 : "+menu.getCoffeeMenu()+"가격 : "+menu.getCoffeePrice());
			System.out.println("설명 : "+menu.getCoffeeExplain());
		}
		
	}
	
	//add
	public void menuAdd() {
		Menu menu = new Menu();
		
		System.out.println("메뉴 입력");
		String menus = sc.nextLine();
		System.out.println("가격 입력");
		int price = Integer.parseInt(sc.nextLine());
		System.out.println("설명 입력>");
		String explain = sc.nextLine();
		
		menu.setCoffeeMenu(menus);
		menu.setCoffeePrice(price);
		menu.setCoffeeExplain(explain);
		
		int result = MenuDAO.getInstance().menuAdd(menu);
		
		if(result == 1) {
			System.out.println("메뉴 추가 성공");
		}else {
			System.out.println("메뉴 추가 실패");
		}
	}
	
//	판매
	public void menuSales() {
		int count = 1;
		System.out.println("메뉴 입력>");
		String menus = sc.nextLine();
		
		if(menus != null) {
			if(menus.equals(menuInfo.getCoffeeMenu())){
				count++;
			}
			System.out.println("판매량 완료");
		}
		
	}
	
	
	
	//삭제
	public void menuDelete() {
		System.out.println("삭제할 메뉴 입력");
		String coffeeMenu = sc.nextLine();
		
		int result = MenuDAO.getInstance().menuDelete(coffeeMenu);
		
		if(result >0) {
			System.out.println("삭제 성공");
		}else {
			System.out.println("삭제 실패");
		}
		
	}
			
	public void getSaleList() {
		List<Menu>list = MenuDAO.getInstance().getSaleList();
		
		
		
		for(int i=0; i<list.size();i++) {
			System.out.println("메뉴 : "+list.get(i).getCoffeeMenu()+"판매금액 : "+list.get(i).getCoffeeSales());
		}
	}
	
	
	
	
	
	
	
	
	
	
}
