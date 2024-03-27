package com.javaex.oop.point.v4;


//point클래스를 여기다 상속받아 사용하기 아래처럼 코드입력 //상속 extends 사용
public class ColorPoint extends Point {
	
	// 필드
	private String color;
	
	//---------------------------------------
	// 생성자
	//기본 생성자가 없으면 자바 컴파일러가 기본 생성자를 추가해서 컴파일한다 
	//public ColorPoint() {를 추가한다 ..
	//생성자에서 부모생성자를 호출하지 않으면 기본 부모 생성자를 호출한다 여기서 Super()를 호출한다..
	//포인트에 가보니 기본생성자가 없으면 오류가 남 (( public Point(){  ))
	
//	public ColorPoint(String color) {
//		this.color = color;
//	
		public ColorPoint(String color) { //에러가 나는 이유 :생성자 내에서 부모 생성자를 호출하지 않으면 부모의 기본 생성자를 호출한다
			//그래서 문제가 발생됨 . 
			//그래서 아래 작업이 필요
			super(0,0);     //초기 좌표값 0,0
			this.color = color;
					
		} 

		public ColorPoint (int x, int y, String color) {
			super(x,y);			//부모 생성자 호출
			this.color = color;
			
		}
		
//------------------------------------------------		
		//getter, setter
		public String getColor() {
			return color;	 //color를 돌려준다 리턴
		}
		
		public void setColor(String color) {   //리턴이 필요없으므로 void
			this.color = color;
		}
		
//--------------------------------------------------------------------------
		
		public void draw() {
			System.out.printf("색깔점[x=%d, y=%d, color=%s] 점을 찍었습니다.%n",
					x, y, color);//2) 아니면 point내 필드를 x,y좌표를 protected로 바꿔주면 된다
			
			//1)System.out.printf("색깔점[x=%d, y=%d, color=%s] 점을 찍었습니다.%n",
			//                     super.getX(), super.getY(), color); 
			//point가 갖고있는 x,y가 point클래스 내에서 프라이빗으로 선언되면 오류남
			//1)이렇게 첫번째 방법: getter 이용한 우회접근해도되고 	

		}
//--------------------------------------------------------------------------		
		@Override //현재 메소드가 오버라이드인지 확인
		//void draw (boolean) 오버라이트
		public void draw(boolean bDraw) {
			String message = String.format("색깔점[x=%d, y=%d, color=%s]을 ",
					x,y, color);
			
			message += bDraw ? "그렸습니다." : "지웠습니다" ;
				System.out.println(message);
			
		}
		
//-------------------------------------------------------------------------		
		
}























