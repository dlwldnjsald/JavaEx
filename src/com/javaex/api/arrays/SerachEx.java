package com.javaex.api.arrays;

import java.util.Arrays;

public class SerachEx {

	public static void main(String[] args) {
		//  이진검색 :간격을 좁혀가면서 하는것 //?반드시 데이터가 정렬이 되있어야

		// 1. 기본 타입 검색
		basicSearch();
		
		
		// 2. 사용자 정의 객체의 검색
		customClassSearch();
		
		
	}//==================================================================================

	private static void basicSearch() {
		
		// Java Arrays의 search검색기능은 binarySearch 방식으로 구현되있다
		int[] nums = {6, 4, 3, 5, 7, 9, 8, 2, 1, 10};
		
		
		Arrays.sort(nums);								// 이진 검색 방식의 배열은 정렬이 되어 있어야 한다.
		System.out.println("정렬된 배열: " + Arrays.toString(nums)); 
		System.out.println();
		
		int index = Arrays.binarySearch(nums, 8); 		//검색대상배열 num  에서 8의 인덱스 찍기
		System.out.println("8의 인덱스: " + index);
		
		System.out.println();
		System.out.println("=======================================");
		
		
		
		//참조 타입의 검색---------------------------------------------
		String[] data = {"Java", "C", "C++", "Python", "Linux"};
		
		//검색을 위한 정렬
		Arrays.sort(data);								
		System.out.println("정렬된 배열: " + Arrays.toString(data));
		System.out.println();
		
		index = Arrays.binarySearch(data, "Java");
		System.out.println("Java의 인덱스: " + index); 
		
		System.out.println();
		System.out.println("=======================================");
		
	}
	
	private static void customClassSearch() {
		
		Member m1 = new Member("홍길동");
		Member m2 = new Member("고길동");
		Member m3 = new Member("임꺽정");
		Member m4 = new Member("장길산");	
				
		Member[] members = {m1, m2, m3, m4};
		
		System.out.println("원본 배열: " + Arrays.toString(members));
		
		//binarySearch를 위한 정렬
		Arrays.sort(members);	
		System.out.println("정렬된 배열: " + Arrays.toString(members));
	
		int index = Arrays.binarySearch(members,m3);
		System.out.println(m3 + "의 인덱스:" + index);
	
	}
		
	
	
	
	
}
