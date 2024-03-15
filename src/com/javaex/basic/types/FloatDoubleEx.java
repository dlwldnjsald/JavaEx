package com.javaex.basic.types;

public class FloatDoubleEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// float (4 byte)
		// double (8 byte) - > default
		float floatVar;
		double doubleVar;
		
		// 정밀도 체크
		floatVar = 0.12345678901234567890f; // float 뒤에 f,F
		//이런 실수형 데이터를 입력했을대 더블 데이터로 판단하고 
		//이 더블 데이터를 플로트 바에 할당하려다 에러난것
		//이 자체를 플로트 형식이다를 알려주기 위해선 숫자 맨뒤에 f 알파벳을 표시해줘야함
		doubleVar = 0.12345678901234567890;
		
		System.out.println("float:" + floatVar); //+는 연결기호임 덧셈아님
		System.out.println("double:" + doubleVar);
		
		// E 표기법 주의
		int intVar;
		intVar = 300000000;
		floatVar = 3E9F; //(3 x 10의 9승이라는 뜻)
		doubleVar = 3E-9;
		
		System.out.println("intVar: " + intVar);
		System.out.println("floatVar: " + floatVar);
		System.out.println("doubleVar: " + doubleVar);
		
		// 부동 소수점 계산의 유의점
		// float, double 형은 정밀도 포기하고 표현 범위만 넓힌 데이터이다.
		System.out.println(0.1 * 3);
		
	}

}
