package com.javaex.objectclass.ex03;

public class CloneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//객체 생성------------------------------------///
		Point p = new Point(10,20);
			System.out.println("p=" + p);
		
		//객체 복사------------------------------------///
		Point p2 = p;    //참조 복제 (주소만 복제한 상태)주소가 같아서 데이터값도 동일..
			
		//얕은 복제------------------------------------///
		Point p3 = p.getClone();
		
		System.out.println("p2=" + p2);
		System.out.println("p=3" + p3);
		
		System.out.println();
		
		
		//p의 내부 필드 변경하는 경우,,--------------------///
		p.setX(30); p.setY(100);	//p에 x,y에 30,100을 셋하고 아래에 출력시 
		
		System.out.println("p=" + p);
		System.out.println("p2=" + p2);
		System.out.println("p3=" + p3);
		
		//참조 복제는 실제로는 같은 객체다
		//데이터 보호를 위해서는 참조 복제는 피하는것이 좋다.
	}

}
