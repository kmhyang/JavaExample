package com.yedam.department;

import java.util.Scanner;
import java.util.List;

public class DptImpl {

	Scanner sc = new Scanner(System.in);
	
	//1. 전체 조회
	public void getDepartmensList() {
		List<DepDTO> list = DepDAO.getInstance().getDepartmentsList();
		
		for(int i=0; i<list.size(); i++) {
			System.out.println("부서 번호 : "+list.get(i).getDepartmentId());
			System.out.println("부서 이름 : "+list.get(i).getDepartmentName());
			System.out.println("관 리 자 : "+list.get(i).getManagerId());
			System.out.println("부서 위치 : "+list.get(i).getLocationId());
			
		}
	}
	
	
	//2. 단건조회
	public void getDepartment() {
		System.out.println("조회할 부서 번호>");
		int departmentId = Integer.parseInt(sc.nextLine());
		DepDTO dep = DepDAO.getInstance().getDepartment(departmentId);
		
		if(dep == null) {
			System.out.println("해당 부서번호는 존재하지 않습니다.");
		}else {
			System.out.println("부서 번호 : "+dep.getDepartmentId());
			System.out.println("부서 이름 : "+dep.getDepartmentName());
			System.out.println("관 리 자 : "+dep.getManagerId());
			System.out.println("부서 위치 : "+dep.getLocationId());
		}
	}
	
	
//	3. 추가
	public void depAdd() {
		DepDTO dep = new DepDTO();
		
		System.out.println("부서 번호> ");
		int depId = Integer.parseInt(sc.nextLine());
		System.out.println("부서 이름> ");
		String depName = sc.nextLine();
//		System.out.println("사수 사번> ");
//		int manId = Integer.parseInt(sc.nextLine());
		
		dep.setDepartmentId(depId);
		dep.setDepartmentName(depName);
//		dep.setManagerId(manId);
		
		int result = DepDAO.getInstance().depAdd(dep);
		
		if(result == 1) {
			System.out.println("데이터 입력 성공");
		}else {
			System.out.println("데이터 입력 실패");
		}
		
	}
	
//	4. 수정
	public void depUpdate() {
		DepDTO dep = new DepDTO();
		System.out.println("부서 번호>");
		int depId = Integer.parseInt(sc.nextLine());
		System.out.println("변경할 관리자 번호>");
		int manId = Integer.parseInt(sc.nextLine());
		
		dep.setManagerId(depId);
		dep.setManagerId(manId);
		int result = DepDAO.getInstance().depUpdate(dep);
		if(result > 0) {
			System.out.println("수정 완료");
		}else {
			System.out.println("수정 실패");
		}
	}
	
//	5. 삭제
	public void depDel() {
		System.out.println("삭제할 부서 번호>");
		int depId = Integer.parseInt(sc.nextLine());
		
		int result = DepDAO.getInstance().depDel(depId);
		
		if(result > 0) {
			System.out.println("삭제 성공");
		}else {
			System.out.println("삭제 실패");
		}
	}
	
	
	
}
