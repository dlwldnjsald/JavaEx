//0322 practice note

package com.javaex.oop.methods;

public class MethodsPractice {

	public static void main(String[] args) {
		// 매개변수 x(입력x) & 리턴 x(출력x)
		// 문제1) 콘솔에 "Hello Method!'를 출력하는 메서드를 작성하세요.
		// 문제2) 1~10까지의 숫자를 콘솔에 출력하는 메서드를 작성하세요.
		printHelloMethod();
		printNumbers();
		
		// 매개변수 o(입력o) & 리턴 x(출력x)
		// 문제3) 0 -100 사이의 랜덤한 정수를 반환하는 메서드를 작성하세요
		int rnd = getRandomNumber();
		System.out.println(rnd);
		
		// 문제4) 1- 10까지 합 (55)을 반환하는 메서드를 작성하시오 
		int result =getSum();
		System.out.println(result);
	
		// 문제5) 정수를 하나 받아 그정수가 짝수인지 홀수인지를 콘솔에 출력하는 메서드 
		printOddOrEven(2024);
		
		//6번 문자열을 하나 받아 그 문자열의 길이를 콘솔에 출력하는 메서드 작성
		printStringLength("Java Programming");
		
		//7번 두 정수를 받아 큰수를 반환하는 메서드를 작성하세요
		int largeNumber = getLargeNumbr(10,20);
			System.out.println(largeNumber);
			
		//8번 문자열 두개를 받아 하나로 합쳐 반환하는 메서드를 작성하세요
			System.out.println(concatenateStrings("Java ", "Programming"));
			
		//9번 가변인자로 전달된 모든 정수의 힘을 반환하는 메서드 작성
			System.out.println(sumAll(1,2,3,4,5,6,7,8,9));
			
		//10.가변인자로 전달된 모든 문자열을 연결해서 반환하는 메서드 작성
			System.out.println(concatenateStrings("Java ", "Programming ", "is ", "fun!"));
		
	}

	//======================================================================================================
	private static void printHelloMethod() {  			//리턴해줄게 없으니 void로 막아주기, 입력이 없으니 ()비어있음
		System.out.println("Hello Method!");			//어차피 void때문에 리턴입력 불필요하고 콘솔 출력 코드로 출력
	 	
	}//-----------------------------------------------

	private static void printNumbers() {	//리턴해줄게 없으니 void로 막아주기, 입력이 없으니 ()비어있음
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + "\t");
		}
		System.out.println();
	} //-----------------------------------------------
	
	private static int getRandomNumber() {				//정수니까 리턴타입을 정수로 잡기
		int rnd = (int) (Math.random() * 101);
			return rnd;
	}//-----------------------------------------------
	
	private static int getSum() {                   //입력이 없으니 ()로 비어있음 표시하기
		// 계산된 정수 결국 int 불러주겠다는 뜻
		// 참조변수 결과변수가 필요하게 됨
		int result = 0;
		for(int i = 0; i <= 10; i++) {
			result += i;
		}
		return result;
	}//-----------------------------------------------
	
	public static void printOddOrEven(int value) {		//3항연산으로 풀어보기
		//3항 연산 : 조건식 ? 참일때의 값 : 거짓일때의 값
		System.out.println(value % 2 == 0 ? "짝수" : "홀수");
	}//-----------------------------------------------
	
	private static void printStringLength(String str) {
		System.out.println(str.length());						//문자열 길이재는 메서드
		
	}//-----------------------------------------------
	
	private static int getLargeNumbr(int num1, int num2) {
		if (num1 > num2) {
			return num1;
		}	else {
			return num2;
		}
		
	}//-----------------------------------------------
	
	private static String concatenateStrings(String str1, String str2) {
		return str1 + str2;
		
	}//-----------------------------------------------
	
	private static int sumAll(int ... values) {
		int total = 0;
			for(int val: values) {
				total += val;
			}
			return total;
	}//-----------------------------------------------
	private static String concatenateStrings(String ...values) {
		String result = ""; 							//문자열 변수 result를 "" 로 초기화
		
		for (String val: values) {
			result += val;
		}
		return result;
	}

	
}