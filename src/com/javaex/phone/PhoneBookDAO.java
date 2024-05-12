package com.javaex.phone;

import java.util.List;

import com.javaex.jdbc.dao.EmpVO;

// 2. DAO interface 클래스 구현하여 CRUD 메서드 정의 해보기 
public interface PhoneBookDAO {

	
	public List<PhoneBookVO> getList(); 
	public boolean insert(PhoneBookVO phonebookvo);
	public boolean delete(PhoneBookVO phonebookvo);
	public PhoneBookVO search(int id);
	
	
	
	
}
