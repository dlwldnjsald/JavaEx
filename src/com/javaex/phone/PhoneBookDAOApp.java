package com.javaex.phone;

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
				System.out.print("*****************************************");
				
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
				System.out.printf("%d\t%s\t%s\t%s%n", 
						vo.getId(), vo.getName(), vo.getHp(), vo.getTel());
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
		    // next() 대신 nextLine()으로 변경하여 한 줄씩 입력을 받음
		    String name = scanner.nextLine();

		    System.out.println(">휴대전화: ");
		    String hp = scanner.nextLine();

		    System.out.println(">회사전화: ");
		    String tel = scanner.nextLine();

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
			
			// nextLine으로 변경하여 문자열로 입력 받음
			 int index = Integer.parseInt(scanner.nextLine()); 

	            if (index >= 0) {
	                boolean deleteSuccess = dao.delete(index);

	                if (deleteSuccess) {
	                    System.out.println("데이터가 삭제되었습니다.");
	                } else {
	                    System.out.println("데이터 삭제에 실패했습니다.");
	                }
	                
	            } else {
	                System.out.println("유효하지 않은 인덱스입니다.");
	            }
	        } catch (NumberFormatException e) { // 정수로 변환할 수 없는 경우 처리
	            System.out.println("잘못된 입력입니다. 정수를 입력하세요.");
	        }
	    }
	
	//-----------------------------------------------

	//인덱스를 리스트로부터 검색하는 메서드
	
	 private static void search (Scanner scanner) {
	
			    System.out.print("검색할 id를 입력하세요: ");
			    int id = Integer.parseInt(scanner.nextLine());

			    PhoneBookDAO dao = new PhoneBookDAOImplOracle();
			    PhoneBookVO vo = dao.search(id);

			    if (vo != null) {
			        System.out.printf("%d\t%s\t%s\t%s%n", vo.getId(), vo.getName(), vo.getHp(), vo.getTel());
			    } else {
			        System.out.println("해당 id의 연락처를 찾을 수 없습니다.");
			    }
			    
			}
	}
		
	    
	 		
	
	
