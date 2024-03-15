package com.javaex.basic.types;

public class CharEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// char : 문자 1개의 유니코드를 저장
		//       내부적으로는 숫자 코드지만 출력시 상용하는 문자 1개/
		//        홑따옴표 = 문자 1개 ' ' 
        char ch1 = 'A';  // " " 말고 홑따옴표 써야 스트링으로 인식방지됨
        char ch2 = '한';
        
        System.out.println(ch1);
        System.out.println(ch2);
        
        System.out.println(ch1 + ch2);
        
        String str = "A한"; // " "는 문자열 string을 표시
	}

}

//-------------------------------------------------------------------

// 유니코드
// 1바이트는 8비트 
//  A ; 65
//  B ; 66
//  ....

//개행문자 / " \ $ 이것도 다 문자

//한중일 

////연습문제
//: 변수와 자료형
//
// 괄호 안에 적절한 데이터 타입을 기술하시오
//(Int ) number; // 학번
//(String) name; // 이름
//(Boolean) isEnrolled; // 등록 여부
//(Float ) grade; // 평점
//(String ) address; // 주소
//(String) major; // 전공
//(Int) unit; // 이수 학점
//(Boolean) haveMinor; // 부전공 여부
//(Int)juminNo; // 주민번호(-없이 13자리숫자) //순서 중요할시 int형
//(String) cellphone; // 핸드폰 번호(-포함한 숫자)// -포함시켰기때문에 문자로 표시하기
//(Int) age; // 나이
//(Int) email; // 이메일주소

//------------------------------------------------------------------------


