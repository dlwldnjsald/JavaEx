package com.javaex.api.objectclass.ex1;

public class LangClassTest {

	public static void main(String[] args) {
		// object 클래스의 기본 메서드를

		Point p = new Point(10, 10); // new(생성자호출) point라고 하는 인스턴스가 생성됨

		// 자바의 최상위 클래스는 object이다 ->모든 기능을 물려받는다.
		System.out.println(p.getClass().getName()); // p의 오브젝트가 갖고있는 getClass정보를 얻어와서 클래스이름 (getName())을 얻어와라
													// 클래스이름반환

		System.out.println(p.hashCode()); // 해쉬코드는 객체식별값을 반환해주는 코드/해당인스턴스가 갖고있는 정수값 반환
											// 기본정보는 메모리주소

		System.out.println(p.toString()); // 객체의 내용을 문자열로 출력하는 기능을 담당
											// 양식은 출력에 보면 알수있듯 class이름@메모리주소(16진수)로 출력된다

		System.out.println(p); // 위의 라인의 코드와 이코드 비교해보기 /위와 아래의 코드 출력값이 동일한것을 알수 있는데
								// 출력코드 or 문자열과 결합될때 toString 사용한다
								// 이를 다시 point(0,0)의 형태로 출력하고 싶을때 (toString()을 오버라이드 하면 된다)
		// p의 부모 객체 정보 확인해보기
		System.out.println(p.getClass() // 현재 클래스 정보
				.getSuperclass() // 현재 클래스의 부모 클래스 정보
				.getName()); // 이름 확인

		Point p2 = new Point(10, 10);
		System.out.println(p2.hashCode()); // hashCode
											// 위의 p1과 p2의 hashCode가 다르게 출력 그래서 = sign 쓸수 없는 이유

		// 1) 오버라이드 하기전 
		//위의 출력결과 값
//		com.javaex.api.objectclass.ex1.Point
//		664740647
//		com.javaex.api.objectclass.ex1.Point@279f2327
//		com.javaex.api.objectclass.ex1.Point@279f2327
//		java.lang.Object
//		804564176
	}

}

//		Object의 toString : getClass().getName() + “@” + Integer.toHexString(hashCode())
