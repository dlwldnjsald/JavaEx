//0325

package com.javaex.oop.point.v2;

//v2. 기본 생성자, 모든 필드 생성자
public class Point {
//	필드 (은닉)
private int x;
private int y;

//	생성자
public Point() {
	
}

public Point(int x, int y) {
	this.x = x;
	this.y = y;
}

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

//	일반 메섣
public void draw() {
	System.out.printf("점[x=%d, y=%d]을 그렸습니다.%n",
			x, y);
}

}
