package com.javaex.oop.methods;

public class MethodEx {

	public static void main(String[] args) {
		// 4가지 케이스 구현해보기
		
//		1)매개변수 x, 리턴 x
//		printMessage();
		
		
//		2)매개변수 x, 리턴 o						
//		String message = getMessage();			//매개변수없지만 리턴은 있음	
//		System.out.println(message);			//출력
		
		
//		3)매개변수 o, 리턴 x
//		printDevice(4,0);						//매개변수 4, 0 있지만 리턴은 없음
		
		
//		4)매개변수 o, 리턴 o
		int num1 = 4, num2 = 5;					//매개변수 ㅇ
		
//		double sum = getSum(num1, num2);       //4-(1) 를 사용할경우
		double sum = getSum(num1, num2, 6);    //4-(2) 를 사용할경우
		
		System.out.println(sum);				//출력dfdffddf
	
		
	}
	
	//=메소드 구현하기========================================================================================
	//1)
	private static void printMessage() {
		//매개 변수 x
		//리턴    x  -> void 로 해줘야 리턴안됨 주의 /막혀있단 뜻 void 메서드 내에서 리턴을 하지 않아도 무방하다
		
		System.out.println("매개변수 없고, 리턴도 없는 메서드");
	}//1)끝나서 2)로 가는 루트
	
	//==============================================
	//2)
	private static String getMessage() {
		return "매개변수 없지만 리턴은 있는 메서드";
		
	}
	
	//=================================================	
	//3
	private static void printDevice(int num1, int num2) {
		//리턴타입이 없어도 return 할수있음
		//남은코드를 더이상 수행하지않고 제어를 돌려줄 때
		System.out.println("매개변수 있고, 리턴 없는 메서드");
		if(num2 == 0) {
			System.out.println("0으로는 나눌 수 없습니다.");
			return;
		}
		System.out.printf("%d / %d = %d%n", 
				num1,num2,num1 / num2);
	}
	
	//================================================
	//4-(1)
	private static double getSum(double num1, double num2) {
		System.out.println("매개변수 있고, 리턴도 있는 메서드");
		return num1 + num2;
		
	}
	
	//==================================================
	//4-(2)
	private static double getSum(double num1, double num2, double num3) {
		System.out.println("매개변수 있고, 리턴도 있는 메서드");
		return num1 + num2 + num3;
		
	}
	
	//==================================================

}	
	

