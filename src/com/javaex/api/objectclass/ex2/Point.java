//public class Point {  
//private int x;                  //필드 데이터 x,y 2개 생성
//private int y;
//public Point( int x, int y ) {	//생성자 1
//this.x = x;
//this.y = y;
//}
//public boolean equals( Point p) {	// 내부값의 비교 equals()로 해보기
//if( x == p.x && y == p.y) {
//return true;
//} else {
//return false;
//}
//}
//}
//----------------------------------------------------------------
//public class LangClassTest {
//public static void main( String[] args ) {
//Point a = new Point(2, 3); 		//a라는 객체의 참조주소가 생길것이고
//Point b = new Point(2, 3);		//b라는 객체의 참조주소가 생길것 
//System.out.println( a == b );	//참조 주소의 비교한 결과 같지 않음으로 출력될것
//System.out.println( a.equals( b ) );
//}
//}
//
//// a==b가 아니므로
////a.x == b.x 
////a.y == b.y  가 모두 트루일때만 a==b가 성립하게 된다 (a.b의 서로의 x,y좌표가 같아야)
//
//
//practice//
package com.javaex.api.objectclass.ex2;

//두 객체의 내부 데이터의 같음을 확인하는 equals 메서드

public class Point { // extends java.lang.Object가 생략된 것 임을 알수있다

	// 필드
	private int x;
	private int y;

	// 생성자
	public Point(int x, int y) {
		// 생성자로부터 전달된 파라미터들을 내부 필드에 초기화
		this.x = x;
		this.y = y;
	}

	// equals : 두 객체의 내부 데이터가 같음을 확인하는 메서드
	//point에다 equals메서드 오버라이딩 해주기 // equals를 세팅 안해주면 비교값을 확인할수 없어 false로 출력되게 된다 주의
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Point) {		//전달받은 파라미터 obj가 point인지 instanceof로 확인하는 메서드
			Point other = (Point) obj;	//obj -> point로 캐스팅
//			
			return x == other.x && y == other.y; //두 객체의 동등성//두 객체의 x필드가 같고, 두 객체의 y필드가 같아야 동등하다고 판별할수 있다			
//			바로 윗줄의 코드를 대신 해서 풀어 써보면 아래와 같이 됨 (if-else문 사용)
//			if(x == other.x && y == other.y) {
//				return true;
//			} else {
////				return false;
//			}
//			
			
		}
		//obj 가 Point가 아님
		return super.equals(obj);		//부모에게 비교방법을 위임해서 리턴메소드 작성

	}
	
	
	//		toString() : 객체의 정보를 문자열로 출력할때 호출되는 메서드이다
	@Override
	public String toString() {
			return "Point(" + x + "," + y + ")";

	}

}


