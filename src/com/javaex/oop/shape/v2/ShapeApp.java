package com.javaex.oop.shape.v2;

public class ShapeApp {

	public static void main(String[] args) {

//		Shape s = new Shape(); // 추상 클래스의 직접 객체화는 불가하다 
		
		
		//추상 클래스를 상속받은 클래스는 직접 객체화 가능하다
		Circle c = new Circle(10, 20, 30);
		c.draw();
		
		Rectangle r = new Rectangle(10, 20, 100, 500);
		r.draw();
		
		///--------------------------------------
		Point p = new Point(100,200);	//위의 circle,rec과 연관x
		p.draw();
		
//-circle, rectangle -> shape의 서브클래스
//point -> shape의 서브클래스가 아님 (관계가 없다)
//Circle, rectangle, point -> drawable라는 공통된 인터페이스를 지니고있다
		
		//드로우의 배열 만들기------------------------
		Drawable objs[] = new Drawable[] {
				r, c, p
		};
		
		for (Drawable obj: objs) {
			if (obj instanceof Drawable) {
				//특정 인스턴스가 Drawable 인터페이스의 구현인가?
				obj.draw();
			}	
			
		}
		
		
		
		
	}

}
