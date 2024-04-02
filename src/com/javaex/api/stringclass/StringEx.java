package com.javaex.api.stringclass;

public class StringEx {

	public static void main(String[] args) {
		// 문자열 기본
		stringBasic();
		// 문자열의 다양한 메서드
		
		

	}//-----------------------------------------
	
	private static void stringBasic() {
		String s1 = "Java";		//리터럴 스트링 
		String s2 = new String("Java"); //힙 메모리상에 직접 객체 새롭게 생성됨
		String s3 = "Java";		//리터럴 스트링
		
		
		//literal String 리터럴 스트링과 new 객체 생성 스트링이 다르게 작동하는것을 알수 있다
		System.out.println(s1 == s2); 		//메모리 주소 비교 위한 코드 : Literal vs new/ false 로 나올것
		System.out.println(s1 == s3);		//Literal vs Literal/ true 로 나올것
		//리터럴의 경우, 데이터가 같으면 같은 객체로 취급한다 
		
	}

}
