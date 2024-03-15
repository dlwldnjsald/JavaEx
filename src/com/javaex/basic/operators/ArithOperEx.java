package com.javaex.basic.operators;

public class ArithOperEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 산술연산
//	    arithOperTest();
	
		//증강연산(디버거 써보기)
	   incrOperTest();
	    
		//할당연산
	    assignOperTest();
	    
	}
	
	
	public static void assignOperTest() {
		// = : 우선순위 가장 마지막
		int a = 7;
		int b = 3;
		
		a = a + b;
		System.out.println(a);     // 10
		a += b; //+=표시는 확장 할당 연산 ->산술,논리연산같은데 모두 쓰임.
		System.out.println(a);     // 13
		// a++    =   a += 1 과 같은
	
	}
	

	 public static void incrOperTest() {
    	 int a = 10;
    	 int b;
    	 
    	 System.out.println(a);
    	 b = ++a; //할당된 직후 증가가 된것.
    	 System.out.println(b);
    	 System.out.println(a);
    	 
    	 a = 10; // 원상 복구
    	 System.out.println(a);
    	 b = a++; //먼저 증가된 후 할당된것
    	 System.out.println(b);
    	 System.out.println(a);
    	 
     }
	
		
		public static void arithOperTest() {
			int a = 7;
			int b = 3;
			
			//부호연산 (+, -)
			System.out.println(-a);
			System.out.println("----------");
			
			//사칙연산 (+, -, *, /, % )
			System.out.println(a + b); //10
			System.out.println(a - b); //4
			System.out.println(a = b); //21
			System.out.println(a / b); //2
			System.out.println(a % b); //1
			System.out.println("----------");

			//정수의 나눗셈은 정수
			System.out.println(a / b); //2
			System.out.println((float)a / (float)b); //  7.0 / 3.0 
			//float를 굳이 a,b 둘다 붙일 필욘 없고 a나 b 앞에 붙여주면 됨
			System.out.println((float)a / b);  //  7.0 / 3
			
			
	}

}

