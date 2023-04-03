package com.yedam.hworkclass;

public class EmpDept extends Employee {
	String depName;
	
	public void EmpDept(String name, int salary, String depName) {
		this.name = name;
		this.salary=salary;
		this.depName = depName;
	}
	
	

	@Override
	public void getInformation() {
		System.out.println(name);
		System.out.println(salary);
		System.out.println(depName);
	}

	@Override
	public void print() {
		System.out.println("수퍼클래스\n서브클래스");
	}
	
	

	
	
}
