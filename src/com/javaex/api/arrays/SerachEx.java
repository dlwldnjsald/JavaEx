package com.javaex.api.arrays;

import java.util.Arrays;

public class SerachEx {

	public static void main(String[] args) {
		//  이진검색 :간격을 좁혀가면서 하는것 //?반드시 데이터가 정렬이 되있어야

		// 1. 기본 타입 검색
		basicSearch();
		
		
		// 2. 사용자 정의 객체의 검색
		
		
		
	}//==================================================================================

	private static void basicSearch() {
		
		// Java Arrays의 search검색기능은 binarySearch 방식으로 구현되있다
		int[] nums = {6, 4, 3, 5, 7, 9, 8, 2, 1, 10};
		
		
		Arrays.sort(nums);										// 이진 검색 방식의 배열은 정렬이 되어 있어야 한다.
		System.out.println("정렬된 배열: " + Arrays.toString(nums)); 
		System.out.println();
		
		int index = Arrays.binarySearch(nums, 8); //검색대상배열 num  에서 8의 인덱스 찍기
		System.out.println("8의 인덱스: " + index);
		
		
		
	}
	
	
	
	
}
