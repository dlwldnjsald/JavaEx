package com.javaex.jdbc.dao;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class DAOApp {

	public static void main(String[] args) {
		listAuthors();
		System.out.println();
		
//		insertAuthor(); // 키보드로 이름과 정보입력해서 dao-insert 수행후
//		updateAuthor();
//		getAuthor();
		deleteAuthor();
		System.out.println();
		
		listAuthors(); // 여기서 확인예정
		System.out.println();
	}
	//-----------------------------------------------

	
	private static void listAuthors() {
		//인스턴스 생성
		AuthorDAO dao = new AuthorDAOImplOracle();
		//타이틀 목록 출력
		System.out.println("================Authors===================");
		
		//get data from db and list변수에 저장
		List<AuthorVO> list = dao.getList();
			//if 조건문 돌기 -작가 목록이 비어있지 않은지여부 확인
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

		System.out.print("이름:");
		String name = scanner.nextLine();

		System.out.print("정보:");
		String desc = scanner.nextLine();

		
		// AuthorVO 클래스의 정보 불러오기 vo 객체 생성
		AuthorVO vo = new AuthorVO(name, desc);
		// AuthorDAO는 인터 페이스라 실제 객체 AuthorDAOImplOracle 호출
		AuthorDAO dao = new AuthorDAOImplOracle();
		//insert() 메서드를 사용하여 새로운 작가 정보를 데이터베이스에 삽입
		boolean success = dao.insert(vo); 
		//boolean 타입으로 출력 
		System.out.println("Author INSERT " + (success ? "성공" : "실패")); // 3항연산

		
		scanner.close();
		

	}
	//-----------------------------------------------

	private static void updateAuthor() {
		
		//scanner 호출
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("변경할 레코드 ID:");
		Long authorId = Long.parseLong(scanner.nextLine());
		
		System.out.print("이름:");
		String name = scanner.nextLine();
		
		System.out.print("정보:");
		String desc = scanner.nextLine();
		
		
		AuthorVO vo = new AuthorVO(authorId, name, desc);
		AuthorDAO dao = new AuthorDAOImplOracle();
		boolean success = dao.update(vo);
		
		
		System.out.println("Author UPDATE: " + (success ? "성공" : "실패"));
		scanner.close();
	
	}
	//--------------------------------------------------
	
	private static void getAuthor() {
		
		//Scanner 호출
		Scanner scanner = new Scanner(System.in);
		System.out.print("레코드 ID:");
		Long authorId = Long.parseLong(scanner.nextLine());
		
		AuthorDAO dao = new AuthorDAOImplOracle();
		AuthorVO vo = dao.get(authorId);
		
		if (vo != null) {
			System.out.printf("%d\t%s\t%s\n", vo.getAuthorId(), vo.getAuthorName(), vo.getAuthorDesc());
		} else {
			System.out.println("레코드를 찾지 못했습니다.");
		}
		
		scanner.close();
	}
	//-----------------------------------------------------
	
	private static void deleteAuthor() {
		
		//scanner open
		Scanner scanner = new Scanner(System.in);
		System.out.print("삭제할 레코드 ID:");
		Long authorId = Long.parseLong(scanner.nextLine());
		
		AuthorDAO dao = new AuthorDAOImplOracle();
		boolean success = dao.delete(authorId);
		
		System.out.println("Author DELETE " + (success ? "성공" : "실패"));
		
	}
	
}
