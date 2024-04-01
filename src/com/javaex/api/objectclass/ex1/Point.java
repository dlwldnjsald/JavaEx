package com.javaex.api.objectclass.ex1;

//모든 객체의 최상위 객체는 object다
//object클래스는 객체가 개채로서의 기능을 수행하기 위한 기본적 기능들을 구현

public class Point { // extends java.lang.Object가 생략된 것 임을 알수있다

	// 필드
	private int x;
	private int y;

	// 생성자
	public Point(int x, int y) {
		// 생성자로부터 전달된 파라미터들을 내부 필드에 초기화
		this.x = x;
		this.y = y;
	}

//		toString() : 객체의 정보를 문자열로 출력할때 호출되는 메서드이다
	@Override
	public String toString() {
		return "Point(" + x + "," + y + ")";

	}

}

//오버라이드 하고 난 후 출력 결과값
//com.javaex.api.objectclass.ex1.Point
//664740647
//Point(10,10)
//Point(10,10)
//java.lang.Object
//804564176

