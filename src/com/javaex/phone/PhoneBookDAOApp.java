package com.javaex.phone;

import java.util.ArrayList;
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

		while(running == true) {

			System.out.print("메뉴 번호: ");

			String menu = scanner.nextLine();

			switch (menu) {
			case "1":
				listPhone(scanner); // 전화번호 목록 표시
				break;
			case "2":
				insertBook(scanner); // 새 전화번호 등록
				break;
			case "3" : 
				deleteBook(scanner);// 전화번호 삭제
				break;
			case "4":
				getBook(scanner); // 전화번호 검색
				break;
			case "5":
				// 종료 메세지 출력
				System.out.println("\n***************************************");
				System.out.println("*           감사합니다.                 *");
				System.out.println("*****************************************");
				running = false; //반복 종료
				break;
			default:

			}
		}

		System.out.println();	

		scanner.close();

	}
    
    private static void listPhone(Scanner scanner) {
        PhoneBookDAO dao = new PhoneBookDAOImplOracle();
        System.out.println("<1.리스트>");

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

    private static void insertBook(Scanner scanner) {
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
    
    private static void deleteBook(Scanner scanner) {
        System.out.println();
        System.out.println("<3. 삭제>");
        
        // 삭제할 데이터의 인덱스를 입력 받음
        System.out.print("삭제할 데이터의 인덱스를 입력하세요: ");
        int index = scanner.nextInt();

        // 삭제할 데이터의 인덱스가 유효한지 확인 후 삭제
        if (index >= 0 && index < list.size()) {
            a1.remove(index);
            System.out.println("데이터가 삭제되었습니다.");
        } else {
            System.out.println("유효하지 않은 인덱스입니다.");
        }
    }
}