package com.yedam.employees;

import java.sql.Date;

public class EmpDTO {
	//Employees Table에 대한 정보를 담는 객체로 사용
	//DTO = Data Transfer Object(순수정보)
	//VO = Value Object (정보 + 기능 쪼금)
	//Beans = DTO, VO와 같음

	//sql employees tabel 정보
	//★★언더바 인식 -> EMPLOYEE_ID == employeeId
//	EMPLOYEE_ID    NOT NULL NUMBER(6)    
//	FIRST_NAME              VARCHAR2(20) 
//	LAST_NAME      NOT NULL VARCHAR2(25)
//	EMAIL          NOT NULL VARCHAR2(25)
//	PHONE_NUMBER            VARCHAR2(20)
//	HIRE_DATE      NOT NULL DATE
//	JOB_ID         NOT NULL VARCHAR2(10) 
//	SALARY                  NUMBER(8,2)
//	COMMISSION_PCT          NUMBER(2,2)
//	MANAGER_ID              NUMBER(6)
//	DEPARTMENT_ID           NUMBER(4)
	private int employeeId;
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	private Date hireDate;
	private String jobId;
	private double salary;
	private double commissionPct;
	private int managerId;
	private int departmentId;
	
	
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	public String getJobId() {
		return jobId;
	}
	public void setJobId(String jobId) {
		this.jobId = jobId;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getCommissionPct() {
		return commissionPct;
	}
	public void setCommissionPct(double commissionPct) {
		this.commissionPct = commissionPct;
	}
	public int getManagerId() {
		return managerId;
	}
	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	
	
	
	
	
	
}
