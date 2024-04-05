package com.javaex.collection.list;

import java.util.Iterator;
import java.util.LinkedList; //import LinkedList
import java.util.List; //import List

public class ListEx {

	public static void main(String[] args) {
//		List l = new List(); //List는 클래스가 아닌 인터페이스므로 이 코드가 적용 안됨
		
		// 인터페이스는 주석과 같은 클래스 사용방법 메서드의 선언만 되어 있는 클래스 
		// List는 객체가 아닌 인터페이스
		// List 특징)1.순서가 있다. 2.중복을 허용한다
		List<String> lst = new LinkedList<>();   // string 으로 선언한 이후부턴 내부 데이터 타입이 string 으로 고정되는 제네릭
//		List<String> lst = new ArrayList<>();
		
		//객체 추가
		lst.add("Java");
		lst.add("C");
		lst.add("C++");
		lst.add("Python");
		
		System.out.println("lst=" + lst);
		System.out.println();

		
		//객체 삽입
		lst.add(2, "C#");
		System.out.println("1st=" + lst);
		System.out.println();

		
		//리스트는 중복 삽입을 허용
		lst.add("Java");
		System.out.println("1st=" + lst);

		System.out.println("size:" + lst.size());
//		System.out.println("capacity:" + lst.capacity());	//capacity는 확인 불가능
		System.out.println();
		
		
		//삭제 : 인덱스 삭제
		lst.remove(2);
		//객체 삭제
		lst.remove("Python");
		
		System.out.println("lst=" + lst);
		System.out.println();
		
		
		
		//TODO: List 순회
		//Set,List 순회시에는 Iterator 객체 사용
		System.out.println("============ Iterator");
		Iterator<String> it = lst.iterator();		//반복자 추출
		
		while(it.hasNext()) {	//뒤에 더 있음?
			String item = it.next();	//요소 추출후 다음으로 이동
			System.out.println(item + " ");
		}
		System.out.println();
		
		
		//비워보기
		lst.clear();
		System.out.println("lst=" + lst);
		
	}

}
