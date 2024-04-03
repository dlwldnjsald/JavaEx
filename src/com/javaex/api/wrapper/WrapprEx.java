package com.javaex.api.wrapper;

public class WrapprEx {

	public static void main(String[] args) {
		// Wrapper 클래스
		//	-기본 타입을 포장하여 객체 형태로 저장하는 클래스 (포장클래스)

		// 생성
		Integer i = new Integer(10);  		//deprecated-> 빠른 시간내 바꾸라는 경고메세지 (경고를 넘기지말기)
		Character c = new Character('c');	//deprecated: 이 방식은 더이상 사용하지 말자라는 뜻
		
		//new방식 보단 .valueOf static 메서드로 생성하기
		Float f = Float.valueOf(3.14159f);
		Boolean b = Boolean.valueOf(true);
		//기본 타입에 대응한 WrapperClass가 있다 
		
		//문자열로 된 데이터를 기본 데이터 타입으로 포장하는 방법
		Integer i2 = Integer.valueOf("2024"); //전달받은 데이터가 숫자형태로 되어있지만 숫자가 아닌 문자열.// i2-숫자로 전달받게 됨
		Double d2 = Double.valueOf("3.14159");
		Boolean b2 = Boolean.valueOf("false");
				
		//주의 : 전달되는 파라미터의 문자열 형태가 해당하는 데이터타입 기본형의 형태와 동일해야 한다
		//Integer i2 = Integer.valueOf("a024");//이경우 변환이 안됨 a때문
		
	
	}

}
