package com.javaex.api.objectclass.circle;

import com.javaex.api.objectclass.rectangle.Rectangle;

public class Circle {
	
	//필드 생성
	int x;
	int y;
	int radius;
	
	//생성자
	public Circle(int x, int y, int radius) {
		super(); 			//super() 불러오기 // 이부분을 놓침..??
		this.x = x;
		this.y = y;
		this.radius = radius;
		
	}// 이 블록 꼭 놓치기 말기 주의
	
	//동등성 조건 : 반지름이 같으면 동등하다를 적용하기
	//equals() 오버라이드 메서드 작성 
		@Override
		public boolean equals(Object obj) {
			if (obj instanceof Circle) {
				Circle other = (Circle) obj;
				
				return radius == other.radius;// 선생님의 코드 이코드 부분이 어려웠음...
			}
		
			return super.equals(obj);
			
		}
		
		//toString() 객체정보를 문자열로 출력하는 메서드 작성
		@Override
		public String toString() {
			return "Circle [x=" + x + ", y=" + y + ", radius=" + radius + "]" ;
		}
		
	}