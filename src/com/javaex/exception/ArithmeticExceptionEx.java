//package com.javaex.exception;
//
//import java.util.Scanner;
//
//public class ArithmeticExceptionEx {
//		//정수 1개 입려
//		//100을 입력받은 정수로 나눔
//		//나눗셈 결과를 화면에 출력
//	
////스캐너 import
//	
//	public static void main(String[] args) {
//		//변수 선언----------------------------
//		double result;
//		int num;
//		
//		
//		//스캐너 열기--------------------------
//		Scanner scanner = new Scanner(System.in);	
//		
//		
//		//프롬프트 입력-------------------------
//		System.out.print("정수 입력: ");       		
//		
//		
//		//100을 입력받은 정수로 나눔---------------
//		num = scanner.nextInt();
//		result = 100/num;			// 0입력후 실행시 이부분에서 예외가 발생되었다는 문구로 알려주는 에러 발생 
//		
//		
//		//나눗셈 결과를 화면에 출력----------------
//		System.out.println(result);
//		
//		
//		//스캐너 닫기---------------------------
//		scanner.close();
//
//	}
//
//}


//package com.javaex.exception;
//
//import java.util.Scanner;
//
//public class ArithmeticExceptionEx {
//		//정수 1개 입려
//		//100을 입력받은 정수로 나눔
//		//나눗셈 결과를 화면에 출력
//	
////스캐너 import
//	
//	public static void main(String[] args) {
//		//변수 선언----------------------------
//		double result = 0; 	//선언 및 초기화(할당)
//		int num;
//		
//		
//		//스캐너 열기--------------------------
//		Scanner scanner = new Scanner(System.in);	
//		
//		
//		//프롬프트 입력-------------------------
//		System.out.print("정수 입력: ");       		
//		
//		
//		//예외 발생 가능영역을 try 블록으로 감싸기-----------가장 쉬운 방법이긴 한 아래 코드---------------///
//		try { 	 
//			num = scanner. nextInt();
//			result = 100/num;
//		
//        예외 (정보) 클래스로 catch------------------------------------------------------------///
//		} catch (Exception e) {	

//          //예외 스택 출력--------------------------
//			e.printStackTrace();			
//			
//			-------------------------------------------------------------------------------///
//		} finally {
//			//예외 유무 관계 없이 가장 마지막에 1회 실행
//			//try 블록에서 설정된 시스템 자원 등을 해제할때
//			//필수가 아닌 선택 옵션
//		}
//			-------------------------------------------------------------------------------///		

////		//100을 입력받은 정수로 나눔-------------------
////		num = scanner.nextInt();
////		result = 100/num;			// 0입력후 실행시 이부분에서 예외가 발생되었다는 문구로 알려주는 에러 발생 
////		
//		
//		//나눗셈 결과를 화면에 출력----------------
//		System.out.println(result);
//		
//		
//		//스캐너 닫기---------------------------
//		scanner.close();
//
//	}
//
//}



//package com.javaex.exception;
//import java.util.Scanner;		//스캐너 import
//
//public class ArithmeticExceptionEx {
//		//정수 1개 입려
//		//100을 입력받은 정수로 나눔
//		//나눗셈 결과를 화면에 출력
//	public static void main(String[] args) {
//		//변수 선언----------------------------
//		double result = 0; 	//선언 및 초기화(할당)
//		int num;
//		
//		
//		//스캐너 열기--------------------------
//		Scanner scanner = new Scanner(System.in);	
//		
//		
//		//프롬프트 입력-------------------------
//		System.out.print("정수 입력: ");       		
//		
//		
//		
//		//예외 발생 가능영역을 try 블록으로 감싸기-----------구체적인 방법 아래 코드----
//		try { 	 
//			num = scanner. nextInt();
//			result = 100/num;
//		
//			//100% ArithmeticException 에 대한 구체적 예외 처리만 명령할시----------------------/// 	
//			//구체적인 예외 처리 로직 수행 가능---------------------------
//		} catch (ArithmeticException e) {	
//			
//			// 고객위해 더 구체적인 프라블럼 제시위해 출력.------------------///
//			System.err.println( "0으로는 나눌 수 없습니다."); 
//		
//		//-//예외 (정보) 클래스로 catch --------------------------------------------------------
//		} catch (Exception e) {	
//			
//			//예외 스택 출력 ----------------------------------------
//			e.printStackTrace();			
//			
//		} finally {		//------------------------------------------------------------------
//			//예외 유무 관계 없이 가장 마지막에 1회 실행
//			//try 블록에서 설정된 시스템 자원 등을 해제할때
//			//필수가 아닌 선택 옵션
//		
//			//예외처리 종료됨을 출력-----------------------------------
//			System.out.println("예외처리 종료.");
//		}
//				
//		
//		
//		//나눗셈 결과를 화면에 출력-----------------------------------------------------------------
//		System.out.println(result);
//		
//		//스캐너 닫기----------------------------------------------------------------------------
//		scanner.close();
//
//	}
//
//}

package com.javaex.exception;

//InputMismatchException; import하기------------------------------------------------------///
import java.util.InputMismatchException;

//스캐너 import---------------------------------------------------
import java.util.Scanner;		

//--------------------------------------------------------------
public class ArithmeticExceptionEx {
		//정수 1개 입려
		//100을 입력받은 정수로 나눔
		//나눗셈 결과를 화면에 출력
	public static void main(String[] args) {
		//변수 선언----------------------------
		double result = 0; 	//선언 및 초기화(할당)
		int num;
		
		
		//스캐너 열기--------------------------
		Scanner scanner = new Scanner(System.in);	
		
		
		//프롬프트 입력-------------------------
		System.out.print("정수 입력: ");       		
		
		
		
		//예외 발생 가능영역을 try 블록으로 감싸기-----------구체적인 방법 아래 코드-------
		try { 	 
			num = scanner. nextInt();
			result = 100/num;
			
			//앞쪽에서 구체적 에러 처리-----------------------------------------------------///
			//가장 마지막에 Exception으로 잔여 에러 처리-
		} catch (InputMismatchException e) {
			
			//입력형식 에러//고객위해 더 구체적인 프라블럼 제시위해 출력.-----///
			System.err.println("정수로 입력해주세요");
			
			
			//100% ArithmeticException 에 대한 구체적 예외 처리만 명령할시----------------------- 	
			//구체적인 예외 처리 로직 수행 가능-
		} catch (ArithmeticException e) {	
			
			// 고객위해 더 구체적인 프라블럼 제시위해 출력.---------------
			System.err.println( "0으로는 나눌 수 없습니다."); 
		
		//-//예외 (정보) 클래스로 catch ------------------------------------------------------		} catch (Exception e) {	
			
			//예외 스택 출력 --------------------------------------
			e.printStackTrace();			
			
		} finally {		//----------------------------------------------------------------
			//예외 유무 관계 없이 가장 마지막에 1회 실행
			//try 블록에서 설정된 시스템 자원 등을 해제할때
			//필수가 아닌 선택 옵션
		
			//예외처리 종료됨을 출력------------------------------------------------------------
			System.out.println("예외처리 종료.");
		}
				
		
		
		//나눗셈 결과를 화면에 출력--------------------------------------------------------------
		System.out.println(result);
		
		//스캐너 닫기-------------------------------------------------------------------------
		scanner.close();

	}

}



