package com.javaex.collection.list;

import java.util.Enumeration;
import java.util.Vector;	//벡터 임포트

public class VectorEx {

	public static void main(String[] args) {
		
		// vector 선언
		// 벡터는 모든 객체(object)을 담을 수 있는 컬렉션 객체
		//.elementAt 등 참조를 위해서 실제 클래스로 Casting 해줘야 한다
		
		Vector v = new Vector();	//기본 벡터 버퍼 용량은 10이다
		//출력으로 확인해보기 
		System.out.println("Size:" + v.size() + ", Capacity:" + v.capacity()); //size=0 capacity=10이라하는것 출력됨
		System.out.println();
		
		
		//for문 루프를 이용하여 data 담기
		for (int i = 0; i < 10; i++) {
			//요소 추가하기 ㅁaddElement 사용
			v.addElement(i);			//auto boxing 감지하기
		}
		//출력 확인해보기
		System.out.println("Size:" + v.size() + ", Capacity:" + v.capacity());
		System.out.println();
		
		
		//허용량 초과해서 담아보는 경우 확인해보기
		v.addElement(10);
		System.out.println("Size:" + v.size() + ", Capacity:" + v.capacity());		//Size:11, Capacity:20 로 출력됨
		System.out.println();
		
		
		// 조회: 특정 위치에 있는 객체 참조 :elementAt
//		int val = v.elementAt(5); // 오브젝트를 반환하는 elementAt 을 int로 할당하려니 오류가 난다 
		Integer val = (Integer)v.elementAt(5);	//그래서 다시 casting화로 변경해준뒤
		System.out.println(".elementAt(5):" + val);	//출력
		System.out.println();
		
		
		//역참조 (검색)
		//객체의 인덱스 조회
		System.out.println(".indexOf(5):" + v.indexOf(5));
		System.out.println(".indexOf(20):" + v.indexOf(20)); //없는 객체 인덱스는 -1로 출력이 되는것 확인할수 있다
		System.out.println();
		
		
		//객체 포함 여부: .contains 
		System.out.println(".contains(7):" + v.contains(7));	//7을 포함하고 있으니 true로 출력될것
		System.out.println(".contains(20):" + v.contains(20));  //20을 포함하고있지 않으니 false로 출력될것
		System.out.println();
		
		
		//객체 삭제 : .removeElement
		v.removeElement(7);										// 7이 삭제가 되고 널값이 될테니 하나씩 땡겨질것.
		
		for (int i = 0; i < v.size(); i++) {
			Integer item = (Integer)v.elementAt(i);
			System.out.println(item + " ");
		}
		System.out.println("===============enumeration");
		
		
		//컬렉션 프레임워크에서는 루프의 개선이 필요하다 
		Enumeration e = v.elements();
		while(e.hasMoreElements()) {
			//뒤쪽에 요소가 더 있는가?
			Integer item = (Integer)e.nextElement();
			System.out.println(item + " ");
		}
		System.out.println();
		
		
		//TODO: 루프 방식 개선
		System.out.println("-------------------------");
		System.out.println("Size:" + v.size() + ", Capacity:" + v.capacity()); 	//하지만 capacity 부분은 20으로 줄어들지 않고 남아있ㄷ
		//Size:10, Capacity:20로 최종 출력됨
		System.out.println();
		
		
		//버퍼 비우기
		v.clear();
		System.out.println("v=" + v);
		System.out.println("Size:" + v.size() + ", Capacity:" + v.capacity());
		
		
		System.out.println();
		System.out.println("======================================");
		
		
		//Generic을 사용하여 코드 개선 가능
		//예) Number를 상속한 모든 객체를 담을 수 있는 Generic을 사용
//		Vector<Integer> v1 = new Vector<>();				//v1에는 오로지 integer만 들어갈수 있다 
		Vector<? super Number> v2 = new Vector<>();			//Number를 상속받은 클래스만 저장 가능하다
		v2.addElement(Integer.valueOf(2024));				//담길수 있음
		v2.addElement(Float.valueOf(3.14159f));				//담길수 있음
//		v2.addElement("Vector");							//String 은 Number 를 상속받지 않은 객체므로 담길수 없다	
		
		
		Enumeration<? super Number> e2 = v2.elements();
		while(e2.hasMoreElements()) {	//뒤에 요소가 더 있나?
			System.out.println(e2.nextElement());
		}
		
		
		
	}

}
