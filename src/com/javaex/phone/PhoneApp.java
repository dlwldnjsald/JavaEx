package com.javaex.phone;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

//--------------------------------------------------
class PhoneData {
	
//name, hp, tel. 변수 선언
	private String name;
	private String hp;
	private String tel;
	
	
	//기본 생성자 만들기
	public PhoneData (String name, String hp, String tel) {
		super();
		this.name = name;
		this.hp = hp;
		this.tel = tel;
		System.out.println(name + hp + tel);
		
	}

	//name, hp, tel에 대한 getter setter
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getHp() {
		return hp;
	}


	public void setHp(String hp) {
		this.hp = hp;
	}


	public String getTel() {
		return tel;
	}


	public void setTel(String tel) {
		this.tel = tel;
	}

	@Override
	public String toString() {
		return "PhoneData [name=" + name + " hp=" + hp + " tel=" + tel + "]";
	}

	//to String 으로 오버라이드 해주기
	
}	

//--------------------------------------------------------------------------------

public class PhoneApp {
	private static String rootPath = System.getProperty("user.dir");
	private static String filename = rootPath + "PhoneDB.txt";

	public static void main(String[] args) {
		
		List<PhoneData> lst = new LinkedList<>(); 
		
//		System.out.println("**************************************************************");
//		System.out.println("*                     전화번호 관리 프로그램                       *");
//		System.out.println("**************************************************************");
//		
//		System.out.println("1.리스트  2.등록  3.삭제  4.검색  5.종료 " + "\n" +
//							"--------------------------------------------------------------");
//		
//		
//		
//		
		
		//1) PhoneData 객체 3개 만들고-------------------------리스트-----------------
		//	lst에 추가
		System.out.println("<1.리스트>");
		
		PhoneData s1 = new PhoneData("1. 고길동,","010-8788-8881,","032-8890-2974");
		PhoneData s2 = new PhoneData("2. 둘리,","010-1212-3434,","02-5678-8765");
		PhoneData s3 = new PhoneData("3. 마이콜,","010-7102-6327,","02-9192-5069");
		PhoneData s4 = new PhoneData("4. 또치,","010-6514-5113,","02-7976-9368");
		PhoneData s5 = new PhoneData("5. 홍길동,","010-7777-7777,","02-3333-3333");
		
	
//		
		lst.add(s1); lst.add(s2); lst.add(s3); lst.add(s4); lst.add(s5);
		
		
		System.out.println(	"1. " + s1 + "\n" + "2. "+ s2 + 
				"\n" +"3. " + s3 + "\n" + "4. " + s4 + "\n" +"5. "+ s5 );
		
		
		//2) scanner에서 name, hp,tel 입력받아서 --------------등록--------------------
		//폰데이터 클래스 객체화하고 
		//리스트에 추가하는 방법 
		Scanner scanner = new Scanner(System.in); 	//scanner의 객체를 생성해주기
		
		System.out.println();
		System.out.println("<2.등록>");
		
		System.out.println(">이름: ");
		String name = scanner.next(); 			//문자열에 대한 값을 입력받을때 사용할수 있는 함수 코드
		
		System.out.println(">휴대전화: ");
		String hp= scanner.next(); 			//문자열에 대한 값을 입력받을때 사용할수 있는 함수 코드
		
		System.out.println(">회사전화: ");
		String tel= scanner.next(); 			//문자열에 대한 값을 입력받을때 사용할수 있는 함수 코드
		
		
		//PhoneData 클래스 인스턴스 생성
		PhoneData phonedata = new PhoneData(name, hp, tel);
		
		//add
		lst.add(phonedata); 
		
		System.out.println(lst);
		
		
		//3) 삭제하는 방법----------------------------------------------------------
		
		System.out.println();
		System.out.println("<3. 삭제>");
		
		//string 담는 ArrayList 생성하기(객체생성단계) + ArrayList import하기
		ArrayList<PhoneData> a1 = new ArrayList<>();
		
		//추가 .add();
		a1.add(s1);
		a1.add(s2);
		a1.add(s3);
		a1.add(s4);
		a1.add(s5);
		
		int a2 = scanner.nextInt();
		a1.remove(a2-1); // a1데이터의 인덱스 번호 (n-1//0부터시작하므로)를 리무브
		
		System.out.println(a1);
		System.out.println("[삭제되었습니다.]");
				
		
		//4) 검색하는 방법----------------------------------------------------------
		
		System.out.println();
		System.out.println(">메뉴번호: ");
		
		int a3 = scanner.nextInt();
		a1.indexOf(a3-1);
		
		
		
		System.out.println("[다시 입력해주세요]");
		
		
		
	
		//5) 종료하는 방법----------------------------------------------------------
		
		System.out.println("1.리스트  2.등록  3.삭제  4.검색  5.종료 " + "\n" +
				"--------------------------------------------------------------");
		
		System.out.println("**************************************************************");
		System.out.println("*                            감사합니다                         *");
		System.out.println("**************************************************************");
				

		scanner.close();
		
		
		
		
		
		
		
		
	}

}
