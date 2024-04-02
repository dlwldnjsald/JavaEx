package com.javaex.api.stringclass;

public class StringBufferEx {

	public static void main(String[] args) {
		//String은 불변, immutable,
		//StringBuffer는 내부에 버퍼를 두고, 버퍼에서 작업
		//최종 소비되는 시점에서 문자열로 반환
		//메모리 관리 축변에서 String보다 유리
		
		//버퍼 생성 
		StringBuffer sb = new StringBuffer("This");   		// This라는 10개짜리 버퍼 생겨남 
		System.out.println(sb);				//추가는 append 삽입은 insert 변경은 replace 제거는 remove 소환
		
		
		

	}

}
