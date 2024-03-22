//0322

//// * 가변인수
//-메소드의 매개 변수의 개수를 알 수 없을 때 사용
//-가장 간단한 해결방법은 매개변수를 배열로 선언하는 것
//double sum(double[] values) { }
//
//이러한 경우, 메소드 호출시 배열을 넘겨주어 여러 개의 값을 전달할 수 있다
//double[] numbers= { 1, 2, 3, 4, 5 };
//double result = sum(numbers);
//double result = sum(new double[] { 1, 2, 3, 4, 5 });
//
//방법 2: 매개 변수를 ... 를 이용하여 선언
//자동으로 배열이 생성되고 매개값으로 사용된다
//double sum(double ... values) { }
//
//double result = sum(1, 2, 3, 4, 5 );
//// * 


package com.javaex.oop.methods;

public class MethodsEx2 {
		// 가변인수 : 정해지지 않은 개수의 인수가 넘어올 때
	public static void main(String[] args) {
		// 방법 1 : 배열로 전달하는 방법
		System.out.println("getSumArr: " 
							+ getSumArr(new double[]{1,2,3,4,5,6,7,8,9,10}));
		
		// 방법 2 : 가변인수 사용법
		System.out.println("getSumVar: " 
							+ getSumVar(1,2,3,4,5,6,7,8,9,10));
		
		//3)고정 인수와 가변 인수를 같이 사용  
		printSum("합계: ",1,2,3,4,5,6,7,8,9,10);
		
	}
	//==============================================================
	
	// 1.배열을 이용한 여러 개의 데이터 전달
	private static double getSumArr(double[] values) {
		double total = 0;
		
//		for(int i = 0; i < values.length; i++) {
//			total += values[i];
//		}
		
		for (double val: values) {
			total += val;
			
		}
		
		return total;
	};//===========================================================
	//2.
	private static double getSumVar(double ... values) {
		double total = 0;
		
		for (double val: values) {
			total += val;
		}
		return total;
	}//===========================================================
	
	//3)고정 인수, 가변 인수 선언
	public static void printSum(String message, double ... values) {
		System.out.println(message + getSumVar(values));
		
		
	}//============================================================
	
	
}












