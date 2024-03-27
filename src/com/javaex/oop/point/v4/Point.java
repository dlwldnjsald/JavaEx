package com.javaex.oop.point.v4;

/*
 *[문제]

– Point 클래스를 만드세요.

✓생성자, getter/setter, draw()

– Point 클래스를 상속받아 ColorPoint 클래스를 만드세요.

✓생성자, getter/setter, draw()



– PointApp 클래스를 통해서 인스턴스를 생성하고 showInfo()를 통해 확인하세요.

✓Point p = new Point(4,4);

✓ColorPoint cp1 = new ColorPoint(“red”);

✓ColorPoint cp2 = new ColorPoint(10,10,“blue”);



– 자식 클래스와 부모클래스의 생성자 순서를 확인하세요
 */

//v4. 상속연습
/*
1) 먼저 패키지 내에서 우클릭후 칼라포인트라는 클래스 하나 생성하기



*/
public class Point {
//	필드 (은닉)
//private int x;
//private int y;   //좌표 필드 두개 (1)
	protected int x;  //(2)프로텍티드로 변경시
	protected int y;

//--------------------------------------------
//public Point() {
//	
//}                  //기본생성자?

public Point(int x, int y) {
	this.x = x;
	this.y = y;
}								//생성자					

//-------------------------------------------
//	getters/setters
public int getX() {
	return x;
}
public void setX(int x) {
	this.x = x;
}
public int getY() {
	return y;
}
public void setY(int y) {
	this.y = y;
}
//---------------------------------------------
//	일반 메서드
public void draw() {
	System.out.printf("점[x=%d, y=%d]을 그렸습니다.%n",
			x, y);
}

//	메서드 오버로딩
//		boolean bDraw -> true면 그렸습니다. -> false면 지웠습니다.
public void draw(boolean bDraw) {
	String message = String.format("점[x=%d, y=%d]을 ", 
			x, y);
	message += bDraw ? "그렸습니다." : "지웠습니다";
	System.out.println(message);
}

}
