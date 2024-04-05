package com.javaex.collection.hash;

import java.util.Arrays;
import java.util.HashSet;

//====================================클래스 Student 만들기===========================
class Student {
	//field
	int id;	//학생 id
	String name;	//이름
	
	//생성자
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	//getters.setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	//toString overrides //객체를 문자열로 변환할때의 출력형 메소드
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
}

//================================================================================

public class HashSetEx {

	public static void main(String[] args) {
		//1. HashSet 사용법(기본타입)
//		usingHashSet();
		
		//2. 집합 연산
//		setOperation();
		
		//3. HashSet 사용법(객체자료형)
		usingHashSetWithCustom();

	}


	private static void usingHashSet() {
		//선언
		HashSet<String> hs = new HashSet<>();
		
		//요소(객체) 추가
		hs.add("Java");
		hs.add("C");
		hs.add("C++");
		hs.add("Python");
		hs.add("Java");
		
		System.out.println("hs:" + hs);
		System.out.println("size:" + hs.size());
		System.out.println();
		
		
		//특정 객체 포함 여부
		System.out.println("C++ 포함?"+ hs.contains("C++"));
		System.out.println("Linux 포함?" + hs.contains("Linux"));
		
		System.out.println("hs:" + hs);
		System.out.println();
		
		
		//순서가 없음: 객체로 삭제하는 방법만 제공
		//객체 삭제
		hs.remove("C++");
		System.out.println("hs:" + hs);
		System.out.println();
		
	}
	//--------------------------------------------------------------------
	
	private static void setOperation() {
		//집합 연산
		HashSet<Integer> numbers = 
				new HashSet<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		System.out.println("전체집합:" + numbers);
		HashSet<Integer> odd =
				new HashSet<>(Arrays.asList(1,3,5,7,9));
		System.out.println("홀수집합:" + odd);	
		
		HashSet<Integer> evens=
				new HashSet<>(Arrays.asList(2,4,6,8,10));
		System.out.println("짝수집합:" + evens); 
		
		HashSet<Integer> mThree =
				new HashSet<>(Arrays.asList(3,6,9));
		System.out.println("3의배수집합:" + mThree); 
		
		
		
		System.out.println();
		System.out.println("-------------교집합-----------");
		//교집합 : retainAll
		//원본 보호를 위해 복제: clone하기
		HashSet<Integer> setA =(HashSet<Integer>)odd.clone();
		HashSet<Integer> setB =(HashSet<Integer>)mThree.clone();
		System.out.println("집합A:" + setA);
		System.out.println("집합B:" + setB);
		
		setA.retainAll(setB);	//집합 A 교집합B = {3,9}
		System.out.println("교집합:" + setA);
		
		System.out.println(setA.equals(new HashSet<Integer>(Arrays.asList(3,9))));
		
		
		
		System.out.println();
		System.out.println("-------------합집합-----------");
		//합집합: addAll
		 setA =(HashSet<Integer>)odd.clone();
		 setB =(HashSet<Integer>)evens.clone();
		System.out.println("집합A:" + setA);
		System.out.println("집합B:" + setB);
		
		setA.addAll(setB);
		System.out.println("합집합:" + setA);
		System.out.println(setA.equals(numbers));
		
		
		
		System.out.println();
		System.out.println("-------------차집합-----------");
		//교집합: removeAll
		setA =(HashSet<Integer>)numbers.clone();
		setB =(HashSet<Integer>)odd.clone();
		System.out.println("집합A:" + setA);
		System.out.println("집합B:" + setB);
		
		setA.removeAll(setB);
		System.out.println("차집합:" + setA);
		System.out.println(setA.equals(new HashSet<Integer>(evens)));
		
	}
	//--------------------------------------------------------------------

	private static void usingHashSetWithCustom() {
		
		HashSet<Student> hs = new HashSet<>();	//오직 Student만 관리할수있는 해쉬셋사용하기
		
		Student s1 = new Student(10, "홍길동");
		Student s2 = new Student(20, "홍길동");
		Student s3 = new Student(30, "고길동");	//s3과 s4를 비교해보자.
		Student s4 = new Student(30, "고길동"); 	//데이터는 같은데 왜 다른 객체로 인식?
		
		hs.add(s1); hs.add(s2)	;hs.add(s3)	;hs.add(s4);
		
		System.out.println("학생부:" + hs);
		System.out.println(s3.equals(s4));	//new통	통한 다른 객체를 만들어주었기때문 /false
		
	
	
	}
		

}
