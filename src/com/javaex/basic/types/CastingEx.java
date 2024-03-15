package com.javaex.basic.types;

public class CastingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         //Type Casting 형 변환
        
    //암시적 형 변환 (자동 타입 변환: Promotion)
        // 자료의 범위가 좁은 자료형에서 넓은 자료형으로의 변환은 시스템이 자동으로 행함
        //(작은박스에서 큰박스로 옮기는것 가능하다는 이야기)
    //명시적 형 변환 (강제 타입 변환: Casting)
		//자료의 범위가 넓은 자료형에서 좁은 자료형으로 변환은 프로그래머가 강제로 변환해야
         //이때, 자료의 유실이 일어날 수 있으므로 주의해야 함(주의)
		
		//암시적 캐스팅 (Promotion)
		promotionEx();
		///명시적 캐스팅 (Casting)
		castingEx();
	}
	
	public static void castingEx() {
		// 표현 범위가 넓은 자료형 -> 좁은 자료형으로의 변환
		// 데이터의 유실 위험 -> 반드시 강제 타입 변환이 필요
		double d = 1234567.890;
		System.out.println(d);
		
		float f = (float)d; // 8바이트 실수 -> 4 바이트 실수
		System.out.println(f);
		
		long l = (long)f; // 4바이트 실수 -> 8바이트 정수
		System.out.println(l);
		
		short s = (short)1; //  4바이트 정수-> 2바이트 정수
		System.out.println(s);
		
		
	}
	
	public static void promotionEx() {
		// 표현 법위가 좁은 자료형 -> 넓은 자료형으로만 변환
		// 암묵적으로 자동으로 캐스팅을 수행
		// byte -> short -> int -> long
		// ->float -> double
		byte b = 25; // 1 바이트 정수형
		System.out.println(b);
		
		Short s = (short)b;  //2 바이트
		System.out.println(s);
		
		int i = s;  //4 바이트
		System.out.println(i);
		
		long l = i;  //8 바이트
		System.out.println(l);
		
		float f = l; // 8바이트 정수 -> 4바이트 실수
		System.out.println(f);
		
		double d = f;  // 4바이트 실수 -> 8바이트 실수
		System.out.println(d);
		
		char ch = 'A' ;
		short s2 = (short)ch; // unsigned int (2) -> 2바이트 
		System.out.println(s2);
		
	}

}

//------------------------------------------
//

