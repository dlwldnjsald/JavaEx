package com.javaex.api.arrays;

import java.util.Arrays;

public class ArrayCopyEx {
	
	
	//배열 복제
	public static void main(String[] args) {
		char[] src = "Java Programming".toCharArray();
		System.out.println(src);
		System.out.println(Arrays.toString(src));	//	배열의 내용을 출력
		
		System.out.println();
		
		//--------------------
		char[] sonia = "Sonia loves Java Programming".toCharArray();
		System.out.println(sonia);
		System.out.println(Arrays.toString(sonia));
		
		//-----------------------
		System.out.println("===================================================");
		
		
		// system	을 이용한 copy
		char target[] = new char[src.length];
		System.arraycopy(src, 0, target, 0, src.length); // (원본배열,카피시작인덱스,타겟배열,타겟배열의복사시작위치인덱스,복사할 길이)
		System.out.println(target);
		System.out.println(Arrays.toString(target));	//	배열의 내용을 출력
		
		//-----------------------
		System.out.println("===================================================");
		
		
		// Arrays.copyOf를 이용한 copy
		target = Arrays.copyOf(src, src.length);		// (복사할 원본배열,복사할 길이)
		System.out.println(Arrays.toString(target));
		
		
		//-----------------------
		System.out.println("===================================================");
		
		
		//Arrays.copyOfRange: 범위 복제 
		target = Arrays.copyOfRange(src, 5,12);			//	(원본배열,카피시작인덱스,복사할 끝 인덱스)
		System.out.println(Arrays.toString(target));
		
		
	}

}
