package com.javaex.opp.staticmember;////dd

//static 영역 활용//ss
//단 하나의 인스턴스만 유지
//new Singleton() -> x
	
public class Singleton {
	private static Singleton instance = new Singleton();
	
	private Singleton() {    //new 생성 불가
		
	}
	
	//getter , setter 설정
	public static Singleton getInstance() {    //getter를 통한 우회접근 시작
		return instance; 				//유일한 인스턴스 반환
		
	}
	

}
