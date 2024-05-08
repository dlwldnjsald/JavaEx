package com.javaex.jdbc.dao;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class DAOApp {

	public static void main(String[] args) {
		listAuthors();
		System.out.println();
		
		insertAuthor(); // 키보드로 이름과 정보입력해서 dao-insert 수행후
		System.out.println();
		
		listAuthors(); // 여기서 확인예정
		System.out.println();
	}
	//-----------------------------------------------

	
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
				System.out.printf("%d\t%s\t%s%n", vo.getAuthorId(), vo.getAuthorName(), vo.getAuthorDesc());
			}

		} else {
			System.out.println("데이터가 없습니다.");

		}

	}
	//-----------------------------------------------
	
	private static void insertAuthor() {
		
		// scanner 호출
		Scanner scanner = new Scanner(System.in);

		System.out.println("이름:");
		String name = scanner.nextLine();

		System.out.println("정보:");
		String desc = scanner.nextLine();

		
		// AuthorVO 클래스의 정보 불러오기
		AuthorVO vo = new AuthorVO(name, desc);
		// AuthorDAO는 인터 페이스라 실제 객체 AuthorDAOImplOracle 호출
		AuthorDAO dao = new AuthorDAOImplOracle();
		boolean success = dao.insert(vo);

		System.out.println("Author INSERT " + (success ? "성공" : "실패")); // 3항연산

		
		scanner.close();

	}
	//-----------------------------------------------


}
