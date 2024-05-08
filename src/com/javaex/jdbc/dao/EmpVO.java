package com.javaex.jdbc.dao;

import java.sql.Date;

//데이터 전송 객체 (DTO)
//특징 -> 
//데이터 베이스 필드에 매칭되는 필드
//- getters/setters
//- 기본생성자
//- 로직포함 가급적 포함X
//- 객체관련된 toString() or equals() method 는 포함하기도 함

public class EmpVO {
	
	//필드
	private Long employeeId;
	private String fname;
	private String lname;
	private String email;
	private String pnum;
	private Date hdate;
	private String jobId;
	private long salary;
	private int cPct;
	private Long managerId;
	private int departmentId;
	
	//기본 생성자-------------
	public EmpVO() {
		
	}
	
	// 전체필드 생성자----------
	public EmpVO(Long employeeId, String fname, String lname, String email, String pnum, Date hdate, String jobId,
			long salary, int cPct, Long managerId, int departmentId) {
		super();
		this.employeeId = employeeId;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.pnum = pnum;
		this.hdate = hdate;
		this.jobId = jobId;
		this.salary = salary;
		this.cPct = cPct;
		this.managerId = managerId;
		this.departmentId = departmentId;
	}
	
	// 부분 필드 생성자---------
	public EmpVO(Long employeeId, String fname, 
			String lname, String email, 
			String pnum, Date hdate) {
	super();
	this.employeeId = employeeId;
	this.fname = fname;
	this.lname = lname;
	this.email = email;
	this.pnum = pnum;
	this.hdate = hdate;
}

	

	//getters, setters -----

	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPnum() {
		return pnum;
	}

	public void setPnum(String pnum) {
		this.pnum = pnum;
	}

	public Date getHdate() {
		return hdate;
	}

	public void setHdate(Date hdate) {
		this.hdate = hdate;
	}

	public String getJobId() {
		return jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public int getcPct() {
		return cPct;
	}

	public void setcPct(int cPct) {
		this.cPct = cPct;
	}

	public Long getManagerId() {
		return managerId;
	}

	public void setManagerId(Long managerId) {
		this.managerId = managerId;
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	
	// ToString
	@Override
	public String toString() {
		return "EmpVO [employeeId=" + employeeId + ", fname=" + fname + ", lname=" + lname + ", email=" + email
				+ ", pnum=" + pnum + ", hdate=" + hdate + ", jobId=" + jobId + ", salary=" + salary + ", cPct=" + cPct
				+ ", managerId=" + managerId + ", departmentId=" + departmentId + "]";
	}
	
	
	
	
	
	
	

}
