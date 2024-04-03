package com.javaex.api.arrays;

import java.util.Arrays;
import java.util.Collections;

//===================================================================
//	사용자 정의 클래스를 Sort 하고자 할때, Comparable 인터페이스를 구현 해야 한다.
class Member implements Comparable {

	//	필드
	String name;
	
	//	생성자
	public Member(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Member [name=" + name + "]";
	}
	
	@Override //compareTo()메서드 필요함 
	public int compareTo(Object o) {
		// 두 객체의 선후 관계를 비교해서 
		//	-1, 0, 1 return 
		//	비교 대상이 순서가 동일 : 0
		// 	순서가 작은 경우 : -1
		//	순서가 큰 경우 : 1
		if (o instanceof Member) {
			Member other = (Member)o;//	Member로 캐스팅 가능
			return name.compareTo(other.name);//대소 관계의 비교는 name 필드로 비교
			
			}
		return 0;
		}
	
	}





//======================================================================

public class SortEx {

	
	public static void main(String[] args) {
//		
//		
		//1. 기본 소팅(기본 정렬)
		basicSort();
		
		//2. 역순 정렬
		basicDescSort();
		
		//3. 사용자 정의 클래스 정렬
		customClassSort();
		

	}//===============================================================
	
	
	private static void basicSort() {
		
		int[] scores = { 80, 50, 30, 90, 75, 88, 77 };
		System.out.println("배열 원본: " + Arrays.toString(scores));
		
		//오름차순 :작은숫자->큰숫자로 배열해주기 : Ascending (ex. A->Z)
		//내림차순 :큰숫자 ->작은숫자로 배열해주기 : Descending 
		
		//오름차순으로 정렬해보기
		Arrays.sort(scores);	//작은것->큰것 : 오름차순(ascending)
		System.out.println("오름차순 정렬: "+	Arrays.toString(scores));
		
		
		System.out.println();
	}	
		
	//=================================================================
	
	private static void basicDescSort() {
		Integer[] scores = { 80, 50, 30, 90, 75, 88, 77 };		//여기서 int[]안되고 Integer[]해야 하는 이유
		//객체 내부의	compararator로 객체의 선후관계를 규정해야 하기 때문에
		//프리미티브타입은 역순 정렬 될 수 없다. 주의
		System.out.println("배열 원본: " + Arrays.toString(scores));
		
		//내림차순으로 정렬해보기
		Arrays.sort(scores, Collections.reverseOrder()); //객체 대소 비교하는 로직이 들어있는 함수 메서드 
		System.out.println("내림차순 정렬: " + Arrays.toString(scores));
		
		
		System.out.println();
	}
	
	//=================================================================
	
	
	private static void customClassSort() {
		Member[] members = {
				new Member("홍길동"),
				new Member("고길동"),
				new Member("장길산"),
				new Member("임꺽정")
		};
		
		System.out.println("원본 배열:" + Arrays.toString(members));
		
		Arrays.sort(members);								//오름 차순
		System.out.println("오름차순 정렬:"	 + Arrays.toString(members));
		
		Arrays.sort(members, Collections.reverseOrder()); 	//내림 차순
		System.out.println("내림차순 정렬:"	 + Arrays.toString(members));
		
	}
	
	
	
}