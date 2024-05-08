package com.javaex.jdbc.dao;

import java.util.List;

// interface
public interface EmpDAO {

	//List - SELECT 쿼리
	
	public List<EmpVO> getList();
	
	public EmpVO get(Long id);
	public boolean insert(EmpVO empvo);
	public boolean delete(Long id);
	public boolean update(EmpVO empvo);
	
}
