package com.yedam.department;

import java.util.ArrayList;
import java.util.List;

import com.yedam.common.DAO;

public class DepDAO extends DAO{
	
	//singletone
	private static DepDAO depDao = null;
	
	private DepDAO() {
		//기본생성자
	}
	
	public static DepDAO getInstance() {
		if(depDao == null) {
			depDao = new DepDAO();
		} 
		return depDao;
	}
	
		
//	1) 전체조회
	public List<DepDTO> getDepartmentsList(){
		
		List<DepDTO> list = new ArrayList<>();
		
		DepDTO dep = null;
		
		try {
			conn();
			String sql = "select * from departments";
			
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				dep = new DepDTO();
				
				dep.setDepartmentId(rs.getInt("department_id"));
				dep.setDepartmentName(rs.getString("department_name"));
				dep.setManagerId(rs.getInt("manager_id"));
				dep.setLocationId(rs.getInt("location_id"));
				
				list.add(dep);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		
		return list;
	}
	
	
//	2) 부서 정보 조회(단건)
	public DepDTO getDepartment(int departmentId) {
		DepDTO dep = null;
		try {
			conn();
			String sql = "select * from departments"+ " where department_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, departmentId);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				dep = new DepDTO();
				dep.setDepartmentId(rs.getInt("department_id"));
				dep.setDepartmentName(rs.getString("department_name"));
				dep.setManagerId(rs.getInt("manager_id"));
				dep.setLocationId(rs.getInt("location_id"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return dep;
	}
	
	
//	3) 부서 생성 정보(id, name)
	public int depAdd(DepDTO dep) {
		int result = 0;
		try {
			conn();
			String sql = "insert into departments" 
						+ "(department_id, department_name)" 
						+" values(?,?)"; 
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1,  dep.getDepartmentId());
			pstmt.setString(2, dep.getDepartmentName());
//			pstmt.setInt(3, dep.getManagerId());
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	
//	4) 부서 생성 수정(mgr)
	public int depUpdate(DepDTO dep) {
		int result = 0;
		try {
			conn();
			String sql = "update departments set manager_id=? where department_id = ?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, dep.getManagerId());
			pstmt.setInt(2, dep.getDepartmentId());
			
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	
	
//	5) 부서 생성 삭제
	public int depDel(int departmentId) {
		int result = 0;
		try {
			conn();
			
			String sql = "delete from departments where department_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, departmentId);
			
			result = pstmt.executeUpdate();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	
	

}
