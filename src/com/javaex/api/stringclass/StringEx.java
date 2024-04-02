package com.javaex.api.stringclass; //

public class StringEx {

	public static void main(String[] args) {
		// 문자열 기본
		stringBasic();

		// 문자열의 다양한 메서드
//		usefulMethods();

	}// -------------------------------------------------------------------------------

	private static void stringBasic() {

		String s1 = "Java"; // 리터럴 스트링
		String s2 = new String("Java"); // 힙 메모리상에 직접 객체 새롭게 생성됨
		String s3 = "Java"; // 리터럴 스트링

		// literal String 리터럴 스트링과 new 객체 생성 스트링이 다르게 작동하는것을 알수 있다
		System.out.println(s1 == s2); // 메모리 주소 비교 위한 코드 : Literal vs new/ false 로 나올것
		System.out.println(s1 == s3); // Literal vs Literal/ true 로 나올것
										// 리터럴의 경우, 데이터가 같으면 같은 객체로 취급한다
		System.out.println(); 

		// 배열을 이용한 string 생성자-------------------------------/
		char[] letters = { 'J', 'a', 'v', 'a' };
		String s4 = new String(letters);
		System.out.println(s4);
		System.out.println(); 

		// .valueOf 메서드 -> 기본 타입을 문자열로 변환하는 메서드---------/
		String s5 = String.valueOf(2024); // int->문자열로
		System.out.println(s5);
		

	}//---------------------------------------------------------------------------------

	private static void usefulMethods() {
		
		String str = "Java Programming, OOP Programming";
		System.out.println("str: " + str); 
		
		System.out.println(); 
		System.out.println("============================================");
		
		
		//문자열 길이 확인 : .length()
		System.out.println(".lenght():" + str.length());	//index범위 : 0~ .length()-1 
		
		System.out.println();
		System.out.println("============================================");
		
		
		
		//변환 메서드 
		System.out.println("toUpperCase: " + str.toUpperCase()); 	//전부 대문자로
		System.out.println("toLowerCase: " + str.toLowerCase()); 	//전부 소문자로
		
		System.out.println();
		System.out.println("============================================");
		
		
		
		//검색 
		System.out.println("charAt: " + str.charAt(5)); 	//5번 인덱스의 글자 출력
		System.out.println();
		
		int index = 0;										//인덱스 저장 변수
		index = str.indexOf("Programming");					//str내 programming의 위치 인덱스 출력
		System.out.println("1st search: " + index);
		System.out.println();
		
		index += "Programming".length();					//검색 시작 위치를 뒤로 이동한다는 메서드
		index = str.indexOf("Programming", index);			//새로운 시작 위치에서 검색
		System.out.println("2nd search: " + index);			
		System.out.println();
		
		index += "Programming".length();					//검색 시작 위치를 뒤로 이동 
		index = str.indexOf("Programming", index);			//새로운 시작 위치에서 검색 
		System.out.println("2rd search: " + index);			//더이상 검색할것이 없으면 -1이다
		System.out.println();								// indexOf로 검색시 찾는것이 없으면 -1 이다.
															
		
		index = str.lastIndexOf("Programming");				//검색을 뒤에서부터 찾기
		System.out.println("lastIndexOf: " + index);
		
		System.out.println();
		System.out.println("===========================================");
		
		
		
		//부분 문자열 출력하기 : substring
		System.out.println("str: " + str); 	
		System.out.println("substring: " + str.substring(5));	//5번부터 끝까지 출력됨  			
		System.out.println("substring: " + str.substring(5,16)); //5~16 -1 ->5번부터 16번 인덱스 바로 앞까지 부분 범위 출력
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
