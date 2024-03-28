package com.javaex.oop.shape.v1;

public class Rectangle extends Shape {

	
	//field 생성--------------------------------
	private int width;
	private int height;
	
	//생성자-------------------------------------
	public Rectangle(int x, int y, int width, int height) {
		super(x,y);
		this.width = width;
		this.height = height;
		
	}
	
	//부모가 올려준 추상 메서드 구현-------------------
	@Override
	public double area() {
		return width * height;   //사각형 면적 넓이를 구하는 메서드
	}
	
	@Override
	public void draw() {
		System.out.printf("사각형[x=%d, y=%d, w=%d,h=%d, area=%f]을 그렸습니다.%n" , 
				x,y,width,height,area());
	}
	
	
	
}
