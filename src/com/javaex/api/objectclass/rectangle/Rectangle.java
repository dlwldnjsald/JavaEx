package com.javaex.api.objectclass.rectangle;

public class Rectangle {

	// 필드 선언
	private int width;
	private int height; // 프라이빗으로 선언해주기

	// 생성자
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;

	}

	// 면적 구하는 메서드 적어주기// 이부분 빼먹음....
	public int area() {
		return width * height;
	}

	// 비교 로직: 면적이 같으면 동등한 사각형으로 판단하는 조건
	// 오버라이드 메서드
	@Override
	public boolean equals(Object obj) {

		if (obj instanceof Rectangle) {
			Rectangle other = (Rectangle) obj; // casting해서 other로 할당되고

		//1)	return area() == other.area();// 이 코드로 적어주기 놓침..
			// 기존area와 새로 세팅해주고 할당된area값을 비교한것을 리턴위해 아더로 캐스팅해주는것
		
		
		
		}

		return super.equals(obj);
	}

	// toString() 객체정보를 문자열로 출력
	@Override
	public String toString() {
		return "Rectangle[ width=" + width + ", height= " + height + "]";
	}

}
