package com.yedam.menu;

import java.util.ArrayList;
import java.util.List;

import com.yedam.common.DAO;

public class MenuDAO extends DAO{
	private static MenuDAO menuDao = null;
	private MenuDAO() {
		
	}
	
	public static MenuDAO getInstance() {
		if(menuDao == null) {
			menuDao = new MenuDAO();
		}
		return menuDao;
	}
	
//	전체조회
	public List<Menu> getMenuList(){
		List<Menu>list = new ArrayList<>();
		Menu menu = null;
		try {
			conn();
			String sql = "select * from menu";
			
			stmt = conn.createStatement();
			
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				menu = new Menu();
				
				menu.setCoffeeMenu(rs.getString("coffee_menu"));
				menu.setCoffeePrice(rs.getInt("coffee_price"));
				
				list.add(menu);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return list;
	}
	
//	상세조회
	public Menu getMenu(String coffeeMenu) {
		Menu menu=null;
		try {
			conn();
			String sql = "select * from menu where coffee_menu = ?";
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, coffeeMenu);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				menu = new Menu();
				menu.setCoffeeMenu(rs.getString(("coffee_menu")));
				menu.setCoffeePrice(rs.getInt("coffee_price"));
				menu.setCoffeeExplain(rs.getString("coffee_explain"));
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return menu;
	}
	
//	메뉴 등록
	public int menuAdd(Menu menu) {
		int result = 0;
		try {
			conn();
			String sql = "insert into menu values(?,?,?)";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, menu.getCoffeeMenu());
			pstmt.setInt(2, menu.getCoffeePrice());
			pstmt.setString(3, menu.getCoffeeExplain());
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	
//	
	public int menuSales(Menu menu) {
		int result =0;
		String menus = "";
		try {
			conn();
			String sql = "select sales from menu where coffee_menu = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, menu.getCoffeeMenu());
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				menus = rs.getString("coffee_menu");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	
	
	
//	삭제
	public int menuDelete(String coffeeMenu) {
		int result =0;
		try {
			conn();
			String sql = "delete from menu where coffee_menu = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, coffeeMenu);
					
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	
	
	//매출
	public List<Menu> getSaleList(){
		List<Menu>list = new ArrayList<>();
		Menu menu = null;
		try {
			conn();
			String sql = "select coffee_menu, coffee_sales from menu";
			
			stmt = conn.createStatement();
			
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				menu = new Menu();
				
				menu.setCoffeeMenu(rs.getString("coffee_menu"));
				menu.setCoffeePrice(rs.getInt("coffee_sales"));
				
				list.add(menu);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return list;
	}
	
	
	
}
