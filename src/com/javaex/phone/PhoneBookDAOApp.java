package com.javaex.phone;

import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

//Java에서 JDBC를 사용하여 Oracle 데이터베이스와 통신하고 
//CRUD(Create, Read, Update, Delete) 작업을 수행하는 DAO(Data Access Object) 
//및 데이터 전송 객체인 DTO(Data Transfer Object)를 구현
public class PhoneBookDAOApp {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("\n**********************************************");
		System.out.println("*            전화번호 관리 프로그램             *");
		System.out.println("************************************************");
		System.out.println("1. 리스트  2. 등록  3. 삭제  4. 검색  5. 종료");

		boolean running = true;

		while (running) {

			System.out.print("메뉴 번호: ");
			String menu = scanner.nextLine();

			switch (menu) {
			case "1":
				getList(scanner); // getList
				break;//브레이크 안할경우 연속으로 케이스1->2->3진행되는오류 주의 
				
			case "2":
				insert(scanner); // insert
				break;
				
			case "3":
				delete(scanner);// delete
				break;
				
			case "4":
				search(scanner); // search
				break;
				
			case "5":
				// 종료 메세지 출력
				System.out.println("\n***************************************");
				System.out.println("*           감사합니다.                 *");
				System.out.println("*****************************************");
				
				// 반복 종료를 위해 true-> false 입력
				running = false; 
				break;
				
			default:
				System.out.print("[다시 입력해주세요]");

			}
		}

		System.out.println();

		scanner.close();

	}

	//-----------------------------------------------
	private static void getList(Scanner scanner) {
		
		System.out.println();
		System.out.println("<1.리스트>");
		
		PhoneBookDAO dao = new PhoneBookDAOImplOracle();

		List<PhoneBookVO> list = dao.getList();

		if (list.size() > 0) {
			// iterator 불러오기
			Iterator<PhoneBookVO> it = list.iterator();
			// iterator 순회
			while (it.hasNext()) {
				PhoneBookVO vo = it.next();
				System.out.printf("%d\t%s\t%s\t%s%n", vo.getId(), vo.getName(), vo.getHp(), vo.getTel());
			}

		} else {
			System.out.println("HAVE NO DATA");

		}
	}
	
	//-----------------------------------------------

	private static void insert(Scanner scanner) {
		
		System.out.println();
		System.out.println("<2.등록>");

		System.out.println(">이름: ");
		String name = scanner.next();

		System.out.println(">휴대전화: ");
		String hp = scanner.next();

		System.out.println(">회사전화: ");
		String tel = scanner.next();

		PhoneBookDAO dao = new PhoneBookDAOImplOracle();

		PhoneBookVO newEntry = new PhoneBookVO();
		newEntry.setName(name);
		newEntry.setHp(hp);
		newEntry.setTel(tel);

		dao.insert(newEntry);
	}

	//-----------------------------------------------
	
	private static void delete(Scanner scanner) {
		
		System.out.println();
		System.out.println("<3. 삭제>");

		// PhoneBookDAO 인터페이스를 구현한 클래스의 인스턴스 생성
		PhoneBookDAO dao = new PhoneBookDAOImplOracle();

		try {

			// 삭제할 데이터의 인덱스를 입력 받음
			System.out.print("삭제할 데이터의 인덱스를 입력하세요: ");
			int index = scanner.nextInt();

			// 입력 받은 인덱스를 기반으로 PhoneBookVO 객체 생성
			PhoneBookVO newEntry = new PhoneBookVO();
			newEntry.setId(index); // 세팅해줌

			// 삭제할 데이터의 인덱스가 유효한지 확인 후 삭제
			if (index >= 0) {
				boolean deleteSuccess = dao.delete(newEntry);

				if (deleteSuccess) {
					System.out.println("데이터가 삭제되었습니다.");
				} else {
					System.out.println("데이터 삭제에 실패했습니다.");
				}
				
			} else {
				System.out.println("유효하지 않은 인덱스입니다.");
			}

		} catch (InputMismatchException e) {
			System.out.println("잘못된 입력입니다. 정수를 입력하세요.");
		}

	}
	
	//-----------------------------------------------

	//해당 메서드가 검색 결과를 리턴하는 형태여야함
	
	private static void search(Scanner scanner) {
		
		System.out.println();
		System.out.println("<4. 검색 >");
		
		 // 검색할 아이디 입력 받음
	    System.out.print("검색할PhoneBookVO id 입력하세요: ");
	    int id = scanner.nextInt();
	   
		// PhoneBookDAO 인터페이스를 구현한 클래스의 인스턴스 생성
	    PhoneBookDAO dao = new PhoneBookDAOImplOracle();
	    
	    // 입력 받은 이름을 기반으로 PhoneBookVO 객체를 생성하여 리스트에서 검색
	     searchList = dao.search(id);
	    
		if (searchList.size() > 0) {
			// iterator 불러오기
			Iterator<PhoneBookVO> it = searchList.iterator();
			// iterator 순회
			while (it.hasNext()) {
				PhoneBookVO vo = it.next();
				System.out.printf("%d\t%s\t%s\t%s%n", 
						vo.getId(), vo.getName(), vo.getHp(), vo.getTel());
			}

		} else {
			System.out.println("HAVE NO DATA");

		}
	}
		
	}

