package com.javaex.api.stringclass; //

import java.util.Arrays;

public class StringEx {

	public static void main(String[] args) {
		// 문자열 기본
//		stringBasic();

		// 문자열의 다양한 메서드
		usefulMethods();

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
		System.out.println("-------------------------------------------------");
		
		
		//문자열 길이 확인 : .length()
		System.out.println(".lenght():" + str.length());	//index범위 : 0~ .length()-1 
		
		System.out.println();
		System.out.println("-------------------------------------------------");
		
		
		
		//변환 메서드 
		System.out.println("toUpperCase: " + str.toUpperCase()); 	//전부 대문자로
		System.out.println("toLowerCase: " + str.toLowerCase()); 	//전부 소문자로
		
		System.out.println();
		System.out.println("-------------------------------------------------");
		
		
		
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
		System.out.println("-------------------------------------------------");
		
		
		
		//부분 문자열 출력하기 : substring
		System.out.println("str: " + str); 	
		System.out.println("substring: " + str.substring(5));		//5번부터 끝까지 출력됨  			
		System.out.println("substring: " + str.substring(5,16)); 	//시작인덱스, 끝인덱스(끝부분은 포함안됨) 
		
		System.out.println();
		System.out.println("-------------------------------------------------");
		
		
		
		//치환 : Replace 
		System.out.println("replace:" + str.replace("Programming", "Coding"));
		
		System.out.println();
		System.out.println("-------------------------------------------------");


		
		//whitespace(공백,개행, 탭문자) 지우기
		String str2 ="                Hello                  ";		//화이트 스페이스 존재
		String str3 =", Java";
		String str4 = str2.trim(); 									//화이트 스페이스 지우기 메서드
		System.out.println(str4 + str3);
		
		System.out.println();
		System.out.println("-------------------------------------------------");
		
		
		
		//원본 출력
		System.out.println("원본: " + str);			    	  	  //위에서 아무리 많이 작업했어도 원본 그대로 출력 확인
																  //문자열 데이터는 불변(immutable)이다
																  //여러가지 메서드를 통해 변화가 발생됐더라도 원본은 유지됨
		System.out.println();
		System.out.println("-------------------------------------------------");
		
		
		
		//구분자로 분리 : split()
		String[] split = str.split(" ");						//공백 문자를 기준으로 문자열을 분리 -> 문자열 배열로 변환
		
		System.out.println(Arrays.toString(split));				//->총 4개의 문자열 배열로 분절되어 출력된것을 확인 가능 
			for (String data: split) {							//위 코드를 4개의 배열로 정리해서 출력
				System.out.println("조각:" + data);
			}
		
		System.out.println();
		System.out.println("-------------------------------------------------");
		
		
		
		
		//문자열 비교 메서드 : compareTo
		//문자열 Unicode 비교해서 같으면 0 , 작으면 음수(-1), 크면 양수(1) 
		System.out.println("ABC".compareTo("ABD"));			//ABC라는 객체1이 ABD라는 객체2보다 ?/작다 -> -1 출력됨
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
