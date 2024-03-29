package com.javaex.oop.shape.v2;


//추상클래스로부터 상속받을대는 extends 표기해주기		
//인터페이스 내의 모든 추상 메서드는 반드시 구현해야한다
public class Circle extends Shape implements Drawable {		//implements Drawable 키워드 추가
	
	//필드------------------------------------------------------------
	
	private double radius;		//radius 필드 만들기
	
	//생성자
	public Circle (int x, int y, double radius) {
		//부모 생성자 호출
		super(x,y);
		this.radius = radius;
	}
	
	
	//부모가 선언한 추상메서드는 반드시 구현해야 한다----------------------------
	@Override
	public void draw() {
		System.out.printf("원[x=%d, y=%d, r=%f, area=%f]을 그렸어요.%n", 
				x, y, radius, area());
	}
	//----------------------------------------------------------------
	@Override
	public double area() {
		double area = Math.PI + Math.pow(radius,2); //(파이 * r의 제곱) 의 식과 같은메소드
		return area;
	}
	
	//----------------------------------------------------------------
	//
	
	
	
	
	
	
	
	
	
}
