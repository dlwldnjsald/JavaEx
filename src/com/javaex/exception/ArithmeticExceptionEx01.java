//ArithmeticExceptionEx



//package com.javaex.exception;
//
//public class ArithmeticExceptionEx01 {
//
//	public static void main(String[] args) {
//		
//		
//		int[] intArray = new int[]{3,6,9};
//		
//		
//		System.out.println(intArray[3]);-> 여기서 [3]부분에서 에러 발생
//		//출력문 실행 ->인덱스 3번째의 데이터값을 출력하겠다?고하는데 
		//위의 intArray 배열의 인덱스는 0,1,2번째의의 3개공간만 존재함 (length==3)
//
//	}
//
//} 


package com.javaex.exception;

public class ArithmeticExceptionEx01 {

	public static void main(String[] args) {
		
		//intArray라는 이름의 정수형 배열 선언후 할당(초기화)-------------------
		int[] intArray = new int[]{3,6,9};	
		
		//try 문-----------------------------------------------------///
		try {
			System.out.println(intArray[3]);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.err.println("Error: " + e.getMessage());
			
		} finally {
			System.out.println("예외 처리 종료!");
		}
		
		
		
		
	}

}