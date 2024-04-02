package com.javaex.api.arrays;

import java.util.Arrays;
import java.util.Collections;

public class SortEx {

	public static void main(String[] args) {
//		
//		
		//1. 기본 소팅(기본 정렬)
//		basicSort();
		
		//2. 역순 정렬
		basicDescSort();
		
		//3. 사용자 정의 클래스 정렬
		customClassSort();
		

	}//===============================================================
	
	@SuppressWarnings("unused")//사용할땐 이것 삭제하고 위의 선언한것 주석해제후 사용가능
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
		Integer[] scores = { 80, 50, 30, 90, 75, 88, 77 };	//여기서 int[]안되고 Integer[]해야 하는 이유
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
		//사용자 저의 클래스의 정렬
		Member[] members = {			//Member라는 클래스 호출
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