package com.yedam.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class DAO {
	//DAO - Data Access Object : DB 연결할 때 
	//JDBC
	//1) ojdbc 라이브러리 추가 필수
	//2) DAO
	
//	java ->DB 연결할 때 쓰는 객체
//	connection - java sql클릭
	protected Connection conn = null;
	
	//Select (조회) 결과 값을 반환 받는 객체
	//Select한 결과를 Java로 전달
	protected ResultSet rs = null;
	
	//Query문(sql)을 가지고 실행하는 객체
	//1)sql문 실행해주는 객체
	protected PreparedStatement pstmt = null;
	
	//2)sql문 실행해주는 객체
	protected Statement stmt = null;
	
	//DB 접속 정보
	String driver = "oracle.jdbc.driver.OracleDriver";
	
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	//★★★★★★★★
	//@ 접속할 IP : 접속PORT(원하는 서버로 들어가기 위해 도와주는 친구) : xe(=DB 이름)
	
	//인사관리 id, pw
	String id = "hr";
	String pw = "hr";
	
	//DB 연결
	public void conn() {
		try {
			//driver 경로 찾기 1) 드라이버 로딩
			Class.forName(driver);
			//
			conn = DriverManager.getConnection(url, id, pw);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
	}
	
	
	//DB 연결 해제
	public void disconn() {
		try {
			//연결 -> 결과 -> 조회-> 역순으로 다시 실행
			//1번이라도 실행했을 경우 null이 아님.
			//결과 조회하는 객체
			if(rs != null) {
				rs.close();
			}
			//sql 실행하는 객체
			if(stmt != null) {
				stmt.close();
			}
			if(pstmt !=null) {
				pstmt.close();
			}
			//db 연결하는 객체
			if(conn != null) {
				conn.close();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
}
