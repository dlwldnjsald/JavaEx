package com.javaex.opp.staticmember;

public class StaticEx {
	
	public static int refCount;				//클래스 변수    //refCount변수의 목적은 생성된 모든 인스턴스의 갯수
	public static String classVar; 			//클래스 변수
	public String instanceVar;				//인스턴스 변수 (선언);
	
	// 스태틱 블록으로 클래스 변수 초기화하기
	static {
		refCount = 0; 		//(스태틱 변수 초기화)
		classVar = "Static Member"; 	//클래스 변수 접근    (초기화)
//		instanceVar = "Instance Member";	인스턴스 변수의 접근은 불가하기 때문에 여기다 코드입력시 오류가 난다 
		
		System.out.println("클래스 영역 초기화");
		
		//static영역에선 static영역만 접근 가능함
	}
	
	//생성자   //(2)호출된 생성자로 아래와 같이...
	public StaticEx() {
		refCount ++;		//인스턴스가 생성될 때, 객체 카운트를 증가
		System.out.println("refCount: " + refCount);
		System.out.println("Instance 생성!");
		
		System.out.println("--------------------");
		//----------------------------------------
	}
    		
	//소멸자
	@Override
	protected void finalize() throws Throwable{
		refCount --;
		//객체가 소멸될 때 참조 카운트를 줄인다
		super.finalize();
		System.out.println("소멸자 호출");
	}
	
	
	
	
}
