package com.javaex.jdbc.dao;

import java.util.Iterator;
import java.util.List;

public class DAOApp {

	public static void main(String[] args) {
		listAuthors();

	}
	
	private static void listAuthors() {
		AuthorDAO dao = new AuthorDAOImplOracle();
		System.out.println("================Authors===================");
		
		List<AuthorVO> list = dao.getList();
		if (list.size() > 0) {
			// iterator 불러오기
			Iterator<AuthorVO> it = list.iterator();
			// iterator 순회
			while (it.hasNext()) {
				AuthorVO vo = it.next();
				System.out.printf("%d\t%s\t%s%n", vo.getAuthorId(),
												vo.getAuthorName(),
												vo.getAuthorDesc());
			}
			
		} else {
			System.out.println("데이터가 없습니다.");
		
		}
		
	}
	
	
}
