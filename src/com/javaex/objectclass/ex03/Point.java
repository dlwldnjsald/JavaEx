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
package com.javaex.objectclass.ex03;

//객체의 복제
//그중 얕은 복제: 필드의 값만 동일하게 복제한 것(프리미티브 타입일 경우)

public class Point implements Cloneable { // extends java.lang.Object가 생략된 것 임을 알수있다
	// 자바 Object 가 갖고있는 clone() method 를 사용하려면
	// Cloneable 인터페이스를 구현해야한다. 그래서 implements Cloneable 붙여주기
	
	// 필드
	private int x;
	private int y;

	// 생성자
	public Point(int x, int y) {
		// 생성자로부터 전달된 파라미터들을 내부 필드에 초기화
		this.x = x;
		this.y = y;
	}
	
	
	//getters.setters -> x,y값 겟셋해주기----------------------------///
	public int getX() {
		return this.x;	// 내부 필드를 외부로 전달
	}
	
	public void setX(int x) {
		this.x = x; 	//외부 파라미터를 내부 필드로 세팅
	}
	
	public int setY() {
		return this.y;
	}
	
	public void setY(int y) {
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
	
		}
		
		return super.equals(obj);		

	}
	
	
	//		toString() : 객체의 정보를 문자열로 출력할때 호출되는 메서드이다
	@Override
	public String toString() {
			return "Point(" + x + "," + y + ")";

	}
	
	//!!객체를 복제해서 새로운 point를 반환하는 메서드를 만들어보기------------///
	public Point getClone() {
		
		//새로 생성될 Point객체
		Point clone = null;
		
		//복제 시도
		//clone 메서드 반환 타입은 오브젝트 Object
		//clone = clone();//Object -> Point로 할당하려니 에러가 나는것
		//clone = (Point)clone();  //캐스팅해도 오류나는 경우 트라이 캐치로 예외처리하기
		try {
			clone = (Point)clone();		
		} catch (CloneNotSupportedException e) { 	//Clone이 불가능한 상황에 대한 예외처리
			
		}
		
		return clone;
		
	}

}


