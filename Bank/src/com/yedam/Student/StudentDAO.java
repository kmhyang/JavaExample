package com.yedam.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.yedam.common.DAO;

public class StudentDAO extends DAO{

	Scanner sc = new Scanner(System.in);
	
	private static StudentDAO studentDao = null;
	private StudentDAO () {
		
	}
	
	public static StudentDAO getInstance() {
		if(studentDao==null) {
			studentDao = new StudentDAO();
		}
		return studentDao;
	}
	
	public List<Student> getStudentList(){
		List<Student>list = new ArrayList<>();
		Student std = null;
		try {
			conn();
			String sql = "select * from student";
			
			stmt = conn.createStatement();
			
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				std = new Student();
				
				std.setStudentId(rs.getInt("student_id"));
				std.setStudentName(rs.getString("student_name"));
				std.setMajor(rs.getString("major"));
				std.setStudentScore(rs.getInt("student_score"));
				
				list.add(std);
			}
		} catch (Exception e) {
			e.printStackTrace();		
		} finally {
			disconn();
		}
		return list;
	}
	
	//학생 등록
	public int stdAdd(Student std) {
		int result = 0;
		try {
			conn();
			String sql = "insert into student values (?,?,?,?)";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, std.getStudentId());
			pstmt.setString(2, std.getStudentName());
			pstmt.setString(3, std.getMajor());
			pstmt.setInt(4, std.getStudentScore());
			
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconn();
		}
		return result;
	}
	
	//삭제
	public int stdDel(int stdId) {
		int result = 0;
		try {
			conn();
			String sql = "delete from student where student_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, stdId);
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconn();
		}
		return result;
	}
	
	
	//수정
	public int stdUpdate(Student std) {
		int result = 0;
		try {
			conn();
			String sql = "update student set major = ? where student_id = ?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, std.getMajor());
			pstmt.setInt(2, std.getStudentId());
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconn();
		}
		
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
