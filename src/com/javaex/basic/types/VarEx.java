package com.javaex.basic.types;

public class VarEx {
	public static void main(String[] args) {
        //변수: 영어,숫자, $, _언더바의 조합으로 생성
		// 숫자로 시작하면 안됨
		//관례: 소문자로 작성, 단어의 조합일 경우 및 단어의 첫글자는 대문자
		
		int myAge;  // 선언
		myAge = 52; // 초기화
		
		//한번 정해진 데이터타입은 변경되지 않는다
		//만약에 정수데이터를 섢언후 초기화시켰는데
//		myAge = "쉰둘";은 오류뜨게됨
		
		// 조회
		System.out.println(myAge);
		
		int myAge2 = 52; // 선언과 동시 초기화 하면 됨
		
		//여러 변수를 한번에 선언할 시
		int v1 = 10, v2 = 20, v3 = 30;
		System.out.println(v1);
		System.out.println(v2);				
		System.out.println(v3);		
		//
		v1 = v2 = v3 = 40; //40이 v3에 들어가고 그게 다시 v2에들어가고 다시 v1들어갈것 예상가능
		System.out.println(v1);
		System.out.println(v2);				
		System.out.println(v3);		
		
	}
}
