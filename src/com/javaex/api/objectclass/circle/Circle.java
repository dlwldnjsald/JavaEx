package com.javaex.api.objectclass.circle;

public class Circle {
	
	//필드 생성
	int x;
	int y;
	int radius;
	
	//생성자
	public Circle(int x, int y, int radius) {
		super(); 			//super() 불러오기 // 이부분을 놓침..??
		// 클래스는 객체화 되어야 사용 할수 있다
		//클래스를 객체화하려면 반드시 생성자를 거쳐야 한다.
		//생성자를 선언하지 않으면 자바 임의로 기본생성자를 추가한다
		//생성자를 선언하면 자바는 기본 생성자를 추가하지않는다.
		//모든 객체의 최상위에는 오브젝트가 있다. 
		//상속한다는것, 부모객체도 객체화가 된다.
		//부모객체도 생성자를 통해 객체화가 일어난다 
		//부모도 객체화를 해야되기 때문에 super()도 없어도 되는게 아니라 이게 없으면
		//자바가 임의로 기본생성자를 추가한다. (주석처리해도 (위의 super()코드) 오류는 없다)
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