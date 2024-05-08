package com.javaex.jdbc.dao;

import java.util.List;

// interface 

public interface AuthorDAO {
	// List - SELECT 쿼리
	
	public List<AuthorVO> getList();
	
}
