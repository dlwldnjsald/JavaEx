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
	private Long employeeid;
	private String fname;
	private String lname;
	private String email;
	private String pnum;
	private Date hdate;
	private String jobid;
	private long salary;
	private int cpct;
	private Long managerid;
	private int departmentid;
	
	//기본 생성자-------------
	public EmpVO() {
		
	}
	
	// 전체필드 생성자----------
	public EmpVO(Long employeeid, String fname, String lname, String email, String pnum, Date hdate, String jobid,
			long salary, int cpct, Long managerid, int departmentid) {
		super();
		this.employeeid = employeeid;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.pnum = pnum;
		this.hdate = hdate;
		this.jobid = jobid;
		this.salary = salary;
		this.cpct = cpct;
		this.managerid = managerid;
		this.departmentid = departmentid;
	}
	
	// 부분 필드 생성자---------
	public EmpVO(Long employeeid, String fname, 
			String lname, String email, 
			String pnum, Date hdate) {
	super();
	this.employeeid = employeeid;
	this.fname = fname;
	this.lname = lname;
	this.email = email;
	this.pnum = pnum;
	this.hdate = hdate;
}

	

	//getters, setters -----

	public Long getEmployeeId() {
		return employeeid;
	}

	public void setEmployeeId(Long employeeid) {
		this.employeeid = employeeid;
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
		return jobid;
	}

	public void setJobId(String jobid) {
		this.jobid = jobid;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public int getcPct() {
		return cpct;
	}

	public void setcPct(int cpct) {
		this.cpct = cpct;
	}

	public Long getManagerId() {
		return managerid;
	}

	public void setManagerId(Long managerid) {
		this.managerid = managerid;
	}

	public int getDepartmentId() {
		return departmentid;
	}

	public void setDepartmentId(int departmentid) {
		this.departmentid = departmentid;
	}

	
	// ToString
	@Override
	public String toString() {
		return "EmpVO [employeeId=" + employeeid + ", fname=" + fname + ", lname=" + lname + ", email=" + email
				+ ", pnum=" + pnum + ", hdate=" + hdate + ", jobId=" + jobid + ", salary=" + salary + ", cPct=" + cpct
				+ ", managerId=" + managerid + ", departmentId=" + departmentid + "]";
	}
	
	
	
	
	
	
	

}
