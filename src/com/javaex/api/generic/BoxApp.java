package com.javaex.api.generic;

public class BoxApp {

	public static void main(String[] args) {
		
		//내부에 오직 String만 저장 가능하다
		StringBox strBox = new StringBox();
		strBox.setContent("Generic");
		
		String retStr = strBox.getContent();
		System.out.println(retStr);
		
		//내부에 오직 Integer만 저장 가능한 클래스
		IntBox intBox = new IntBox();
		intBox.setContent(2024);
		
		Integer retInt = intBox.getContent();
		System.out.println(retInt);
		
		System.out.println();
		//타입별로 처리할수 있는 모든 객체를 만들어야 한다?
		//->Object를 처리할 수 있는 개체를 만들면 모든 객체를 처리할수있는 만능 클라스가 됨
		
		
		
		
		//모든것을 다 담을수 있는 객체
		ObjectBox objBox = new ObjectBox();
		objBox.setContent("Object Box");
		
		String obj = (String)objBox.getContent();		//(String)이렇게 캐스팅의 불편함
		System.out.println(obj);
		
		objBox.setContent(2024);
		Integer objInt = (Integer)objBox.getContent();	
		
		System.out.println(objInt);						//캐스팅 불편함
		//문제점
		//1. setter에서 전달되는 매개변수의 타입을 제한할 수 없다
		//2. 데이터를 받아올 때, 캐스팅이 필요하다 Object-> 실제 클래스로의 변환 (번거로움)
		
//		String obj2 = (String)objBox.getContent();	//잘못 캐스팅하면 오류가 발생 위에 int로 정의되있는것을 string으로 해서
		System.out.println();
		
		
		//GenericBox
		//내부 데이터 타입을 외부에서 객체화 시점에서 결정해준다
		GenericBox<String> genericStrBox = new GenericBox<String>(); //new GenericBox<>(); 리턴타입 이렇게 생략 가능
		//내부 데이터를 스트링 타입으로 결정
		genericStrBox.setContent("Generic Box");
//		genericStrBox.setContent(2024);           //int형 데이터가 들어갈수 없음, 컴파일 시점에서 내부 입력데이터 체크
		
		String objStr = genericStrBox.getContent();
		//내부 저장 데이터가 지정되어 있기 때문에 캐스팅 불필요하다
		System.out.println(objStr);
		
		
		
		
		
		
	}

}
