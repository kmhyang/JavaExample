package com.yedam.member;

import java.util.ArrayList;
import java.util.List;

import com.yedam.common.DAO;

public class MemberDAO extends DAO{
	//230406 KMH MemberDAO 아래 기능 구현
	//login()
	//logout()
	
	//싱글톤
	private static MemberDAO memberDao = null;
	
	private MemberDAO() {
		
	}
	
	public static MemberDAO getInstance() {
		if(memberDao == null) {
			memberDao = new MemberDAO();
		}
		return memberDao;
	}
	
	
	//1. 로그인
	public Member login(String id) {
		//1. id 틀렸다, pw 틀렸다
		
//		1. login
//		2. 회원가입 시 id 중복체크
		
		Member member = null;
		try {
			conn();
			String sql = "SELECT * FROM member where id = ?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			
			rs = pstmt.executeQuery();
			
			//정상적으로 id가 조회되었을 때  
			if(rs.next()) {
				member = new Member();
				member.setId(rs.getString("id"));
				member.setPw(rs.getString("pw"));
				member.setName(rs.getString("name"));
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return member;
	}

//	1. 회원 조회
	public List<Member> getMemberList(){
		List<Member> list = new ArrayList<>();
		Member member = null;  //데이터 넣을 객체 공간
		try {
			conn();
			String sql = "SELECT * FROM member";
			
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				member = new Member();
				member.setId(rs.getString("id"));
				member.setPw(rs.getString("pw"));
				member.setName(rs.getString("name"));
				
				list.add(member);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return list;
	}
	
	
//	2. 회원 등록
	public int memAdd(Member member) {
		int result = 0;
		try {
			conn();
			String sql = "insert into member values (?,?,?)";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, member.getId());
			pstmt.setString(2, member.getPw());
			pstmt.setString(3, member.getName());
			
			result = pstmt.executeUpdate();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	
	
//	3. 회원 수정
	public int memUpdate(Member member) {
		int result = 0;
		try {
			conn();
			String sql = "update member set pw =? where id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,  member.getPw());
			pstmt.setString(2,  member.getId());
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	
//	4. 회원 삭제
	public int memDel(String id) {
		int result = 0;
		try {
			conn();
			String sql = "delete from member where id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,id);
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	
	
	
	
	
	
}
