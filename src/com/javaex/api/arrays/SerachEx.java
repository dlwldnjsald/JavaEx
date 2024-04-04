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
		
		// Java Arrays 의 search 검색 기능은 binarySearch 방식으로 구현되있다
		int[] nums = {6, 4, 3, 5, 7, 9, 8, 2, 1, 10};
		
		
		Arrays.sort(nums);								// 이진 검색 방식의 배열은 정렬이 되어 있어야 한다.
		System.out.println("정렬된 배열: " + Arrays.toString(nums)); 
		
		int index = Arrays.binarySearch(nums,8); 		//검색대상배열 정렬된 num 에서 8이란 데이터값의 인덱스번호 찍기
		System.out.println("8의 인덱스: " + index);
		System.out.println();
		
		//--------혼자 프랙티스-----보고 해보기------
		int[] me1 = {3,45,6,7,8,9,0,-1,3,5,7};
		
		
		Arrays.sort(me1);
		System.out.println("정렬된 배열 nums1:" + Arrays.toString(me1));
		
		int index1 = Arrays.binarySearch(me1, 7);
		System.out.println("nums1 배열의 7의 인덱스: " + index1);
		System.out.println();
		//--------혼자 프랙티스-------안보고 해보기 -실패 한번더...-
		
		Double[] me = { 3.14, 10e3, 30.00088888, 3.141, 46434.46345345, 0.00000000353e10};
		
		Arrays.sort(me);
		System.out.println("me의 정렬된 배열:" + Arrays.toString(me));
		
		int me2 =  Arrays.binarySearch(me, 3.141);
		System.out.println("me2 배열의 3.141의 인덱스:" + me2);
		
		
		System.out.println("=======================================");
		
		
		
				
		//참조 타입의 검색---------------------------------------------
		String[] data = {"Java", "C", "C++", "Python", "Linux"};
		
		//검색을 위한 정렬
		Arrays.sort(data);								
		System.out.println("정렬된 배열: " + Arrays.toString(data));
		System.out.println();
		
		index = Arrays.binarySearch(data, "Java");		//검색대상배열 정렬된 data 에서 "Java"데이터값의 인덱스번호 찍기
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
