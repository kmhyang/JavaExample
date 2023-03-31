package com.yedam.hworkclass;

public class ApplicationEmp {
	public static void main(String[] args) {
		EmpDept dep = new EmpDept();
		
		dep.name = "이지나";
		dep.salary = 3000;
		dep.depName = "교육부";
		
		dep.getInformation();
		dep.print();
		
		
	}
}
