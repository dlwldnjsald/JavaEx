package com.javaex.jdbc.dao;

import java.util.List;

// interface 

public interface AuthorDAO {
	// List - SELECT 쿼리
	
	public List<AuthorVO> getList(); // 전체 목록
	
	public AuthorVO get(Long id);    // pk로 객체 찾기
	public boolean insert(AuthorVO authorVo);	//레코드 삽입
	public boolean delete(Long id);				//pk로 객체 삭제
	public boolean update(AuthorVO authorVo);	//레코드 갱신
	
}
