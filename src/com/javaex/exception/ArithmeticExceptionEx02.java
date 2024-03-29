
//package com.javaex.exception;
//
//public class ArithmeticExceptionEx02 {
//
//	public static void main(String[] args) {
//		
//			String str = new String("hello");
//			str = null;
//			System.out.println(str.toString());
//		}
//}

//======================================================================


package com.javaex.exception;

public class ArithmeticExceptionEx02 {

	public static void main(String[] args) {

		
		//str변수 선언 및 초기화(할당)-----------------
		String str = new String("hello");
		
		//str변수 null상태로 만들어서 연결끊어짐----------
		str = null;
		
		//try->예외가 발생가능영역을 try로 묶기--------------------------///
		try {
			System.out.println(str.toString());
			
		} catch (NullPointerException e) {
			System.out.println("널입니다.");
			
		} finally {
			System.out.println("예외 처리 종료!");
			
		}
		
	
			
	}

}
