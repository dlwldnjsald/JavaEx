package com.javaex.basic.operators;

public class ArithOperEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//할당연산
	    assignOperTest();
	    
		//증강연산(디버거 써보기)
		incrOperTest();
		
		// 산술연산
		arithOperTest();  
	}
	
	
	public static void assignOperTest() { //할당연산 해보기
		// = : 우선순위 가장 마지막
		int a = 7;
		int b = 3;
		
		a = a + b;
			System.out.println(a);     // 10
		a += b; //+=표시는 확장 할당 연산 ->산술,논리연산같은데 모두 쓰임.
			System.out.println(a);     // 13
			// a++ = a += 1 과 같은
	}
	

	 public static void incrOperTest() { //증강연산(디버거 써보기?)
    	 int a = 10;
    	 int b;
    	 
    	 	System.out.println(a);
    	 	
    	 b = ++a; //먼저 a에 1이 증가된 데이터를 b에 할당해주고 , a도 ++a이니 10에서 1추가된 합이 할당됨
    	 	System.out.println(b);
    	 	System.out.println(a);
    	 
    	    a = 10; // 원상 복구
    	 	System.out.println(a);
    	 
    	 b = a++; //먼저 a를 b에 할당해주고, a도 a=a+1로 할당됨
    	 	System.out.println(b);
    	 	System.out.println(a); 
     }
	
		
		public static void arithOperTest() { //산술연산인데 앞전에서 //화시켜서 이건 데이터 출력안됨
			int a = 7;
			int b = 3;
			
			//부호연산 (+, -)
			System.out.println(-a);
			System.out.println("----------");
			
			//사칙연산 (+, -, *, /, % )
			System.out.println(a + b); //10
			System.out.println(a - b); //4
			System.out.println(a * b); //21
			System.out.println(a / b); //2
			System.out.println(a % b); //1
			System.out.println("----------");

			//정수의 나눗셈은 정수
			System.out.println(a / b); //2
			System.out.println((float)a / (float)b); //  7.0 / 3.0 
			//float를 굳이 a,b 둘다 붙일 필욘 없고 a나 b 앞에 붙여주면 됨
			System.out.println((float)a / b);  //  7.0 / 3
			//부동소수로 표현하고 싶으면 (float)화 시켜주면 됨
		}

		
}// 클래스 닫기 }
