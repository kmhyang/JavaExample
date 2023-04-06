package com.yedam.employees;

import java.util.ArrayList;
import java.util.List;

import com.yedam.common.DAO;

public class EmpDAO extends DAO{
	//java -> JDBC -> DB -> Employees Table에 접근
	//Employees 조회, 추가, 수정, 삭제(CRUD)
	//단 한 개의 관리자로만 데이터 접속할 수 있도록 싱글톤 생성
	
	//SingleTon
	private static EmpDAO empDao = null;
	
	private EmpDAO() {
		
	}
	
	public static EmpDAO getInstance() {
		if(empDao == null){
			empDao = new EmpDAO();
		}
		return empDao;
	}
	
	//CRUD
	//1. 전체 조회
	//SELECT * FROM employees;
	//EmpDTO 객체 1개 = 1개 row
	//list => EmpDTO 객체를 담아서 사용. => 전체 row 조회
	
	public List<EmpDTO> getEmployeesList(){
		//list, set, map
		//list:순서있게 저장하기 위해서
		
		List<EmpDTO>list = new ArrayList<>();
		//list[0] : 첫번째 row
		//list[1] : 두번째 row
		EmpDTO emp = null;
		
		try {
			conn();
			//부모가 가지고 있는 DB conn 연결
			
			String sql = "SELECT * FROM employees";     //--------실행할 query문
			//1. statement => where 조건이 없으면 쓰기 편함
			//2. preparedStatement => where 조건이 있어도 쓰기 편함
			
			stmt = conn.createStatement();      //연결한 DB조회
			
			//SQL query 실행
			//rs : 조회한 결과 받아오는 객체
			rs = stmt.executeQuery(sql);
			
			//sql 결과 조회
			//ResultSet -> next() -> 다음 row가 존재하면 true, 아니면 false
			while(rs.next()) {
				//list에 서로 다른 사원 정보(=객체) row를 서로다른 객체에 저장하기 위함
				emp = new EmpDTO();
				
				emp.setEmployeeId(rs.getInt("employee_id"));    //----★★★★조회된 컬럼명 ★★★★그대도 들어가야 함 , AS 줄 경우 바뀐 명으로 가져와야 함.
				emp.setLastName(rs.getString("last_name"));
				emp.setSalary(rs.getDouble("salary"));
				emp.setHireDate(rs.getDate("hire_date"));
				//-->새로운 객체에 데이터 저장 완료
				
				list.add(emp);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//query 실행 후 연결 해제
			//문제가 생겨도 접속해제 해야됨
			disconn();
		}
		return list;
	}
	
	//2. 단건 조회
	public EmpDTO getEmployee(int employeeId) {
		EmpDTO emp = null;
		try {
			conn();
			
			String sql = "SELECT * FROM employees" + " WHERE employee_id = ?";  //쿼리문 : employees + space + WHERE 
			pstmt = conn.prepareStatement(sql);  //데이터를 넣기 전에 실행할 준비
//			pstmt.setInt(1, 입력한 숫자);
			pstmt.setInt(1, employeeId);  // ?위치에 employee_id 데이터를 넣음
			
			rs = pstmt.executeQuery();  // 쿼리실행
			
			if(rs.next()) {
				//한건만 조회하기 때문에 list에 넣을 필요 없음 ==> return emp;
				emp = new EmpDTO();
				emp.setEmployeeId(rs.getInt("employee_id"));    //----★★★★조회된 컬럼명 ★★★★그대도 들어가야 함 , AS 줄 경우 바뀐 명으로 가져와야 함.
				emp.setLastName(rs.getString("last_name"));
				emp.setSalary(rs.getDouble("salary"));
				emp.setHireDate(rs.getDate("hire_date"));
				//-->새로운 객체에 데이터 저장 완료
			}
			
		} catch (Exception e) {
			e.printStackTrace();   //오류 추적
			
		}finally {
			disconn();
		}
		return emp;
//		emp == null => rs.next() : false = 데이터 조회X
//		emp != null => rs.next() : true = 데이터 조회O
		
	}
//	==>empImpl
	
	
	
	
//	
//	3. 추가
	//매개변수로 데이터를 받아와서 insert
	public int empAdd(EmpDTO emp) {
		//데이터 입력 후 제대로 들어갔는지 사용(확인)하지 위한 용도
		//1행이 입력되었습니다.
		///result =1;
		int result =0;
		try {
			conn();
			String sql = "INSERT INTO employees" 
						+"(employee_id, last_name, email, hire_date, job_id)"
						+" VALUES (?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, emp.getEmployeeId());
			pstmt.setString(2, emp.getLastName());
			pstmt.setString(3,  emp.getEmail());
			pstmt.setDate(4, emp.getHireDate());
			pstmt.setString(5,  emp.getJobId());
			
			//DML 사용할 때 쓰는 메소드
			//반환 : 1 또는 0
			//1 : 데이터 정상 입력
			//0 : 데이터 입력 X
			result = pstmt.executeUpdate();   //result int값
			
		} catch (Exception e) {
			e.printStackTrace();		
		} finally {
			disconn();
		}
		return result;
		}
	
		
	
	
//	4. 수정
	public int empUpdate(EmpDTO emp) {
		int result=0;
		
		try {
			conn();
			
			String sql = "update employees set salary = ? where employee_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setDouble(1, emp.getSalary());
			pstmt.setInt(2, emp.getEmployeeId());
			
			result = pstmt.executeUpdate();
			
			//insert는 한건씩 추가해서 실행할 수 있지만 update, delete는 한번에 여러번 실행할 수 있음 ==> result > 0 이면 수정, 삭제된 것
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	
	
	
	
//	5. 삭제
	//중복되지 않는 데이터를 삭제해야 함.
	
	public int empDelete(int employeeId) {
		int result = 0;
		try {
			conn();
			
			String sql = "delete from employees where employee_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, employeeId);
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		
		return result;
	}
	
	
	
	
	
	
	
	
	
	
}
